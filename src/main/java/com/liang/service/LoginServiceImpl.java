package com.liang.service;

import com.liang.repository.user.IUserRepository;
import generated_jooq.tables.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private IUserRepository mIUserRepository;

    @Override
    public User login(String username, String password) {
        return mIUserRepository.login(username, password);
    }

    @Override
    public void setLastLoginTime(User user) {
        user.setLastLoginAt(LocalDateTime.now());
        mIUserRepository.update(user);
    }

    @Override
    public boolean existByPhone(String phone) {
        return mIUserRepository.existByPhone(phone);
    }

    @Override
    public boolean existByEmail(String email) {
        return mIUserRepository.existByEmail(email);
    }

    @Override
    public void register(User user) {
        mIUserRepository.insert(user);
    }
}
