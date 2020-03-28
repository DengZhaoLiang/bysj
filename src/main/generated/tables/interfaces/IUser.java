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
     * Setter for <code>bysj.user.email</code>. 邮箱
     */
    public IUser setEmail(String value);

    /**
     * Getter for <code>bysj.user.email</code>. 邮箱
     */
    @Size(max = 32)
    public String getEmail();

    /**
     * Setter for <code>bysj.user.phone</code>. 手机号
     */
    public IUser setPhone(String value);

    /**
     * Getter for <code>bysj.user.phone</code>. 手机号
     */
    @Size(max = 32)
    public String getPhone();

    /**
     * Setter for <code>bysj.user.password</code>. 密码
     */
    public IUser setPassword(String value);

    /**
     * Getter for <code>bysj.user.password</code>. 密码
     */
    @Size(max = 64)
    public String getPassword();

    /**
     * Setter for <code>bysj.user.name</code>. 昵称
     */
    public IUser setName(String value);

    /**
     * Getter for <code>bysj.user.name</code>. 昵称
     */
    @Size(max = 64)
    public String getName();

    /**
     * Setter for <code>bysj.user.last_login_at</code>. 最新登录时间
     */
    public IUser setLastLoginAt(LocalDateTime value);

    /**
     * Getter for <code>bysj.user.last_login_at</code>. 最新登录时间
     */
    public LocalDateTime getLastLoginAt();

    /**
     * Setter for <code>bysj.user.created_at</code>. 创建时间
     */
    public IUser setCreatedAt(LocalDateTime value);

    /**
     * Getter for <code>bysj.user.created_at</code>. 创建时间
     */
    public LocalDateTime getCreatedAt();

    /**
     * Setter for <code>bysj.user.updated_at</code>. 更新时间
     */
    public IUser setUpdatedAt(LocalDateTime value);

    /**
     * Getter for <code>bysj.user.updated_at</code>. 更新时间
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