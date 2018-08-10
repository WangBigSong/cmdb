package com.bigsong.cmdb.Request;

import io.swagger.annotations.ApiModelProperty;

public class BaseRequest {
    @ApiModelProperty(value = "页数",name = "pageNum",dataType = "Integer")
    private Integer pageNum = 1;
    @ApiModelProperty(value = "每页显示条数",name = "pageSize",dataType = "Integer")
    private Integer pageSize = 10;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
