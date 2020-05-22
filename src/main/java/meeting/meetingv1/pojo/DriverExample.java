package meeting.meetingv1.pojo;

import java.util.ArrayList;
import java.util.List;

public class DriverExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table driver
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table driver
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table driver
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public DriverExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
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
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table driver
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table driver
     *
     * @mbg.generated
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

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(Integer value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(Integer value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(Integer value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(Integer value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(Integer value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<Integer> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<Integer> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(Integer value1, Integer value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIsNull() {
            addCriterion("meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIsNotNull() {
            addCriterion("meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdEqualTo(Integer value) {
            addCriterion("meeting_id =", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotEqualTo(Integer value) {
            addCriterion("meeting_id <>", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThan(Integer value) {
            addCriterion("meeting_id >", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_id >=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThan(Integer value) {
            addCriterion("meeting_id <", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_id <=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIn(List<Integer> values) {
            addCriterion("meeting_id in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotIn(List<Integer> values) {
            addCriterion("meeting_id not in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id not between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNull() {
            addCriterion("driver_tel is null");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNotNull() {
            addCriterion("driver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTelEqualTo(String value) {
            addCriterion("driver_tel =", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotEqualTo(String value) {
            addCriterion("driver_tel <>", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThan(String value) {
            addCriterion("driver_tel >", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThanOrEqualTo(String value) {
            addCriterion("driver_tel >=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThan(String value) {
            addCriterion("driver_tel <", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThanOrEqualTo(String value) {
            addCriterion("driver_tel <=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLike(String value) {
            addCriterion("driver_tel like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotLike(String value) {
            addCriterion("driver_tel not like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelIn(List<String> values) {
            addCriterion("driver_tel in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotIn(List<String> values) {
            addCriterion("driver_tel not in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelBetween(String value1, String value2) {
            addCriterion("driver_tel between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotBetween(String value1, String value2) {
            addCriterion("driver_tel not between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andIsArrengeIsNull() {
            addCriterion("is_arrenge is null");
            return (Criteria) this;
        }

        public Criteria andIsArrengeIsNotNull() {
            addCriterion("is_arrenge is not null");
            return (Criteria) this;
        }

        public Criteria andIsArrengeEqualTo(Integer value) {
            addCriterion("is_arrenge =", value, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeNotEqualTo(Integer value) {
            addCriterion("is_arrenge <>", value, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeGreaterThan(Integer value) {
            addCriterion("is_arrenge >", value, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_arrenge >=", value, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeLessThan(Integer value) {
            addCriterion("is_arrenge <", value, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeLessThanOrEqualTo(Integer value) {
            addCriterion("is_arrenge <=", value, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeIn(List<Integer> values) {
            addCriterion("is_arrenge in", values, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeNotIn(List<Integer> values) {
            addCriterion("is_arrenge not in", values, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeBetween(Integer value1, Integer value2) {
            addCriterion("is_arrenge between", value1, value2, "isArrenge");
            return (Criteria) this;
        }

        public Criteria andIsArrengeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_arrenge not between", value1, value2, "isArrenge");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table driver
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table driver
     *
     * @mbg.generated
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