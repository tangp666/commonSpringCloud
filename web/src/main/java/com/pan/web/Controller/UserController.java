package com.pan.web.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户信息
 *
 * @author joy200300
 * @date 2020/10/21 17:00
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 用户列表跳转
     * @param model
     * @param request request请求参数
     * @return 页面
     */
    @RequestMapping(value = "user")
    public String user(Model model, HttpServletRequest request){
        return "userList";
    }

}
