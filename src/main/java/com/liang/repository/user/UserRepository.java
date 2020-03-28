package com.liang.repository.user;

import com.liang.DAO.user.UserDbStrategy;
import com.liang.dto.admin.user.AdminUserResponse;
import generated.tables.pojos.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

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
}
