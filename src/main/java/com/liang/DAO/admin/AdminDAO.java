package com.liang.DAO.admin;

import com.liang.dto.admin.admin.AdminResponse;
import generated.tables.pojos.Admin;
import java.util.List;
import java.util.Optional;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static generated.Tables.ADMIN;

/**
 * @author Liang
 * Created By 2020/3/19
 **/
@Repository
public class AdminDAO implements AdminDbStrategy {

    @Autowired
    private DSLContext mDSLContext;

    @Override
    public Admin login(String username, String password) {
        return mDSLContext.selectFrom(ADMIN)
                .where(ADMIN.ACCOUNT.eq(username)
                        .and(ADMIN.PASSWORD.eq(password)))
                .fetchOneInto(Admin.class);
    }

    @Override
    public List<AdminResponse> list() {
        return mDSLContext.selectFrom(ADMIN)
                .fetchInto(AdminResponse.class);
    }

    @Override
    public Optional<Admin> getAdminById(Long id) {
        return mDSLContext.selectFrom(ADMIN)
                .where(ADMIN.ID.eq(id))
                .fetchOptionalInto(Admin.class);
    }
}
