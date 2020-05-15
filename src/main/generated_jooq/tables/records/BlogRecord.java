/*
 * This file is generated by jOOQ.
 */
package generated_jooq.tables.records;


import generated_jooq.tables.Blog;
import generated_jooq.tables.interfaces.IBlog;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlogRecord extends UpdatableRecordImpl<BlogRecord> implements Record9<Long, String, String, String, Integer, Integer, Long, LocalDateTime, LocalDateTime>, IBlog {

    private static final long serialVersionUID = 1723162;

    /**
     * Setter for <code>bysj.blog.id</code>.
     */
    @Override
    public BlogRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>bysj.blog.name</code>. ???
     */
    @Override
    public BlogRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.name</code>. ???
     */
    @NotNull
    @Size(max = 65535)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bysj.blog.describe</code>. ??
     */
    @Override
    public BlogRecord setDescribe(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.describe</code>. ??
     */
    @Override
    public String getDescribe() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bysj.blog.context</code>. ?????
     */
    @Override
    public BlogRecord setContext(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.context</code>. ?????
     */
    @NotNull
    @Override
    public String getContext() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bysj.blog.type</code>. ???? 1-??? 2-?? 3-? 4-? 5-?? 6-??
     */
    @Override
    public BlogRecord setType(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.type</code>. ???? 1-??? 2-?? 3-? 4-? 5-?? 6-??
     */
    @Override
    public Integer getType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bysj.blog.article_type</code>. ???? 1-?? 2-?? 3-??
     */
    @Override
    public BlogRecord setArticleType(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.article_type</code>. ???? 1-?? 2-?? 3-??
     */
    @Override
    public Integer getArticleType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>bysj.blog.pv</code>. ?????
     */
    @Override
    public BlogRecord setPv(Long value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.pv</code>. ?????
     */
    @Override
    public Long getPv() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>bysj.blog.created_at</code>. ????
     */
    @Override
    public BlogRecord setCreatedAt(LocalDateTime value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.created_at</code>. ????
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>bysj.blog.updated_at</code>. ????
     */
    @Override
    public BlogRecord setUpdatedAt(LocalDateTime value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog.updated_at</code>. ????
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, Integer, Integer, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, Integer, Integer, Long, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Blog.BLOG.ID;
    }

    @Override
    public Field<String> field2() {
        return Blog.BLOG.NAME;
    }

    @Override
    public Field<String> field3() {
        return Blog.BLOG.DESCRIBE;
    }

    @Override
    public Field<String> field4() {
        return Blog.BLOG.CONTEXT;
    }

    @Override
    public Field<Integer> field5() {
        return Blog.BLOG.TYPE;
    }

    @Override
    public Field<Integer> field6() {
        return Blog.BLOG.ARTICLE_TYPE;
    }

    @Override
    public Field<Long> field7() {
        return Blog.BLOG.PV;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Blog.BLOG.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Blog.BLOG.UPDATED_AT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getDescribe();
    }

    @Override
    public String component4() {
        return getContext();
    }

    @Override
    public Integer component5() {
        return getType();
    }

    @Override
    public Integer component6() {
        return getArticleType();
    }

    @Override
    public Long component7() {
        return getPv();
    }

    @Override
    public LocalDateTime component8() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component9() {
        return getUpdatedAt();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getDescribe();
    }

    @Override
    public String value4() {
        return getContext();
    }

    @Override
    public Integer value5() {
        return getType();
    }

    @Override
    public Integer value6() {
        return getArticleType();
    }

    @Override
    public Long value7() {
        return getPv();
    }

    @Override
    public LocalDateTime value8() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value9() {
        return getUpdatedAt();
    }

    @Override
    public BlogRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public BlogRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public BlogRecord value3(String value) {
        setDescribe(value);
        return this;
    }

    @Override
    public BlogRecord value4(String value) {
        setContext(value);
        return this;
    }

    @Override
    public BlogRecord value5(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public BlogRecord value6(Integer value) {
        setArticleType(value);
        return this;
    }

    @Override
    public BlogRecord value7(Long value) {
        setPv(value);
        return this;
    }

    @Override
    public BlogRecord value8(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public BlogRecord value9(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public BlogRecord values(Long value1, String value2, String value3, String value4, Integer value5, Integer value6, Long value7, LocalDateTime value8, LocalDateTime value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IBlog from) {
        setId(from.getId());
        setName(from.getName());
        setDescribe(from.getDescribe());
        setContext(from.getContext());
        setType(from.getType());
        setArticleType(from.getArticleType());
        setPv(from.getPv());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    @Override
    public <E extends IBlog> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlogRecord
     */
    public BlogRecord() {
        super(Blog.BLOG);
    }

    /**
     * Create a detached, initialised BlogRecord
     */
    public BlogRecord(Long id, String name, String describe, String context, Integer type, Integer articleType, Long pv, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Blog.BLOG);

        set(0, id);
        set(1, name);
        set(2, describe);
        set(3, context);
        set(4, type);
        set(5, articleType);
        set(6, pv);
        set(7, createdAt);
        set(8, updatedAt);
    }
}