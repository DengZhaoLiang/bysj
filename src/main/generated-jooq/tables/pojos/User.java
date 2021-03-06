/*
 * This file is generated by jOOQ.
 */
package generated.tables.pojos;


import generated.tables.interfaces.IUser;

import java.time.LocalDateTime;

import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class User implements IUser {

    private static final long serialVersionUID = 385597005;

    private Long          id;
    private String        email;
    private String        phone;
    private String        password;
    private String        name;
    private LocalDateTime lastLoginAt;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User() {}

    public User(IUser value) {
        this.id = value.getId();
        this.email = value.getEmail();
        this.phone = value.getPhone();
        this.password = value.getPassword();
        this.name = value.getName();
        this.lastLoginAt = value.getLastLoginAt();
        this.createdAt = value.getCreatedAt();
        this.updatedAt = value.getUpdatedAt();
    }

    public User(
        Long          id,
        String        email,
        String        phone,
        String        password,
        String        name,
        LocalDateTime lastLoginAt,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.name = name;
        this.lastLoginAt = lastLoginAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public User setId(Long id) {
        this.id = id;
        return this;
    }

    @Size(max = 32)
    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    @Size(max = 32)
    @Override
    public String getPhone() {
        return this.phone;
    }

    @Override
    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Size(max = 64)
    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    @Size(max = 64)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public User setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public LocalDateTime getLastLoginAt() {
        return this.lastLoginAt;
    }

    @Override
    public User setLastLoginAt(LocalDateTime lastLoginAt) {
        this.lastLoginAt = lastLoginAt;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public User setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public User setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        }
        else if (!email.equals(other.email))
            return false;
        if (phone == null) {
            if (other.phone != null)
                return false;
        }
        else if (!phone.equals(other.phone))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        }
        else if (!password.equals(other.password))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (lastLoginAt == null) {
            if (other.lastLoginAt != null)
                return false;
        }
        else if (!lastLoginAt.equals(other.lastLoginAt))
            return false;
        if (createdAt == null) {
            if (other.createdAt != null)
                return false;
        }
        else if (!createdAt.equals(other.createdAt))
            return false;
        if (updatedAt == null) {
            if (other.updatedAt != null)
                return false;
        }
        else if (!updatedAt.equals(other.updatedAt))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.phone == null) ? 0 : this.phone.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.lastLoginAt == null) ? 0 : this.lastLoginAt.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(phone);
        sb.append(", ").append(password);
        sb.append(", ").append(name);
        sb.append(", ").append(lastLoginAt);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    @Override
    public void from(IUser from) {
        setId(from.getId());
        setEmail(from.getEmail());
        setPhone(from.getPhone());
        setPassword(from.getPassword());
        setName(from.getName());
        setLastLoginAt(from.getLastLoginAt());
        setCreatedAt(from.getCreatedAt());
        setUpdatedAt(from.getUpdatedAt());
    }

    @Override
    public <E extends IUser> E into(E into) {
        into.from(this);
        return into;
    }
}
