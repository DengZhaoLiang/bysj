/*
 * This file is generated by jOOQ.
 */
package generated.tables.records;


import generated.tables.Admin;
import generated.tables.interfaces.IAdmin;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminRecord extends UpdatableRecordImpl<AdminRecord> implements Record5<ULong, String, String, ULong, ULong>, IAdmin {

    private static final long serialVersionUID = -1622029784;

    /**
     * Setter for <code>bysj.admin.id</code>.
     */
    @Override
    public AdminRecord setId(ULong value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.id</code>.
     */
    @Override
    public ULong getId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>bysj.admin.account</code>. ??
     */
    @Override
    public AdminRecord setAccount(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.account</code>. ??
     */
    @NotNull
    @Size(max = 32)
    @Override
    public String getAccount() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bysj.admin.password</code>. ??
     */
    @Override
    public AdminRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.password</code>. ??
     */
    @NotNull
    @Size(max = 64)
    @Override
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bysj.admin.created_at</code>. ????
     */
    @Override
    public AdminRecord setCreatedAt(ULong value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.created_at</code>. ????
     */
    @Override
    public ULong getCreatedAt() {
        return (ULong) get(3);
    }

    /**
     * Setter for <code>bysj.admin.updated_at</code>. ????
     */
    @Override
    public AdminRecord setUpdatedAt(ULong value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.updated_at</code>. ????
     */
    @Override
    public ULong getUpdatedAt() {
        return (ULong) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<ULong, String, String, ULong, ULong> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<ULong, String, String, ULong, ULong> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return Admin.ADMIN.ID;
    }

    @Override
    public Field<String> field2() {
        return Admin.ADMIN.ACCOUNT;
    }

    @Override
    public Field<String> field3() {
        return Admin.ADMIN.PASSWORD;
    }

    @Override
    public Field<ULong> field4() {
        return Admin.ADMIN.CREATED_AT;
    }

    @Override
    public Field<ULong> field5() {
        return Admin.ADMIN.UPDATED_AT;
    }

    @Override
    public ULong component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getAccount();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public ULong component4() {
        return getCreatedAt();
    }

    @Override
    public ULong component5() {
        return getUpdatedAt();
    }

    @Override
    public ULong value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getAccount();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public ULong value4() {
        return getCreatedAt();
    }

    @Override
    public ULong value5() {
        return getUpdatedAt();
    }

    @Override
    public AdminRecord value1(ULong value) {
        setId(value);
        return this;
    }

    @Override
    public AdminRecord value2(String value) {
        setAccount(value);
        return this;
    }

    @Override
    public AdminRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public AdminRecord value4(ULong value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public AdminRecord value5(ULong value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public AdminRecord values(ULong value1, String value2, String value3, ULong value4, ULong value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IAdmin from) {
        setId(from.getId());
        setAccount(from.getAccount());
        setPassword(from.getPassword());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    @Override
    public <E extends IAdmin> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AdminRecord
     */
    public AdminRecord() {
        super(Admin.ADMIN);
    }

    /**
     * Create a detached, initialised AdminRecord
     */
    public AdminRecord(ULong id, String account, String password, ULong createdAt, ULong updatedAt) {
        super(Admin.ADMIN);

        set(0, id);
        set(1, account);
        set(2, password);
        set(3, createdAt);
        set(4, updatedAt);
    }
}
