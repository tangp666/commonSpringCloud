package com.pan.web.controller;

import com.pan.web.feign.SysUserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import query.ResultQuery;
import query.SysUserQuery;

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

    @Autowired
    private SysUserFeign userFeign;

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

    /**
     * 列表信息
     * @param userQuery 用户信息条件
     * @return 列表信息
     */
    @RequestMapping(value = "userList", method = RequestMethod.POST)
    @ResponseBody
    public ResultQuery userList(SysUserQuery userQuery){
        return userFeign.queryUserList(userQuery);
    }

}
