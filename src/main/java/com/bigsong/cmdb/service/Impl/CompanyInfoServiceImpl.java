package com.bigsong.cmdb.service.Impl;

import com.bigsong.cmdb.Request.CompanyRequest;
import com.bigsong.cmdb.mapper.CompanyInfoMapper;
import com.bigsong.cmdb.model.CompanyInfo;
import com.bigsong.cmdb.model.CompanyInfoExample;
import com.bigsong.cmdb.service.CompanyInfoService;
import com.bigsong.cmdb.utils.NullUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CompanyInfoServiceImpl implements CompanyInfoService {
    private final Logger logger = LoggerFactory.getLogger(AdminUserServiceImpl.class);

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public int delCompany(long id) {
        return companyInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int addCompany(CompanyInfo companyInfo) {
        return companyInfoMapper.insert(companyInfo);
    }

    @Override
    public int updateCompany(CompanyInfo companyInfo) {
        return companyInfoMapper.updateByPrimaryKey(companyInfo);
    }

    @Override
    public Page<CompanyInfo> listInfo(CompanyRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        return companyInfoMapper.findCompanyByPage(request);
    }
}
