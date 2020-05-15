package com.liang.repository.user;

import com.liang.DAO.user.UserDbStrategy;
import com.liang.dto.admin.user.AdminUserResponse;
import generated_jooq.tables.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/3/27
 **/
@Repository
@Primary
public class UserRepository implements IUserRepository {

    @Autowired
    private UserDbStrategy mUserDbStrategy;

    @Override
    public List<AdminUserResponse> list(String params) {
        return mUserDbStrategy.list(params);
    }

    @Override
    public void insert(User user) {
        mUserDbStrategy.insert(user);
    }

    @Override
    public User detail(Long id) {
        return mUserDbStrategy.detail(id);
    }

    @Override
    public void update(User user) {
        mUserDbStrategy.update(user);
    }

    @Override
    public void delete(Long id) {
        mUserDbStrategy.delete(id);
    }

    @Override
    public void reset(Long id) {
        mUserDbStrategy.reset(id);
    }

    @Override
    public User login(String username, String password) {
        return mUserDbStrategy.login(username, password);
    }

    @Override
    public boolean existByPhone(String phone) {
        return mUserDbStrategy.existByPhone(phone);
    }

    @Override
    public boolean existByEmail(String email) {
        return mUserDbStrategy.existByEmail(email);
    }
}
