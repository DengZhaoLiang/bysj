/*
 * This file is generated by jOOQ.
 */
package generated.tables.records;


import generated.tables.BlogBg;
import generated.tables.interfaces.IBlogBg;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlogBgRecord extends UpdatableRecordImpl<BlogBgRecord> implements Record7<Long, String, String, String, Integer, LocalDateTime, LocalDateTime>, IBlogBg {

    private static final long serialVersionUID = -105421016;

    /**
     * Setter for <code>bysj.blog_bg.id</code>.
     */
    @Override
    public BlogBgRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog_bg.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>bysj.blog_bg.name</code>. ??
     */
    @Override
    public BlogBgRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog_bg.name</code>. ??
     */
    @NotNull
    @Size(max = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bysj.blog_bg.describe</code>. ??
     */
    @Override
    public BlogBgRecord setDescribe(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog_bg.describe</code>. ??
     */
    @Size(max = 255)
    @Override
    public String getDescribe() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bysj.blog_bg.img</code>. ??
     */
    @Override
    public BlogBgRecord setImg(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog_bg.img</code>. ??
     */
    @NotNull
    @Size(max = 65535)
    @Override
    public String getImg() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bysj.blog_bg.type</code>. ???? 1-??? 2-?? 3-? 4-? 5-?? 6-??
     */
    @Override
    public BlogBgRecord setType(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog_bg.type</code>. ???? 1-??? 2-?? 3-? 4-? 5-?? 6-??
     */
    @Override
    public Integer getType() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>bysj.blog_bg.created_at</code>. ????
     */
    @Override
    public BlogBgRecord setCreatedAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog_bg.created_at</code>. ????
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>bysj.blog_bg.updated_at</code>. ????
     */
    @Override
    public BlogBgRecord setUpdatedAt(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>bysj.blog_bg.updated_at</code>. ????
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, String, String, Integer, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return BlogBg.BLOG_BG.ID;
    }

    @Override
    public Field<String> field2() {
        return BlogBg.BLOG_BG.NAME;
    }

    @Override
    public Field<String> field3() {
        return BlogBg.BLOG_BG.DESCRIBE;
    }

    @Override
    public Field<String> field4() {
        return BlogBg.BLOG_BG.IMG;
    }

    @Override
    public Field<Integer> field5() {
        return BlogBg.BLOG_BG.TYPE;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return BlogBg.BLOG_BG.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return BlogBg.BLOG_BG.UPDATED_AT;
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
        return getImg();
    }

    @Override
    public Integer component5() {
        return getType();
    }

    @Override
    public LocalDateTime component6() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component7() {
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
        return getImg();
    }

    @Override
    public Integer value5() {
        return getType();
    }

    @Override
    public LocalDateTime value6() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value7() {
        return getUpdatedAt();
    }

    @Override
    public BlogBgRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public BlogBgRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public BlogBgRecord value3(String value) {
        setDescribe(value);
        return this;
    }

    @Override
    public BlogBgRecord value4(String value) {
        setImg(value);
        return this;
    }

    @Override
    public BlogBgRecord value5(Integer value) {
        setType(value);
        return this;
    }

    @Override
    public BlogBgRecord value6(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public BlogBgRecord value7(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public BlogBgRecord values(Long value1, String value2, String value3, String value4, Integer value5, LocalDateTime value6, LocalDateTime value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IBlogBg from) {
        setId(from.getId());
        setName(from.getName());
        setDescribe(from.getDescribe());
        setImg(from.getImg());
        setType(from.getType());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    @Override
    public <E extends IBlogBg> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BlogBgRecord
     */
    public BlogBgRecord() {
        super(BlogBg.BLOG_BG);
    }

    /**
     * Create a detached, initialised BlogBgRecord
     */
    public BlogBgRecord(Long id, String name, String describe, String img, Integer type, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(BlogBg.BLOG_BG);

        set(0, id);
        set(1, name);
        set(2, describe);
        set(3, img);
        set(4, type);
        set(5, createdAt);
        set(6, updatedAt);
    }
}
