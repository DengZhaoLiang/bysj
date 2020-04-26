/*
 * This file is generated by jOOQ.
 */
package generated.tables;


import generated.Bysj;
import generated.Indexes;
import generated.Keys;
import generated.tables.records.BlogBgRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BlogBg extends TableImpl<BlogBgRecord> {

    private static final long serialVersionUID = -522275977;

    /**
     * The reference instance of <code>bysj.blog_bg</code>
     */
    public static final BlogBg BLOG_BG = new BlogBg();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlogBgRecord> getRecordType() {
        return BlogBgRecord.class;
    }

    /**
     * The column <code>bysj.blog_bg.id</code>.
     */
    public final TableField<BlogBgRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>bysj.blog_bg.name</code>. ??
     */
    public final TableField<BlogBgRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "??");

    /**
     * The column <code>bysj.blog_bg.describe</code>. ??
     */
    public final TableField<BlogBgRecord, String> DESCRIBE = createField(DSL.name("describe"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "??");

    /**
     * The column <code>bysj.blog_bg.img</code>. ??
     */
    public final TableField<BlogBgRecord, String> IMG = createField(DSL.name("img"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "??");

    /**
     * The column <code>bysj.blog_bg.type</code>. ???? 1-??? 2-?? 3-? 4-? 5-?? 6-??
     */
    public final TableField<BlogBgRecord, Integer> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "???? 1-??? 2-?? 3-? 4-? 5-?? 6-??");

    /**
     * The column <code>bysj.blog_bg.created_at</code>. ????
     */
    public final TableField<BlogBgRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "????");

    /**
     * The column <code>bysj.blog_bg.updated_at</code>. ????
     */
    public final TableField<BlogBgRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "????");

    /**
     * Create a <code>bysj.blog_bg</code> table reference
     */
    public BlogBg() {
        this(DSL.name("blog_bg"), null);
    }

    /**
     * Create an aliased <code>bysj.blog_bg</code> table reference
     */
    public BlogBg(String alias) {
        this(DSL.name(alias), BLOG_BG);
    }

    /**
     * Create an aliased <code>bysj.blog_bg</code> table reference
     */
    public BlogBg(Name alias) {
        this(alias, BLOG_BG);
    }

    private BlogBg(Name alias, Table<BlogBgRecord> aliased) {
        this(alias, aliased, null);
    }

    private BlogBg(Name alias, Table<BlogBgRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> BlogBg(Table<O> child, ForeignKey<O, BlogBgRecord> key) {
        super(child, key, BLOG_BG);
    }

    @Override
    public Schema getSchema() {
        return Bysj.BYSJ;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BLOG_BG_BLOG_BG_TYPE_INDEX, Indexes.BLOG_BG_PRIMARY);
    }

    @Override
    public Identity<BlogBgRecord, Long> getIdentity() {
        return Keys.IDENTITY_BLOG_BG;
    }

    @Override
    public UniqueKey<BlogBgRecord> getPrimaryKey() {
        return Keys.KEY_BLOG_BG_PRIMARY;
    }

    @Override
    public List<UniqueKey<BlogBgRecord>> getKeys() {
        return Arrays.<UniqueKey<BlogBgRecord>>asList(Keys.KEY_BLOG_BG_PRIMARY);
    }

    @Override
    public BlogBg as(String alias) {
        return new BlogBg(DSL.name(alias), this);
    }

    @Override
    public BlogBg as(Name alias) {
        return new BlogBg(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BlogBg rename(String name) {
        return new BlogBg(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BlogBg rename(Name name) {
        return new BlogBg(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, String, Integer, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}