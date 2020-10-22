package com.pan.baseserver.service.impl;

import com.pan.baseserver.dao.SysUserDao;
import com.pan.baseserver.service.SysUserService;
import entity.SysUserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户信息实现类
 *
 * @author tangpan
 * @date 2020-10-22 14:54
 */
@Service("sysUserService")
public class SysUserServiceIpml implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;

    @Override
    public SysUserEntity queryById(Long id) {
        return sysUserDao.queryById(id);
    }

    @Override
    public List<SysUserEntity> queryList(Map<String, Object> map) {
        return sysUserDao.queryList(map);
    }

    @Override
    public int countList(Map<String, Object> map) {
        return sysUserDao.countList(map);
    }

    @Override
    public void update(SysUserEntity sysUserEntity) {
        sysUserDao.update(sysUserEntity);
    }

    @Override
    public void delete(Map<String, Object> map) {
        sysUserDao.delete(map);
    }

    @Override
    public void insert(SysUserEntity sysUserEntity) {
        sysUserDao.insert(sysUserEntity);
    }
}
