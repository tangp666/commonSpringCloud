package com.pan.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录
 *
 * @author joy200300
 * @date 2020/10/20 17:34
 */
@Controller
public class LoginController {

    /**
     * 默认登录
     * @return
     */
    @RequestMapping("")
    public String login(){
        return "login";
    }

}
