package com.pan.baseserver.dao;

import dao.BaseDao;
import entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息
 *
 * @author tangpan
 * @date 2020-10-22 14:15
 */
@Mapper
public interface SysUserDao extends BaseDao<SysUserEntity> {

}
