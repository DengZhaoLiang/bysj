/*
 * This file is generated by jOOQ.
 */
package generated.tables;


import generated.Bysj;
import generated.Indexes;
import generated.Keys;
import generated.tables.records.InformationRecord;

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
public class Information extends TableImpl<InformationRecord> {

    private static final long serialVersionUID = 516895373;

    /**
     * The reference instance of <code>bysj.information</code>
     */
    public static final Information INFORMATION = new Information();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<InformationRecord> getRecordType() {
        return InformationRecord.class;
    }

    /**
     * The column <code>bysj.information.id</code>.
     */
    public final TableField<InformationRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>bysj.information.name</code>. ??
     */
    public final TableField<InformationRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "??");

    /**
     * The column <code>bysj.information.describe</code>. ??
     */
    public final TableField<InformationRecord, String> DESCRIBE = createField(DSL.name("describe"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "??");

    /**
     * The column <code>bysj.information.img</code>. ?????
     */
    public final TableField<InformationRecord, String> IMG = createField(DSL.name("img"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "?????");

    /**
     * The column <code>bysj.information.video</code>. ????
     */
    public final TableField<InformationRecord, String> VIDEO = createField(DSL.name("video"), org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "????");

    /**
     * The column <code>bysj.information.type</code>. ???? 1-??? 2-?? 3-? 4-? 5-?? 6-??
     */
    public final TableField<InformationRecord, Integer> TYPE = createField(DSL.name("type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("1", org.jooq.impl.SQLDataType.INTEGER)), this, "???? 1-??? 2-?? 3-? 4-? 5-?? 6-??");

    /**
     * The column <code>bysj.information.pv</code>. ?????
     */
    public final TableField<InformationRecord, Long> PV = createField(DSL.name("pv"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "?????");

    /**
     * The column <code>bysj.information.created_at</code>. ????
     */
    public final TableField<InformationRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "????");

    /**
     * The column <code>bysj.information.updated_at</code>. ????
     */
    public final TableField<InformationRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "????");

    /**
     * Create a <code>bysj.information</code> table reference
     */
    public Information() {
        this(DSL.name("information"), null);
    }

    /**
     * Create an aliased <code>bysj.information</code> table reference
     */
    public Information(String alias) {
        this(DSL.name(alias), INFORMATION);
    }

    /**
     * Create an aliased <code>bysj.information</code> table reference
     */
    public Information(Name alias) {
        this(alias, INFORMATION);
    }

    private Information(Name alias, Table<InformationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Information(Name alias, Table<InformationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Information(Table<O> child, ForeignKey<O, InformationRecord> key) {
        super(child, key, INFORMATION);
    }

    @Override
    public Schema getSchema() {
        return Bysj.BYSJ;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.INFORMATION_INFORMATION_TYPE_INDEX, Indexes.INFORMATION_PRIMARY);
    }

    @Override
    public Identity<InformationRecord, Long> getIdentity() {
        return Keys.IDENTITY_INFORMATION;
    }

    @Override
    public UniqueKey<InformationRecord> getPrimaryKey() {
        return Keys.KEY_INFORMATION_PRIMARY;
    }

    @Override
    public List<UniqueKey<InformationRecord>> getKeys() {
        return Arrays.<UniqueKey<InformationRecord>>asList(Keys.KEY_INFORMATION_PRIMARY);
    }

    @Override
    public Information as(String alias) {
        return new Information(DSL.name(alias), this);
    }

    @Override
    public Information as(Name alias) {
        return new Information(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Information rename(String name) {
        return new Information(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Information rename(Name name) {
        return new Information(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, String, Integer, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}