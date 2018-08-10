package com.bigsong.cmdb.service.Impl;

import com.bigsong.cmdb.Request.CommentRequest;
import com.bigsong.cmdb.mapper.CommentInfoMapper;
import com.bigsong.cmdb.model.CommentInfo;
import com.bigsong.cmdb.service.CommentInfoService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommentInfoServiceImpl implements CommentInfoService {
    private final Logger logger = LoggerFactory.getLogger(CommentInfoServiceImpl.class);

    @Autowired
    private CommentInfoMapper commentInfoMapper;

    @Override
    public int addComment(CommentInfo commentInfo) {
        return commentInfoMapper.insert(commentInfo);
    }

    @Override
    public int delComment(long id) {
        return commentInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Page<CommentInfo> listByCompanyId(CommentRequest request) {
        PageHelper.startPage(request.getPageNum(), request.getPageSize());
        return commentInfoMapper.findCompanyByPage(request);
    }
}
