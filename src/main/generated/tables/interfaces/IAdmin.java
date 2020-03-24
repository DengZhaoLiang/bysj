/*
 * This file is generated by jOOQ.
 */
package generated.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IAdmin extends Serializable {

    /**
     * Setter for <code>bysj.admin.id</code>.
     */
    public IAdmin setId(ULong value);

    /**
     * Getter for <code>bysj.admin.id</code>.
     */
    public ULong getId();

    /**
     * Setter for <code>bysj.admin.name</code>. ??
     */
    public IAdmin setName(String value);

    /**
     * Getter for <code>bysj.admin.name</code>. ??
     */
    @NotNull
    @Size(max = 255)
    public String getName();

    /**
     * Setter for <code>bysj.admin.account</code>. ??
     */
    public IAdmin setAccount(String value);

    /**
     * Getter for <code>bysj.admin.account</code>. ??
     */
    @NotNull
    @Size(max = 32)
    public String getAccount();

    /**
     * Setter for <code>bysj.admin.password</code>. ??
     */
    public IAdmin setPassword(String value);

    /**
     * Getter for <code>bysj.admin.password</code>. ??
     */
    @NotNull
    @Size(max = 64)
    public String getPassword();

    /**
     * Setter for <code>bysj.admin.created_at</code>. ????
     */
    public IAdmin setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>bysj.admin.created_at</code>. ????
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>bysj.admin.updated_at</code>. ????
     */
    public IAdmin setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>bysj.admin.updated_at</code>. ????
     */
    public LocalDateTime getUpdatedAt();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IAdmin
     */
    public void from(generated.tables.interfaces.IAdmin from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IAdmin
     */
    public <E extends generated.tables.interfaces.IAdmin> E into(E into);
}
