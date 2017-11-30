package com.accp.servlet;

import com.accp.biz.UserBiz;
import com.accp.entity.User;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

@Controller("userServlet")
public class UserServlet {
    @Resource(name = "userBiz")
    private UserBiz userBiz;

    public void queryUsers(){
        List<User> users = userBiz.queryUsers();
        for (User u: users         ) {
            System.out.println(u);
        }
    }

    public void queryUser(int uid){
        User user = userBiz.queryUser(uid);
        System.out.println(user);
    }

    public void updateUser(User u){
        if(userBiz.updateUser(u)){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
    }
}
