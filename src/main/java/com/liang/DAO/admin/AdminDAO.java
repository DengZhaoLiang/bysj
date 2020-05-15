package com.liang.DAO.admin;

import com.liang.dto.admin.admin.AdminResponse;
import com.liang.utils.DSLPlusUtils;
import generated_jooq.tables.pojos.Admin;
import generated_jooq.tables.records.AdminRecord;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static generated_jooq.Tables.ADMIN;

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
    public List<AdminResponse> list(String params) {
        SelectQuery<AdminRecord> query = mDSLContext.selectQuery(ADMIN);
        query.addSelect(ADMIN.fields());
        DSLPlusUtils.containsIfNotBlank(query, ADMIN.NAME, params);
        return query.fetchInto(AdminResponse.class);
    }

    @Override
    public Optional<Admin> getAdminById(Long id) {
        return mDSLContext.selectFrom(ADMIN)
                .where(ADMIN.ID.eq(id))
                .fetchOptionalInto(Admin.class);
    }

    @Override
    public void insert(Admin admin) {
        AdminRecord record = mDSLContext.newRecord(ADMIN, admin);
        record.insert();
    }

    @Override
    public void update(Admin admin) {
        AdminRecord record = mDSLContext.newRecord(ADMIN, admin);
        record.update();
    }

    @Override
    public void delete(Long id) {
        mDSLContext.delete(ADMIN)
                .where(ADMIN.ID.eq(id))
                .execute();
    }
}
