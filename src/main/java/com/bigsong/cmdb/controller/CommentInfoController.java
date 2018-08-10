package com.bigsong.cmdb.controller;

import com.bigsong.cmdb.Request.CommentRequest;
import com.bigsong.cmdb.model.CommentInfo;
import com.bigsong.cmdb.response.WebResponse;
import com.bigsong.cmdb.service.CommentInfoService;
import com.bigsong.cmdb.utils.WebResponseUtil;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentInfoController {
    private final Logger logger = LoggerFactory.getLogger(CommentInfoController.class);

    @Autowired
    private CommentInfoService commentInfoService;

    @ApiOperation(value = "添加評論", notes = "添加評論")
    @RequestMapping(value = "/addComment", method = RequestMethod.POST)
    private WebResponse addComment(@RequestBody CommentInfo request) {
        logger.info("======================添加評論 =============================");
        return WebResponseUtil.returnSucc(commentInfoService.addComment(request));
    }


    @ApiOperation(value = "刪除評論", notes = "刪除評論")
    @RequestMapping(value = "/delComment", method = RequestMethod.POST)
    private WebResponse delComment(@RequestParam(value = "id") long id) {
        logger.info("======================刪除評論 =============================");
        return WebResponseUtil.returnSucc(commentInfoService.delComment(id));
    }


    @ApiOperation(value = "通過公司編號 獲取評論列表, 不传编号就显示所有的评论", notes = "通過公司編號 獲取評論列表")
    @RequestMapping(value = "/listComment", method = RequestMethod.GET)
    private WebResponse listComment(@ModelAttribute CommentRequest request) {
        logger.info("======================評論列表 =============================");
        return WebResponseUtil.returnSucc(commentInfoService.listByCompanyId(request));
    }


}
