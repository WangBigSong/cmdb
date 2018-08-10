package com.bigsong.cmdb.service;

import com.bigsong.cmdb.Request.CompanyRequest;
import com.bigsong.cmdb.model.CompanyInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.util.List;

public interface CompanyInfoService {
    int delCompany(long id);

    int addCompany(CompanyInfo companyInfo);

    int updateCompany(CompanyInfo companyInfo);

    Page<CompanyInfo> listInfo(CompanyRequest request);
}
