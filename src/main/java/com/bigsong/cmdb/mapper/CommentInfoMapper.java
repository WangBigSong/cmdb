package com.bigsong.cmdb.mapper;

import com.bigsong.cmdb.Request.CommentRequest;
import com.bigsong.cmdb.model.CommentInfo;
import com.bigsong.cmdb.model.CommentInfoExample;

import java.util.List;

import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface CommentInfoMapper {
    int countByExample(CommentInfoExample example);

    int deleteByExample(CommentInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentInfo record);

    int insertSelective(CommentInfo record);

    List<CommentInfo> selectByExample(CommentInfoExample example);

    CommentInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByExample(@Param("record") CommentInfo record, @Param("example") CommentInfoExample example);

    int updateByPrimaryKeySelective(CommentInfo record);

    int updateByPrimaryKey(CommentInfo record);

    Page<CommentInfo> findCompanyByPage(CommentRequest request);
}