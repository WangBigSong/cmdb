package com.bigsong.cmdb.controller;

import com.bigsong.cmdb.Request.CompanyRequest;
import com.bigsong.cmdb.model.CompanyInfo;
import com.bigsong.cmdb.response.WebResponse;
import com.bigsong.cmdb.service.CompanyInfoService;
import com.bigsong.cmdb.utils.WebResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/company")
public class CompanyInfoController {
    private final Logger logger = LoggerFactory.getLogger(CompanyInfoController.class);

    @Autowired
    private CompanyInfoService companyInfoService;


    @ApiOperation(value = "添加公司信息", notes = "添加公司信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    private WebResponse addCompanyInfo(@RequestBody CompanyInfo companyInfo) {
        logger.info("======================新增公司信息=============================");
        int count = companyInfoService.addCompany(companyInfo);
        if (count > 0) {
            return WebResponseUtil.returnSucc("新增成功");
        } else {
            return WebResponseUtil.returnSucc("新增失败");
        }
    }


    @ApiOperation(value = "删除公司信息", notes = "删除公司信息")
    @RequestMapping(value = "/del", method = RequestMethod.POST)
    private WebResponse delCompanyInfo(@RequestParam(value = "id") long id) {
        logger.info("======================删除公司信息 =============================");
        int count = companyInfoService.delCompany(id);
        if (count > 0) {
            return WebResponseUtil.returnSucc("删除成功");
        } else {
            return WebResponseUtil.returnSucc("删除失败");
        }
    }


    @ApiOperation(value = "修改公司信息", notes = "修改公司信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    private WebResponse updateCompany(@RequestBody CompanyInfo companyInfo) {
        logger.info("======================修改公司信息 =============================");
        int count = companyInfoService.updateCompany(companyInfo);
        if (count > 0) {
            return WebResponseUtil.returnSucc("修改成功");
        } else {
            return WebResponseUtil.returnSucc("修改失败");
        }
    }

    @ApiOperation(value = "公司列表", notes = "公司列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    private WebResponse listCompany(@ModelAttribute CompanyRequest request) {
        logger.info("======================公司列表 =============================");
        return WebResponseUtil.returnSucc(companyInfoService.listInfo(request));
    }
}
