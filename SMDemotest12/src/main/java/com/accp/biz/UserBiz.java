package com.accp.biz;

import com.accp.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserBiz {
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
    boolean updateUser(User u);
}
