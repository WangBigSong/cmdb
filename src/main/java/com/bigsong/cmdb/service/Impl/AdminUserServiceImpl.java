package com.bigsong.cmdb.service.Impl;

import com.bigsong.cmdb.mapper.UserInfoMapper;
import com.bigsong.cmdb.model.UserInfo;
import com.bigsong.cmdb.model.UserInfoExample;
import com.bigsong.cmdb.service.AdminUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminUserServiceImpl implements AdminUserService {
    private final Logger logger = LoggerFactory.getLogger(AdminUserServiceImpl.class);


    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public List<UserInfo> login(UserInfo userInfo) {
        UserInfoExample example = new UserInfoExample();
        UserInfoExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(userInfo.getName());
        criteria.andPassEqualTo(userInfo.getPass());
        return  userInfoMapper.selectByExample(example);
    }

    @Override
    public int addUser(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }
}
