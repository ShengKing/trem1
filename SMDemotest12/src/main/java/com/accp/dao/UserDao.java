package com.accp.dao;

import com.accp.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有用户
     * @return
     */
    List<User> queryUsers();

    /**
     * 根据ID查询单个用户
     * @return
     */
    User queryUser(@Param("uid") int uid);

    /**
     * 修改
     * @param u
     * @return
     */
    int updateUser(User u);
}
