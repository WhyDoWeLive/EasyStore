package com.xiangshan.selfienote.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class storeExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public storeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("accountId is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("accountId is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(String value) {
            addCriterion("accountId =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(String value) {
            addCriterion("accountId <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(String value) {
            addCriterion("accountId >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("accountId >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(String value) {
            addCriterion("accountId <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(String value) {
            addCriterion("accountId <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLike(String value) {
            addCriterion("accountId like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotLike(String value) {
            addCriterion("accountId not like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<String> values) {
            addCriterion("accountId in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<String> values) {
            addCriterion("accountId not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(String value1, String value2) {
            addCriterion("accountId between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(String value1, String value2) {
            addCriterion("accountId not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateIsNull() {
            addCriterion("lastProfitDate is null");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateIsNotNull() {
            addCriterion("lastProfitDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateEqualTo(Date value) {
            addCriterionForJDBCDate("lastProfitDate =", value, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastProfitDate <>", value, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateGreaterThan(Date value) {
            addCriterionForJDBCDate("lastProfitDate >", value, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastProfitDate >=", value, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateLessThan(Date value) {
            addCriterionForJDBCDate("lastProfitDate <", value, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastProfitDate <=", value, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateIn(List<Date> values) {
            addCriterionForJDBCDate("lastProfitDate in", values, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastProfitDate not in", values, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastProfitDate between", value1, value2, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andLastprofitdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastProfitDate not between", value1, value2, "lastprofitdate");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterionForJDBCDate("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterionForJDBCDate("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterionForJDBCDate("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterionForJDBCDate("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterionForJDBCDate("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterionForJDBCDate("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andTodayprofitIsNull() {
            addCriterion("todayProfit is null");
            return (Criteria) this;
        }

        public Criteria andTodayprofitIsNotNull() {
            addCriterion("todayProfit is not null");
            return (Criteria) this;
        }

        public Criteria andTodayprofitEqualTo(Double value) {
            addCriterion("todayProfit =", value, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitNotEqualTo(Double value) {
            addCriterion("todayProfit <>", value, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitGreaterThan(Double value) {
            addCriterion("todayProfit >", value, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitGreaterThanOrEqualTo(Double value) {
            addCriterion("todayProfit >=", value, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitLessThan(Double value) {
            addCriterion("todayProfit <", value, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitLessThanOrEqualTo(Double value) {
            addCriterion("todayProfit <=", value, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitIn(List<Double> values) {
            addCriterion("todayProfit in", values, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitNotIn(List<Double> values) {
            addCriterion("todayProfit not in", values, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitBetween(Double value1, Double value2) {
            addCriterion("todayProfit between", value1, value2, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andTodayprofitNotBetween(Double value1, Double value2) {
            addCriterion("todayProfit not between", value1, value2, "todayprofit");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesIsNull() {
            addCriterion("querySuccessTimes is null");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesIsNotNull() {
            addCriterion("querySuccessTimes is not null");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesEqualTo(Integer value) {
            addCriterion("querySuccessTimes =", value, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesNotEqualTo(Integer value) {
            addCriterion("querySuccessTimes <>", value, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesGreaterThan(Integer value) {
            addCriterion("querySuccessTimes >", value, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("querySuccessTimes >=", value, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesLessThan(Integer value) {
            addCriterion("querySuccessTimes <", value, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesLessThanOrEqualTo(Integer value) {
            addCriterion("querySuccessTimes <=", value, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesIn(List<Integer> values) {
            addCriterion("querySuccessTimes in", values, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesNotIn(List<Integer> values) {
            addCriterion("querySuccessTimes not in", values, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesBetween(Integer value1, Integer value2) {
            addCriterion("querySuccessTimes between", value1, value2, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQuerysuccesstimesNotBetween(Integer value1, Integer value2) {
            addCriterion("querySuccessTimes not between", value1, value2, "querysuccesstimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesIsNull() {
            addCriterion("queryFailTimes is null");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesIsNotNull() {
            addCriterion("queryFailTimes is not null");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesEqualTo(Integer value) {
            addCriterion("queryFailTimes =", value, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesNotEqualTo(Integer value) {
            addCriterion("queryFailTimes <>", value, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesGreaterThan(Integer value) {
            addCriterion("queryFailTimes >", value, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("queryFailTimes >=", value, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesLessThan(Integer value) {
            addCriterion("queryFailTimes <", value, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesLessThanOrEqualTo(Integer value) {
            addCriterion("queryFailTimes <=", value, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesIn(List<Integer> values) {
            addCriterion("queryFailTimes in", values, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesNotIn(List<Integer> values) {
            addCriterion("queryFailTimes not in", values, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesBetween(Integer value1, Integer value2) {
            addCriterion("queryFailTimes between", value1, value2, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andQueryfailtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("queryFailTimes not between", value1, value2, "queryfailtimes");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountIsNull() {
            addCriterion("lastLogAccount is null");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountIsNotNull() {
            addCriterion("lastLogAccount is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountEqualTo(String value) {
            addCriterion("lastLogAccount =", value, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountNotEqualTo(String value) {
            addCriterion("lastLogAccount <>", value, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountGreaterThan(String value) {
            addCriterion("lastLogAccount >", value, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountGreaterThanOrEqualTo(String value) {
            addCriterion("lastLogAccount >=", value, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountLessThan(String value) {
            addCriterion("lastLogAccount <", value, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountLessThanOrEqualTo(String value) {
            addCriterion("lastLogAccount <=", value, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountLike(String value) {
            addCriterion("lastLogAccount like", value, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountNotLike(String value) {
            addCriterion("lastLogAccount not like", value, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountIn(List<String> values) {
            addCriterion("lastLogAccount in", values, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountNotIn(List<String> values) {
            addCriterion("lastLogAccount not in", values, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountBetween(String value1, String value2) {
            addCriterion("lastLogAccount between", value1, value2, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogaccountNotBetween(String value1, String value2) {
            addCriterion("lastLogAccount not between", value1, value2, "lastlogaccount");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordIsNull() {
            addCriterion("lastLogPassword is null");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordIsNotNull() {
            addCriterion("lastLogPassword is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordEqualTo(String value) {
            addCriterion("lastLogPassword =", value, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordNotEqualTo(String value) {
            addCriterion("lastLogPassword <>", value, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordGreaterThan(String value) {
            addCriterion("lastLogPassword >", value, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("lastLogPassword >=", value, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordLessThan(String value) {
            addCriterion("lastLogPassword <", value, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordLessThanOrEqualTo(String value) {
            addCriterion("lastLogPassword <=", value, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordLike(String value) {
            addCriterion("lastLogPassword like", value, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordNotLike(String value) {
            addCriterion("lastLogPassword not like", value, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordIn(List<String> values) {
            addCriterion("lastLogPassword in", values, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordNotIn(List<String> values) {
            addCriterion("lastLogPassword not in", values, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordBetween(String value1, String value2) {
            addCriterion("lastLogPassword between", value1, value2, "lastlogpassword");
            return (Criteria) this;
        }

        public Criteria andLastlogpasswordNotBetween(String value1, String value2) {
            addCriterion("lastLogPassword not between", value1, value2, "lastlogpassword");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table store
     *
     * @mbggenerated do_not_delete_during_merge Mon Mar 25 23:15:04 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table store
     *
     * @mbggenerated Mon Mar 25 23:15:04 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}