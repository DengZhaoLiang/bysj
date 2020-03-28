package com.liang.DAO.user;

import com.liang.dto.admin.user.AdminUserResponse;
import com.liang.utils.DSLPlusUtils;
import generated.tables.pojos.User;
import generated.tables.records.UserRecord;
import java.util.List;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import static generated.tables.User.USER;

/**
 * @author Liang
 * Created By 2020/3/27
 **/
@Repository
public class UserDAO implements UserDbStrategy{

    @Autowired
    private DSLContext mDSLContext;

    @Override
    public List<AdminUserResponse> list(String params) {
        SelectQuery<UserRecord> query = mDSLContext.selectQuery(USER);
        query.addSelect(USER.fields());
        DSLPlusUtils.containsIfNotBlank(query,USER.NAME,params);
        return query.fetchInto(AdminUserResponse.class);
    }

    @Override
    public void insert(User user) {
        UserRecord record = mDSLContext.newRecord(USER, user);
        record.insert();
    }

    @Override
    public User detail(Long id) {
        return mDSLContext.selectFrom(USER)
                .where(USER.ID.eq(id))
                .fetchOneInto(User.class);
    }

    @Override
    public void update(User user) {
        UserRecord record = mDSLContext.newRecord(USER, user);
        record.update();
    }

    @Override
    public void delete(Long id) {
        mDSLContext.delete(USER)
                .where(USER.ID.eq(id))
                .execute();
    }

    @Override
    public void reset(Long id) {
        mDSLContext.update(USER)
                .set(USER.PASSWORD,"123456")
                .where(USER.ID.eq(id))
                .execute();
    }
}
