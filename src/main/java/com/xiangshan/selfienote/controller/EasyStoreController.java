package com.xiangshan.selfienote.controller;

import com.xiangshan.selfienote.biz.EasyStoreInterface;
import com.xiangshan.selfienote.pojo.commodity;
import com.xiangshan.selfienote.pojo.store;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/eStore")
public class EasyStoreController {

    @Autowired
    EasyStoreInterface easyStoreInterface;

    public Boolean isAccountExist(String account){
        return easyStoreInterface.isAccountExist(account);
    }

    @RequestMapping("/register")
    @ResponseBody
    public JSONObject register(String account, String password){
        JSONObject jsonObject = new JSONObject();

        Boolean isAccountExist =  isAccountExist(account);
        if(isAccountExist){
            jsonObject.put("isRegisterSuccess", false);
            jsonObject.put("isAccountExist", isAccountExist);
            return jsonObject;
        }


        Boolean isRegisterSuccess = easyStoreInterface.register(account, password);
        jsonObject.put("isRegisterSuccess", isRegisterSuccess);
        return jsonObject;
    }

    @RequestMapping("/login")
    @ResponseBody
    public JSONObject login(String account, String password){

        //如果这个OPENID已经注册了小程序，则直接返回登录成功，否则，现注册再返回登录成功
        Boolean isLoginSuccess = easyStoreInterface.login(account, password);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("isLoginSuccess", isLoginSuccess);
        return jsonObject;
    }

    //添加或修改已经有的数据
    @RequestMapping("/insertOrUpdateCommodity")
    @ResponseBody
    public JSONObject insertOrUpdateCommodity(String account, String commodityId, String commodityName, Double commoditySellPrice){
        int result = easyStoreInterface.insertOrUpdateCommodity(account, commodityId, commodityName, commoditySellPrice);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("result", result);
        return jsonObject;
    }

    @RequestMapping("/queryCommodityInfo")
    @ResponseBody
    public JSONObject queryCommodityInfo(String account, String commodityId){
        JSONObject jsonObject = new JSONObject();
        List<commodity> commodityList = easyStoreInterface.queryCommodityInfo(account, commodityId);

        if(commodityList.size() != 0){
            jsonObject.put("commodityName", commodityList.get(0).getName());
            jsonObject.put("sellPrice", commodityList.get(0).getSellprice());
            jsonObject.put("originalPrice", commodityList.get(0).getOriginalprice());
            jsonObject.put("isCommodityExist", true);
        }
        else {
            jsonObject.put("isCommodityExist", false);
        }
        System.out.println(jsonObject);

        return jsonObject;
    }

    @RequestMapping("/updateProfit")
    @ResponseBody
    public JSONObject updateProfit(String account, String profitDate, Double profit){

        Double todayProfit = easyStoreInterface.updateProfit(account, profitDate, profit);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("todayProfit", todayProfit);
        return jsonObject;
    }

    @RequestMapping("/getTodayProfit")
    @ResponseBody
    public JSONObject getTodayProfit(String account, String profitDate){
        Double todayProfit = easyStoreInterface.getTodayProfit(account, profitDate);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("todayProfit", todayProfit);

        return jsonObject;
    }

    @RequestMapping("/addSuccessQueryTimes")
    public void addSuccessQueryTimes(String account){
        easyStoreInterface.addSuccessQueryTimes(account);
    }

    @RequestMapping("/addFailQueryTimes")
    public void addFailQueryTimes(String account){
        easyStoreInterface.addFailQueryTimes(account);
    }
}
