package com.gdin.dzzwsyb.swzzbdbxt.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	public NoticeExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

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

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Long value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Long value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Long value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Long value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Long value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Long value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Long> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Long> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Long value1, Long value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Long value1, Long value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Long value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Long value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Long value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Long value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Long value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Long> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Long> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Long value1, Long value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Long value1, Long value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andTypeIsNull() {
			addCriterion("type is null");
			return (Criteria) this;
		}

		public Criteria andTypeIsNotNull() {
			addCriterion("type is not null");
			return (Criteria) this;
		}

		public Criteria andTypeEqualTo(Integer value) {
			addCriterion("type =", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotEqualTo(Integer value) {
			addCriterion("type <>", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThan(Integer value) {
			addCriterion("type >", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("type >=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThan(Integer value) {
			addCriterion("type <", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeLessThanOrEqualTo(Integer value) {
			addCriterion("type <=", value, "type");
			return (Criteria) this;
		}

		public Criteria andTypeIn(List<Integer> values) {
			addCriterion("type in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotIn(List<Integer> values) {
			addCriterion("type not in", values, "type");
			return (Criteria) this;
		}

		public Criteria andTypeBetween(Integer value1, Integer value2) {
			addCriterion("type between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("type not between", value1, value2, "type");
			return (Criteria) this;
		}

		public Criteria andTargetIdIsNull() {
			addCriterion("target_id is null");
			return (Criteria) this;
		}

		public Criteria andTargetIdIsNotNull() {
			addCriterion("target_id is not null");
			return (Criteria) this;
		}

		public Criteria andTargetIdEqualTo(String value) {
			addCriterion("target_id =", value, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdNotEqualTo(String value) {
			addCriterion("target_id <>", value, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdGreaterThan(String value) {
			addCriterion("target_id >", value, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdGreaterThanOrEqualTo(String value) {
			addCriterion("target_id >=", value, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdLessThan(String value) {
			addCriterion("target_id <", value, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdLessThanOrEqualTo(String value) {
			addCriterion("target_id <=", value, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdLike(String value) {
			addCriterion("target_id like", value, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdNotLike(String value) {
			addCriterion("target_id not like", value, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdIn(List<String> values) {
			addCriterion("target_id in", values, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdNotIn(List<String> values) {
			addCriterion("target_id not in", values, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdBetween(String value1, String value2) {
			addCriterion("target_id between", value1, value2, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetIdNotBetween(String value1, String value2) {
			addCriterion("target_id not between", value1, value2, "targetId");
			return (Criteria) this;
		}

		public Criteria andTargetTypeIsNull() {
			addCriterion("target_type is null");
			return (Criteria) this;
		}

		public Criteria andTargetTypeIsNotNull() {
			addCriterion("target_type is not null");
			return (Criteria) this;
		}

		public Criteria andTargetTypeEqualTo(Integer value) {
			addCriterion("target_type =", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeNotEqualTo(Integer value) {
			addCriterion("target_type <>", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeGreaterThan(Integer value) {
			addCriterion("target_type >", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("target_type >=", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeLessThan(Integer value) {
			addCriterion("target_type <", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeLessThanOrEqualTo(Integer value) {
			addCriterion("target_type <=", value, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeIn(List<Integer> values) {
			addCriterion("target_type in", values, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeNotIn(List<Integer> values) {
			addCriterion("target_type not in", values, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeBetween(Integer value1, Integer value2) {
			addCriterion("target_type between", value1, value2, "targetType");
			return (Criteria) this;
		}

		public Criteria andTargetTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("target_type not between", value1, value2, "targetType");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("create_time is not null");
			return (Criteria) this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("create_time >=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeIn(List<Date> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotIn(List<Date> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}

		public Criteria andIsReadIsNull() {
			addCriterion("is_read is null");
			return (Criteria) this;
		}

		public Criteria andIsReadIsNotNull() {
			addCriterion("is_read is not null");
			return (Criteria) this;
		}

		public Criteria andIsReadEqualTo(Integer value) {
			addCriterion("is_read =", value, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadNotEqualTo(Integer value) {
			addCriterion("is_read <>", value, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadGreaterThan(Integer value) {
			addCriterion("is_read >", value, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_read >=", value, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadLessThan(Integer value) {
			addCriterion("is_read <", value, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadLessThanOrEqualTo(Integer value) {
			addCriterion("is_read <=", value, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadIn(List<Integer> values) {
			addCriterion("is_read in", values, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadNotIn(List<Integer> values) {
			addCriterion("is_read not in", values, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadBetween(Integer value1, Integer value2) {
			addCriterion("is_read between", value1, value2, "isRead");
			return (Criteria) this;
		}

		public Criteria andIsReadNotBetween(Integer value1, Integer value2) {
			addCriterion("is_read not between", value1, value2, "isRead");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

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