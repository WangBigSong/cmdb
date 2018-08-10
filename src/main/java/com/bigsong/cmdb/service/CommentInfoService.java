package com.bigsong.cmdb.service;

import com.bigsong.cmdb.Request.CommentRequest;
import com.bigsong.cmdb.model.CommentInfo;
import com.github.pagehelper.Page;

public interface CommentInfoService {
    int addComment(CommentInfo commentInfo);

    int delComment(long id);

    Page<CommentInfo> listByCompanyId(CommentRequest request);
}
