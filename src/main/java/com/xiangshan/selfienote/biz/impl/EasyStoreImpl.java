package com.xiangshan.selfienote.biz.impl;

import com.xiangshan.selfienote.biz.EasyStoreInterface;
import com.xiangshan.selfienote.mappers.commodityMapper;
import com.xiangshan.selfienote.mappers.storeMapper;
import com.xiangshan.selfienote.pojo.commodity;
import com.xiangshan.selfienote.pojo.commodityExample;
import com.xiangshan.selfienote.pojo.store;
import com.xiangshan.selfienote.pojo.storeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EasyStoreImpl implements EasyStoreInterface {

    @Autowired
    commodityMapper commodityMapper;

    @Autowired
    storeMapper storeMapper;

    @Override
    public int insertOrUpdateCommodity(String account, String commodityId, String commodityName, Double commoditySellPrice) {
        List<commodity> list = queryCommodityInfo(account, commodityId);

        if(list.size() != 0){
            commodity commodity = list.get(0);
            commodity.setAccount(account);
            commodity.setCommodityid(commodityId);
            commodity.setName(commodityName);
            commodity.setSellprice(commoditySellPrice);
            commodity.setSellnumlastmonth(0);
            return commodityMapper.updateByPrimaryKeySelective(commodity);
        }
        else {
            commodity commodity = new commodity();
            commodity.setAccount(account);
            commodity.setCommodityid(commodityId);
            commodity.setName(commodityName);
            commodity.setSellprice(commoditySellPrice);
            commodity.setSellnumlastmonth(0);
            return commodityMapper.insert(commodity);
        }
    }

    @Override
    public List<commodity> queryCommodityInfo(String account, String commodityId) {
        commodityExample example = new commodityExample();
        example.createCriteria().andAccountEqualTo(account).andCommodityidEqualTo(commodityId);
        return commodityMapper.selectByExample(example);
    }

    @Override
    public Date getLastProfitDate(String account) {
        storeExample example = new storeExample();
        example.createCriteria().andAccountEqualTo(account);
        return storeMapper.selectByExample(example).get(0).getLastprofitdate();
    }

    @Override
    public Double updateProfit(String account, String profitDate, Double profit) {
        Date lastProfitDate = getLastProfitDate(account);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //根据ID获得store实例
        storeExample storeExample = new storeExample();
        storeExample.createCriteria().andAccountEqualTo(account);
        store myStore=storeMapper.selectByExample(storeExample).get(0);

        //当上次收益时间为null或者不是今天时，更新上次收益时间
        if(lastProfitDate == null || !profitDate.equals(sdf.format(lastProfitDate))){

            try {
                myStore.setLastprofitdate(sdf.parse(profitDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        else {
            //直接将profit加在相应的年、日、月的收益上，每过一个个月可以记录一次
            profit = myStore.getTodayprofit() + profit;
        }

        myStore.setTodayprofit(profit);
        storeMapper.updateByPrimaryKeySelective(myStore);

        return profit;
    }

    @Override
    public Double getTodayProfit(String account, String profitDate) {
        Date lastProfitDate = getLastProfitDate(account);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //当上次收益时间为null或者不是今天时，更新上次收益时间
        if(lastProfitDate == null || !profitDate.equals(sdf.format(lastProfitDate))){
            return 0.0;
        }
        else {
            //根据ID获得store实例
            storeExample storeExample = new storeExample();
            storeExample.createCriteria().andAccountEqualTo(account);
            store myStore=storeMapper.selectByExample(storeExample).get(0);

            return myStore.getTodayprofit();
        }
    }

    @Override
    public Boolean isAccountExist(String account) {
        storeExample storeExample = new storeExample();
        storeExample.createCriteria().andAccountEqualTo(account);
        List<store> list = storeMapper.selectByExample(storeExample);

        //如果此账户存在则返回错误
        if(list.size() > 0){
            return true;
        }
        return false;
    }

    @Override
    public Boolean register(String account, String password) {
        store newStore = new store();
        newStore.setAccount(account);
        newStore.setPassword(password);
        newStore.setQueryfailtimes(0);
        newStore.setQuerysuccesstimes(0);

        int res = storeMapper.insertSelective(newStore);
        if(res != 1)
            return false;
        return true;
    }

    @Override
    public Boolean login(String account, String password) {
        storeExample storeExample = new storeExample();
        storeExample.createCriteria().andAccountEqualTo(account).andPasswordEqualTo(password);
        List<store> list = storeMapper.selectByExample(storeExample);

        //如果此open_id的账户不存在则建立
        if(list.size() <= 0){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public void addSuccessQueryTimes(String account) {
        storeExample storeExample = new storeExample();
        storeExample.createCriteria().andAccountEqualTo(account);
        store myStore=storeMapper.selectByExample(storeExample).get(0);

        myStore.setQuerysuccesstimes(myStore.getQuerysuccesstimes() + 1);
        storeMapper.updateByPrimaryKeySelective(myStore);
    }

    @Override
    public void addFailQueryTimes(String account) {
        storeExample storeExample = new storeExample();
        storeExample.createCriteria().andAccountEqualTo(account);
        store myStore=storeMapper.selectByExample(storeExample).get(0);

        myStore.setQueryfailtimes(myStore.getQueryfailtimes() + 1);
        storeMapper.updateByPrimaryKeySelective(myStore);
    }


}
