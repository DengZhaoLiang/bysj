/*
 * This file is generated by jOOQ.
 */
package generated.tables;


import generated.Bysj;
import generated.Indexes;
import generated.Keys;
import generated.tables.records.BannerRecord;

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
public class Banner extends TableImpl<BannerRecord> {

    private static final long serialVersionUID = 1923498058;

    /**
     * The reference instance of <code>bysj.banner</code>
     */
    public static final Banner BANNER = new Banner();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BannerRecord> getRecordType() {
        return BannerRecord.class;
    }

    /**
     * The column <code>bysj.banner.id</code>.
     */
    public final TableField<BannerRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>bysj.banner.name</code>. ??
     */
    public final TableField<BannerRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "??");

    /**
     * The column <code>bysj.banner.describe</code>. ??
     */
    public final TableField<BannerRecord, String> DESCRIBE = createField(DSL.name("describe"), org.jooq.impl.SQLDataType.CLOB, this, "??");

    /**
     * The column <code>bysj.banner.img</code>. ??
     */
    public final TableField<BannerRecord, String> IMG = createField(DSL.name("img"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "??");

    /**
     * The column <code>bysj.banner.blog_id</code>. ??Id
     */
    public final TableField<BannerRecord, Long> BLOG_ID = createField(DSL.name("blog_id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "??Id");

    /**
     * The column <code>bysj.banner.created_at</code>. ????
     */
    public final TableField<BannerRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "????");

    /**
     * The column <code>bysj.banner.updated_at</code>. ????
     */
    public final TableField<BannerRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "????");

    /**
     * Create a <code>bysj.banner</code> table reference
     */
    public Banner() {
        this(DSL.name("banner"), null);
    }

    /**
     * Create an aliased <code>bysj.banner</code> table reference
     */
    public Banner(String alias) {
        this(DSL.name(alias), BANNER);
    }

    /**
     * Create an aliased <code>bysj.banner</code> table reference
     */
    public Banner(Name alias) {
        this(alias, BANNER);
    }

    private Banner(Name alias, Table<BannerRecord> aliased) {
        this(alias, aliased, null);
    }

    private Banner(Name alias, Table<BannerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Banner(Table<O> child, ForeignKey<O, BannerRecord> key) {
        super(child, key, BANNER);
    }

    @Override
    public Schema getSchema() {
        return Bysj.BYSJ;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BANNER_BANNER_BLOG_ID_INDEX, Indexes.BANNER_PRIMARY);
    }

    @Override
    public Identity<BannerRecord, Long> getIdentity() {
        return Keys.IDENTITY_BANNER;
    }

    @Override
    public UniqueKey<BannerRecord> getPrimaryKey() {
        return Keys.KEY_BANNER_PRIMARY;
    }

    @Override
    public List<UniqueKey<BannerRecord>> getKeys() {
        return Arrays.<UniqueKey<BannerRecord>>asList(Keys.KEY_BANNER_PRIMARY);
    }

    @Override
    public Banner as(String alias) {
        return new Banner(DSL.name(alias), this);
    }

    @Override
    public Banner as(Name alias) {
        return new Banner(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Banner rename(String name) {
        return new Banner(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Banner rename(Name name) {
        return new Banner(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, String, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}