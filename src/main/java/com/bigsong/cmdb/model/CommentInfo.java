package com.bigsong.cmdb.model;

import java.util.Date;

public class CommentInfo {
    private Long id;

    private String commentCont;

    private Date commentTime;

    private String companyId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommentCont() {
        return commentCont;
    }

    public void setCommentCont(String commentCont) {
        this.commentCont = commentCont == null ? null : commentCont.trim();
    }

    public Date getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(Date commentTime) {
        this.commentTime = commentTime;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }
}