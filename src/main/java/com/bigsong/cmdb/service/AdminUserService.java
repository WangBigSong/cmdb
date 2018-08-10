package com.bigsong.cmdb.service;

import com.bigsong.cmdb.model.UserInfo;

import java.util.List;

public interface AdminUserService {
    List<UserInfo> login(UserInfo userInfo);

    int addUser(UserInfo userInfo);
}
