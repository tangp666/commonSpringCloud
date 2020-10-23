package com.pan.web.hystrix;

import com.pan.web.feign.SysUserFeign;
import enums.RequestEnum;
import org.springframework.stereotype.Component;
import query.ResultQuery;
import query.SysUserQuery;

/**
 * 用户信息调用熔断
 * @Component 交由spring管理
 * @author tangpan
 * @date 2020-10-23 13:49
 */
@Component
public class SysUserFallBack implements SysUserFeign {

    /**
     * 用户列表数据查询熔断
     * @param userQuery 用户信息条件
     * @return
     */
    @Override
    public ResultQuery queryUserList(SysUserQuery userQuery) {
        ResultQuery resultQuery = new ResultQuery();
        resultQuery.setCode(RequestEnum.EXCEPTION.getCode());
        resultQuery.setMsg(RequestEnum.EXCEPTION.getMsg());
        return resultQuery;
    }
}
