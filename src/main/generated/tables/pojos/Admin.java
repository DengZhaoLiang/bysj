/*
 * This file is generated by jOOQ.
 */
package generated.tables.pojos;


import generated.tables.interfaces.IAdmin;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.types.ULong;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Admin implements IAdmin {

    private static final long serialVersionUID = 2016063408;

    private ULong         id;
    private String        name;
    private String        account;
    private String        password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Admin() {}

    public Admin(IAdmin value) {
        this.id = value.getId();
        this.name = value.getName();
        this.account = value.getAccount();
        this.password = value.getPassword();
        this.createdAt = value.getCreatedAt();
        this.updatedAt = value.getUpdatedAt();
    }

    public Admin(
        ULong         id,
        String        name,
        String        account,
        String        password,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
    ) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public ULong getId() {
        return this.id;
    }

    @Override
    public Admin setId(ULong id) {
        this.id = id;
        return this;
    }

    @NotNull
    @Size(max = 255)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Admin setName(String name) {
        this.name = name;
        return this;
    }

    @NotNull
    @Size(max = 32)
    @Override
    public String getAccount() {
        return this.account;
    }

    @Override
    public Admin setAccount(String account) {
        this.account = account;
        return this;
    }

    @NotNull
    @Size(max = 64)
    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public Admin setPassword(String password) {
        this.password = password;
        return this;
    }

    @Override
    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Admin setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @Override
    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    @Override
    public Admin setUpdatedAt(LocalDateTime updatedAt) {
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
        final Admin other = (Admin) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (account == null) {
            if (other.account != null)
                return false;
        }
        else if (!account.equals(other.account))
            return false;
        if (password == null) {
            if (other.password != null)
                return false;
        }
        else if (!password.equals(other.password))
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
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.account == null) ? 0 : this.account.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.createdAt == null) ? 0 : this.createdAt.hashCode());
        result = prime * result + ((this.updatedAt == null) ? 0 : this.updatedAt.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Admin (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(account);
        sb.append(", ").append(password);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
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
}
