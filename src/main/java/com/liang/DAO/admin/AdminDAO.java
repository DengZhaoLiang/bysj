package com.liang.DAO.admin;

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
    public String login(String username, String password) {
        return mDSLContext.select(ADMIN.ACCOUNT)
                .from(ADMIN)
                .where(ADMIN.ACCOUNT.eq(username)
                        .and(ADMIN.PASSWORD.eq(password)))
                .fetchOneInto(String.class);
    }
}
