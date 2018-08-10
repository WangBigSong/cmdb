package com.bigsong.cmdb.Request;

import io.swagger.annotations.ApiModelProperty;

public class CommentRequest extends BaseRequest {
   @ApiModelProperty(value = "公司編號",name = "companyId",dataType = "String")
    private String companyId;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}
