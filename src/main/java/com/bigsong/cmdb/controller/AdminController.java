package com.bigsong.cmdb.controller;


import com.bigsong.cmdb.model.UserInfo;
import com.bigsong.cmdb.response.WebResponse;
import com.bigsong.cmdb.service.AdminUserService;


import com.bigsong.cmdb.utils.WebResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.kie.api.KieBase;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    private final Logger logger = LoggerFactory.getLogger(AdminController.class);
    @Autowired
    private KieSession session;

    @Autowired
    private KieBase kieBase;

    @Autowired
    private AdminUserService adminUserService;


    @ApiOperation(value = "用户登录", notes = "用户登录")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private WebResponse adminLogin(@RequestBody UserInfo userInfo) {

        session.insert(userInfo);//插入
        int i= session.fireAllRules();//执行规则
        logger.info("======================用户登录=============================");
        List<UserInfo> DbUser = adminUserService.login(userInfo);
        if (DbUser.size() > 0) {
            return WebResponseUtil.returnSucc(DbUser.get(0));
        } else {
            return WebResponseUtil.returnErro("登录失败!用户名或密码错误!");
        }
    }

    @ApiOperation(value = "新增用户信息", notes = "新增用户信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private WebResponse addUser(@RequestBody UserInfo userInfo) {
        logger.info("======================新增用户信息=============================");
        int count = adminUserService.addUser(userInfo);
        if (count > 0) {
            return WebResponseUtil.returnSucc("新增用户成功");
        } else {
            return WebResponseUtil.returnErro("新增用户失败");
        }
    }

}
