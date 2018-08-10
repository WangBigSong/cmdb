package com.bigsong.cmdb.utils;

import com.bigsong.cmdb.response.WebResponse;

public class WebResponseUtil {

    public static final WebResponse returnSucc(Object o) {
        WebResponse webResponse = new WebResponse();
        if (NullUtil.isNotEmpty(o)) {
            webResponse.setData(o);
        }
        return webResponse;
    }

    public static final WebResponse returnErro(Object o) {
        WebResponse webResponse = new WebResponse();
        webResponse.setResultCode("0001");
        webResponse.setResultMessage("error");
        if (NullUtil.isNotEmpty(o)) {
            webResponse.setData(o);
        }
        return webResponse;
    }

}
