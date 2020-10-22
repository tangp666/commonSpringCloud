package com.pan.baseserver.controller;

import com.alibaba.fastjson.JSONObject;
import com.pan.baseserver.service.SysUserService;
import entity.SysUserEntity;
import enums.RequestEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import query.ResultQuery;
import query.SysUserQuery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户信息
 *
 * @author tangpan
 * @date 2020-10-22 14:09
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private SysUserService sysUserService;

    /**
     * 用户列表信息
     * @param sysUserQuery 用户信息条件
     * @return
     */
    @RequestMapping(value = "userList", method = RequestMethod.POST)
    @ResponseBody
    public ResultQuery querySysUserList(SysUserQuery sysUserQuery){
        //拼接参数
        Map<String,Object> map = new HashMap<>();
        map.put("name",sysUserQuery.getName());
        map.put("account",sysUserQuery.getAccount());
        map.put("phone",sysUserQuery.getPhone());
        map.put("mail",sysUserQuery.getMail());
        map.put("sort",sysUserQuery.getSort());
        map.put("order",sysUserQuery.getOrder());
        map.put("curPage",sysUserQuery.getCurPage());
        map.put("pageSize",sysUserQuery.getPageSize());

        ResultQuery resultQuery = new ResultQuery();
        try {
            //列表数量查询
            List<SysUserEntity> sysUserEntities = sysUserService.queryList(map);
            int total = sysUserService.countList(map);
            JSONObject object = new JSONObject();
            object.put("data",sysUserEntities);
            object.put("total",total);
            resultQuery.setCode(RequestEnum.SUCCESS.getCode());
            resultQuery.setMsg(RequestEnum.SUCCESS.getMsg());
            resultQuery.setData(object);
        } catch (Exception e) {
            /* 异常信息 */
            resultQuery.setCode(RequestEnum.EXCEPTION.getCode());
            resultQuery.setMsg(RequestEnum.EXCEPTION.getMsg());
            e.printStackTrace();
        }
        return resultQuery;
    }
}
