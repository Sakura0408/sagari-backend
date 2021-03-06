package com.sagari.service;

import com.alibaba.fastjson.JSONObject;
import com.sagari.common.base.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

/**
 * @author biubiupiu~
 */
@Api(tags = "搜索服务接口")
public interface SearchService {

    @ApiOperation(value = "搜索文章、标签、用户")
    @GetMapping("/search")
    public BaseResponse<JSONObject> search(@RequestParam(name = "search") String search,
                                           @RequestParam(name = "page") Integer page) throws IOException;

    @ApiOperation(value = "同时根据文章标题、内容搜索")
    @GetMapping("/searchArticle")
    public BaseResponse<JSONObject> searchArticle(@RequestParam(name = "search") String search,
                                                  @RequestParam(name = "page") Integer page,
                                                  @RequestParam(name = "size") Integer size) throws IOException;

    @ApiOperation(value = "根据文章标题搜索")
    @GetMapping("/searchArticleByTitle")
    public BaseResponse<JSONObject> searchArticleByTitle(@RequestParam(name = "search") String title,
                                                         @RequestParam(name = "page") Integer page,
                                                         @RequestParam(name = "size") Integer size) throws IOException;

    @ApiOperation(value = "根据文章内容搜索")
    @GetMapping("/searchArticleByContent")
    public BaseResponse<JSONObject> searchArticleByContent(@RequestParam(name = "search") String content,
                                                           @RequestParam(name = "page") Integer page,
                                                           @RequestParam(name = "size") Integer size) throws IOException;

    @ApiOperation(value = "搜索栏搜索，返回搜素建议")
    @GetMapping("/searchAtBar")
    public BaseResponse<JSONObject> searchAtBar(@RequestParam(name = "search") String search) throws IOException;


    @ApiOperation(value = "搜索标签")
    @GetMapping("/searchTag")
    public BaseResponse<JSONObject> searchTag(@RequestParam(name = "search") String search,
                                              @RequestParam(name = "page") Integer page,
                                              @RequestParam(name = "size") Integer size) throws IOException;

    @ApiOperation(value = "搜索用户")
    @GetMapping("/searchUser")
    public BaseResponse<JSONObject> searchUser(@RequestParam(name = "search") String search,
                                               @RequestParam(name = "page") Integer page,
                                               @RequestParam(name = "size") Integer size) throws IOException;

    @ApiOperation(value = "获取首页推荐文章")
    @GetMapping("/getHomeArticle")
    public BaseResponse<JSONObject> getHomeArticle(@RequestParam(name = "page") Integer page,
                                                   @RequestParam(name = "size") Integer size) throws IOException;

    @ApiOperation(value = "根据分类获取文章")
    @GetMapping("/getArticleByCategory")
    public BaseResponse<JSONObject> getArticleByCategory(@RequestParam(name = "categoryId") Integer categoryId,
                                                         @RequestParam(name = "page") Integer page,
                                                         @RequestParam(name = "size") Integer size) throws IOException;

    @ApiOperation(value = "获取与文章相关的其他文章")
    @GetMapping("/getRelateArticle")
    public BaseResponse<JSONObject> getRelateArticle(@RequestParam(name = "articleId") Integer articleId) throws IOException;

    @ApiOperation(value = "删除文章，此接口仅需在完全删除文章时由系统自动调用")
    @GetMapping("/deleteArticle")
    public Boolean deleteArticle(@RequestParam(name = "articleId") Integer articleId,
                                 @RequestParam(name = "userId") Integer userId) throws IOException;

}
