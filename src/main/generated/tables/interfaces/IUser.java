/*
 * This file is generated by jOOQ.
 */
package generated.tables.interfaces;


import java.io.Serializable;
import java.time.LocalDateTime;

import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IUser extends Serializable {

    /**
     * Setter for <code>bysj.user.id</code>.
     */
    public IUser setId(Long value);

    /**
     * Getter for <code>bysj.user.id</code>.
     */
    public Long getId();

    /**
     * Setter for <code>bysj.user.email</code>. ??
     */
    public IUser setEmail(String value);

    /**
     * Getter for <code>bysj.user.email</code>. ??
     */
    @Size(max = 32)
    public String getEmail();

    /**
     * Setter for <code>bysj.user.phone</code>. ???
     */
    public IUser setPhone(String value);

    /**
     * Getter for <code>bysj.user.phone</code>. ???
     */
    @Size(max = 32)
    public String getPhone();

    /**
     * Setter for <code>bysj.user.password</code>. ??
     */
    public IUser setPassword(String value);

    /**
     * Getter for <code>bysj.user.password</code>. ??
     */
    @Size(max = 64)
    public String getPassword();

    /**
     * Setter for <code>bysj.user.name</code>. ??
     */
    public IUser setName(String value);

    /**
     * Getter for <code>bysj.user.name</code>. ??
     */
    @Size(max = 64)
    public String getName();

    /**
     * Setter for <code>bysj.user.last_login_at</code>. ??????
     */
    public IUser setLastLoginAt(LocalDateTime value);

    /**
     * Getter for <code>bysj.user.last_login_at</code>. ??????
     */
    public LocalDateTime getLastLoginAt();

    /**
     * Setter for <code>bysj.user.created_at</code>. ????
     */
    public IUser setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>bysj.user.created_at</code>. ????
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>bysj.user.updated_at</code>. ????
     */
    public IUser setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>bysj.user.updated_at</code>. ????
     */
    public LocalDateTime getUpdatedAt();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IUser
     */
    public void from(generated.tables.interfaces.IUser from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IUser
     */
    public <E extends generated.tables.interfaces.IUser> E into(E into);
}
