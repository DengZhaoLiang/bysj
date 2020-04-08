package com.liang.utils;

import java.util.List;
import org.jooq.Condition;
import org.jooq.DeleteQuery;
import org.jooq.InsertQuery;
import org.jooq.SelectQuery;
import org.jooq.TableField;
import org.jooq.UpdateQuery;
import org.jooq.impl.DSL;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

/**
 * @author Liang
 * Created By 2020/2/28
 **/
public class DSLPlusUtils {

    /**
     * add like condition to query if value is not blank,else do nothing
     *
     * @param query jooq selectQuery
     * @param field jooq varchar 字段
     * @param value 筛选值
     */
    public static void containsIfNotBlank(SelectQuery<?> query, TableField<?, String> field, String value) {
        if (isNullOrBlank(value)) {
            return;
        }
        query.addConditions(field.contains(value));
    }

    /**
     * add eq condition to query if value is not null,else do nothing
     *
     * @param query jooq UpdateQuery
     * @param field jooq bigint(20) 字段
     * @param value 筛选值
     */
    public static void eqIfNotNull(UpdateQuery<?> query, TableField<?, Long> field, Long value) {
        if (isNullOrBlank(value)) {
            return;
        }
        query.addConditions(field.eq(value));
    }

    public static void eqIfNotNull(SelectQuery<?> query, TableField<?, Integer> field, Integer value) {
        if (isNullOrBlank(value)) {
            return;
        }
        query.addConditions(field.eq(value));
    }

    public static void eqIfNotNull(DeleteQuery<?> query, TableField<?, Long> field, Long value) {
        if (isNullOrBlank(value)) {
            return;
        }
        query.addConditions(field.eq(value));
    }

    public static void inIfNotNull(SelectQuery<?> query, TableField<?, Long> field, List<Long> value) {
        if (isNullOrBlank(value) && CollectionUtils.isEmpty(value)) {
            return;
        }
        query.addConditions(field.in(value));
    }

    public static void inIfNotNull(InsertQuery<?> query, TableField<?, Long> field, List<Long> value) {
        if (isNullOrBlank(value) && CollectionUtils.isEmpty(value)) {
            return;
        }
        query.addConditions(field.in(value));
    }

    public static void inIfNotNull(UpdateQuery<?> query, TableField<?, Long> field, List<Long> value) {
        if (isNullOrBlank(value) && CollectionUtils.isEmpty(value)) {
            return;
        }
        query.addConditions(field.in(value));
    }

    public static void inIfNotNull(DeleteQuery<?> query, TableField<?, Long> field, List<Long> value) {
        if (isNullOrBlank(value) && CollectionUtils.isEmpty(value)) {
            return;
        }
        query.addConditions(field.in(value));
    }

    public static void gtZeroIfNotNull(SelectQuery<?> query, TableField<?, Long> field, Long value) {
        if (isNullOrBlank(value) || value <= 0) {
            return;
        }
        query.addConditions(field.eq(value));
    }

    public static void gtActiveData(SelectQuery<?> query, TableField<?, Boolean> field) {
        query.addConditions(field.isTrue());
    }

    public static void gtZeroIfNotNull(UpdateQuery<?> query, TableField<?, Long> field, Long value) {
        if (isNullOrBlank(value) || value <= 0) {
            return;
        }
        query.addConditions(field.eq(value));
    }

    public static void gtZeroIfNotNull(DeleteQuery<?> query, TableField<?, Long> field, Long value) {
        if (isNullOrBlank(value) || value <= 0) {
            return;
        }
        query.addConditions(field.eq(value));
    }

    public static Condition gtZeroIfNotNull(TableField<?, Long> field, Long value) {
        if (isNullOrBlank(value) || value <= 0) {
            return DSL.noCondition();
        }
        return field.eq(value);
    }

    private static boolean isNullOrBlank(Object o) {
        if (o instanceof String) {
            return StringUtils.isEmpty(o);
        }
        return o == null;
    }
}
