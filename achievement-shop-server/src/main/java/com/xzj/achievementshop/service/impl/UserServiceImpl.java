package com.xzj.achievementshop.service.impl;

import com.xzj.achievementshop.mapper.UserMapper;
import com.xzj.achievementshop.model.User;
import com.xzj.achievementshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: XuZhiJun
 * @Description:
 * @Date: Created in 15:09 2019/2/26
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getAll() {
        return mapper.getAll();
    }

    @Override
    public void insert(User user) {
        mapper.insert(user);
    }

    @Override
    public void update(User user) {
        mapper.update(user);
    }

    @Override
    public void delete(long id) {
        mapper.delete(id);
    }

    @Override
    public User queryByUserName(String username) {
        return mapper.queryByUserName(username);
    }
}
