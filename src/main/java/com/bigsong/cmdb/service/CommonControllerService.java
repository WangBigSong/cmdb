package com.bigsong.cmdb.service;

import com.bigsong.cmdb.response.WebResponse;

public interface CommonControllerService<T> {
    public WebResponse getWebResponse(T t);

}
