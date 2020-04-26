/*
 * This file is generated by jOOQ.
 */
package generated.tables;


import generated.Bysj;
import generated.Indexes;
import generated.Keys;
import generated.tables.records.BlogRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
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
public class Blog extends TableImpl<BlogRecord> {

    private static final long serialVersionUID = -30995431;

    /**
     * The reference instance of <code>bysj.blog</code>
     */
    public static final Blog BLOG = new Blog();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BlogRecord> getRecordType() {
        return BlogRecord.class;
    }

    /**
     * The column <code>bysj.blog.id</code>.
     */
    public final TableField<BlogRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>bysj.blog.name</code>. ???
     */
    public final TableField<BlogRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "???");

    /**
     * The column <code>bysj.blog.describe</code>. ??
     */
    public final TableField<BlogRecord, String> DESCRIBE = createField(DSL.name("describe"), org.jooq.impl.SQLDataType.CLOB, this, "??");

    /**
     * The column <code>bysj.blog.context</code>. ?????
     */
    public final TableField<BlogRecord, String> CONTEXT = createField(DSL.name("context"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "?????");

    /**
     * The column <code>bysj.blog.type</code>. ???? 1-??? 2-?? 3-? 4-? 5-?? 6-??
     */
    public final TableField<BlogRecord, Integer> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "???? 1-??? 2-?? 3-? 4-? 5-?? 6-??");

    /**
     * The column <code>bysj.blog.article_type</code>. ???? 1-?? 2-?? 3-??
     */
    public final TableField<BlogRecord, Integer> ARTICLE_TYPE = createField(DSL.name("article_type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "???? 1-?? 2-?? 3-??");

    /**
     * The column <code>bysj.blog.pv</code>. ?????
     */
    public final TableField<BlogRecord, Long> PV = createField(DSL.name("pv"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "?????");

    /**
     * The column <code>bysj.blog.created_at</code>. ????
     */
    public final TableField<BlogRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "????");

    /**
     * The column <code>bysj.blog.updated_at</code>. ????
     */
    public final TableField<BlogRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "????");

    /**
     * Create a <code>bysj.blog</code> table reference
     */
    public Blog() {
        this(DSL.name("blog"), null);
    }

    /**
     * Create an aliased <code>bysj.blog</code> table reference
     */
    public Blog(String alias) {
        this(DSL.name(alias), BLOG);
    }

    /**
     * Create an aliased <code>bysj.blog</code> table reference
     */
    public Blog(Name alias) {
        this(alias, BLOG);
    }

    private Blog(Name alias, Table<BlogRecord> aliased) {
        this(alias, aliased, null);
    }

    private Blog(Name alias, Table<BlogRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Blog(Table<O> child, ForeignKey<O, BlogRecord> key) {
        super(child, key, BLOG);
    }

    @Override
    public Schema getSchema() {
        return Bysj.BYSJ;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BLOG_PRIMARY);
    }

    @Override
    public Identity<BlogRecord, Long> getIdentity() {
        return Keys.IDENTITY_BLOG;
    }

    @Override
    public UniqueKey<BlogRecord> getPrimaryKey() {
        return Keys.KEY_BLOG_PRIMARY;
    }

    @Override
    public List<UniqueKey<BlogRecord>> getKeys() {
        return Arrays.<UniqueKey<BlogRecord>>asList(Keys.KEY_BLOG_PRIMARY);
    }

    @Override
    public Blog as(String alias) {
        return new Blog(DSL.name(alias), this);
    }

    @Override
    public Blog as(Name alias) {
        return new Blog(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Blog rename(String name) {
        return new Blog(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Blog rename(Name name) {
        return new Blog(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, Integer, Integer, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}