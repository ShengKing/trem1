package com.accp.biz.impl;

import com.accp.biz.UserBiz;
import com.accp.dao.UserDao;
import com.accp.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userBiz")
public class UserBizImpl implements UserBiz {
    @Resource(name = "userDao")
    private UserDao userDao;

    public List<User> queryUsers() {
        return userDao.queryUsers();
    }

    public User queryUser(int uid) {
        return userDao.queryUser(uid);
    }

    public boolean updateUser(User u) {
        return userDao.updateUser(u)>0;
    }
}
