/*
 * This file is generated by jOOQ.
 */
package generated.tables;


import generated.Bysj;
import generated.Indexes;
import generated.Keys;
import generated.tables.records.AdminRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
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
public class Admin extends TableImpl<AdminRecord> {

    private static final long serialVersionUID = -2085013035;

    /**
     * The reference instance of <code>bysj.admin</code>
     */
    public static final Admin ADMIN = new Admin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AdminRecord> getRecordType() {
        return AdminRecord.class;
    }

    /**
     * The column <code>bysj.admin.id</code>.
     */
    public final TableField<AdminRecord, Long> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>bysj.admin.name</code>. 姓名
     */
    public final TableField<AdminRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "姓名");

    /**
     * The column <code>bysj.admin.account</code>. 账号
     */
    public final TableField<AdminRecord, String> ACCOUNT = createField(DSL.name("account"), org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "账号");

    /**
     * The column <code>bysj.admin.password</code>. 密码
     */
    public final TableField<AdminRecord, String> PASSWORD = createField(DSL.name("password"), org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "密码");

    /**
     * The column <code>bysj.admin.created_at</code>. 创建时间
     */
    public final TableField<AdminRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * The column <code>bysj.admin.updated_at</code>. 更新时间
     */
    public final TableField<AdminRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "更新时间");

    /**
     * Create a <code>bysj.admin</code> table reference
     */
    public Admin() {
        this(DSL.name("admin"), null);
    }

    /**
     * Create an aliased <code>bysj.admin</code> table reference
     */
    public Admin(String alias) {
        this(DSL.name(alias), ADMIN);
    }

    /**
     * Create an aliased <code>bysj.admin</code> table reference
     */
    public Admin(Name alias) {
        this(alias, ADMIN);
    }

    private Admin(Name alias, Table<AdminRecord> aliased) {
        this(alias, aliased, null);
    }

    private Admin(Name alias, Table<AdminRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Admin(Table<O> child, ForeignKey<O, AdminRecord> key) {
        super(child, key, ADMIN);
    }

    @Override
    public Schema getSchema() {
        return Bysj.BYSJ;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ADMIN_ADMIN_ACCOUNT_UNIQUE, Indexes.ADMIN_ADMIN_NAME_INDEX, Indexes.ADMIN_PRIMARY);
    }

    @Override
    public Identity<AdminRecord, Long> getIdentity() {
        return Keys.IDENTITY_ADMIN;
    }

    @Override
    public UniqueKey<AdminRecord> getPrimaryKey() {
        return Keys.KEY_ADMIN_PRIMARY;
    }

    @Override
    public List<UniqueKey<AdminRecord>> getKeys() {
        return Arrays.<UniqueKey<AdminRecord>>asList(Keys.KEY_ADMIN_PRIMARY, Keys.KEY_ADMIN_ADMIN_ACCOUNT_UNIQUE);
    }

    @Override
    public Admin as(String alias) {
        return new Admin(DSL.name(alias), this);
    }

    @Override
    public Admin as(Name alias) {
        return new Admin(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Admin rename(String name) {
        return new Admin(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Admin rename(Name name) {
        return new Admin(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
