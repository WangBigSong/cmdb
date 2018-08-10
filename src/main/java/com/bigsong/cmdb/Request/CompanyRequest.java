package com.bigsong.cmdb.Request;

import io.swagger.annotations.ApiModelProperty;

public class CompanyRequest extends BaseRequest {
    @ApiModelProperty(value = "公司名字", name = "companyName", dataType = "String")
    private String companyName;
    @ApiModelProperty(value = "公司类型", name = "companyType", dataType = "String")
    private String companyType;

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getCompanyName() {

        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
