package com.xiangshan.selfienote.biz;

import com.xiangshan.selfienote.pojo.commodity;
import com.xiangshan.selfienote.pojo.store;

import java.util.Date;
import java.util.List;

public interface EasyStoreInterface {

    int insertOrUpdateCommodity(String account, String commodityId, String commodityName, Double commoditySellPrice);
    List<commodity> queryCommodityInfo(String account, String commodityId);
    Date getLastProfitDate(String account);
    Double updateProfit(String account, String profitDate, Double profit);
    Double getTodayProfit(String account, String profitDate);
    Boolean isAccountExist(String account);
    Boolean register(String account, String password);
    Boolean login(String account, String password);
    void addSuccessQueryTimes(String account);
    void addFailQueryTimes(String account);
}
