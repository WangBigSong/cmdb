package com.bigsong.cmdb.controller;


import com.bigsong.cmdb.model.UserInfo;
import com.bigsong.cmdb.response.WebResponse;
import com.bigsong.cmdb.service.AdminUserService;

import com.bigsong.cmdb.service.CompanyInfoService;
import com.bigsong.cmdb.utils.NullUtil;
import com.bigsong.cmdb.utils.WebResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    private AdminUserService adminUserService;

    @Autowired
    private CompanyInfoService companyInfoService;

    @ApiOperation(value = "用户登录", notes = "用户登录")
    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    private WebResponse adminLogin(@RequestBody UserInfo userInfo) {
        logger.info("======================用户登录=============================");
        List<UserInfo> DbUser = adminUserService.login(userInfo);
        if (DbUser.size() > 0) {
            return WebResponseUtil.returnSucc(DbUser.get(0));
        } else {
            return WebResponseUtil.returnErro("登录失败!用户名或密码错误!");
        }
    }

    @ApiOperation(value = "新增用户信息", notes = "新增用户信息")
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
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
