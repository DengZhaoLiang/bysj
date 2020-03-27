/*
 * This file is generated by jOOQ.
 */
package generated.tables.records;


import generated.tables.Admin;
import generated.tables.interfaces.IAdmin;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AdminRecord extends UpdatableRecordImpl<AdminRecord> implements Record6<Long, String, String, String, LocalDateTime, LocalDateTime>, IAdmin {

    private static final long serialVersionUID = 1702839444;

    /**
     * Setter for <code>bysj.admin.id</code>.
     */
    @Override
    public AdminRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>bysj.admin.name</code>. ??
     */
    @Override
    public AdminRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.name</code>. ??
     */
    @NotNull
    @Size(max = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>bysj.admin.account</code>. ??
     */
    @Override
    public AdminRecord setAccount(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.account</code>. ??
     */
    @NotNull
    @Size(max = 32)
    @Override
    public String getAccount() {
        return (String) get(2);
    }

    /**
     * Setter for <code>bysj.admin.password</code>. ??
     */
    @Override
    public AdminRecord setPassword(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.password</code>. ??
     */
    @NotNull
    @Size(max = 64)
    @Override
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>bysj.admin.created_at</code>. ????
     */
    @Override
    public AdminRecord setCreatedAt(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.created_at</code>. ????
     */
    @Override
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>bysj.admin.updated_at</code>. ????
     */
    @Override
    public AdminRecord setUpdatedAt(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>bysj.admin.updated_at</code>. ????
     */
    @Override
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Admin.ADMIN.ID;
    }

    @Override
    public Field<String> field2() {
        return Admin.ADMIN.NAME;
    }

    @Override
    public Field<String> field3() {
        return Admin.ADMIN.ACCOUNT;
    }

    @Override
    public Field<String> field4() {
        return Admin.ADMIN.PASSWORD;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Admin.ADMIN.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Admin.ADMIN.UPDATED_AT;
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
        return getAccount();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public LocalDateTime component5() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component6() {
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
        return getAccount();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public LocalDateTime value5() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value6() {
        return getUpdatedAt();
    }

    @Override
    public AdminRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AdminRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AdminRecord value3(String value) {
        setAccount(value);
        return this;
    }

    @Override
    public AdminRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public AdminRecord value5(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public AdminRecord value6(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public AdminRecord values(Long value1, String value2, String value3, String value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IAdmin from) {
        setId(from.getId());
        setName(from.getName());
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
    public AdminRecord(Long id, String name, String account, String password, LocalDateTime createdAt, LocalDateTime updatedAt) {
        super(Admin.ADMIN);

        set(0, id);
        set(1, name);
        set(2, account);
        set(3, password);
        set(4, createdAt);
        set(5, updatedAt);
    }
}
