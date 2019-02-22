package com.tries.fly.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.tries.fly.dao.impala.TestDao;
import com.tries.fly.service.TestService;
import com.tries.fly.service.PermissionService;
import com.tries.fly.util.CommonUtil;
import com.tries.fly.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tries.fly.dao.mysql.LoginDao;

/**
 * @author: hxy
 * @description: 登录service实现类
 * @date: 2017/10/24 11:53
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private LoginDao loginDao;
    @Autowired
    private PermissionService permissionService;
    @Autowired
    private TestDao testDao;

    @Override
    public JSONObject test() {
        return testDao.getUser();
    }
}
