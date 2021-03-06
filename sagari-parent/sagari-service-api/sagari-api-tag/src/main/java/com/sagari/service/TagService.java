package com.sagari.service;

import com.alibaba.fastjson.JSONObject;
import com.sagari.common.base.BaseResponse;
import com.sagari.dto.input.TagInputDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author biubiupiu~
 */
@Api(tags = "标签服务接口")
public interface TagService {

    @ApiOperation(value = "创建标签接口")
    @PutMapping("/createTag")
    public BaseResponse<JSONObject> createTag(@RequestBody @Valid TagInputDTO tagInputDTO,
                                              BindingResult bindingResult);

    @ApiOperation(value = "获取所有标签接口")
    @GetMapping("/getTag")
    public BaseResponse<JSONObject> getTag();

    @ApiOperation(value = "获取热门标签接口")
    @GetMapping("/getHotTag")
    public BaseResponse<JSONObject> getHotTag();

    @ApiOperation(value = "根据标签ID列表批量获取标签接口")
    @PostMapping("/getTagBatch")
    public BaseResponse<JSONObject> getTagBatch(@RequestBody List<Integer> tagIds);

    @ApiOperation(value = "增加标签的文章数量")
    @PostMapping("/incrArticleCount")
    public BaseResponse<JSONObject> incrArticleCount(@RequestBody List<Integer> tagIds);

    @ApiOperation(value = "获取所有标签分类接口")
    @GetMapping("/getCategory")
    public BaseResponse<JSONObject> getCategory();

    @ApiOperation(value = "关注或取消关注标签")
    @PostMapping("/toggleFollowTag")
    public BaseResponse<JSONObject> toggleFollowTag(@RequestParam("tagId") Integer tagId);

    @ApiOperation(value = "获取用户关注的标签")
    @GetMapping("/getFollowTags")
    public BaseResponse<JSONObject> getFollowTags(@RequestParam("userId") Integer userId);

    @ApiOperation(value = "根据分类ID获取该分类下的所有标签")
    @GetMapping("/getTagsByCategory")
    public BaseResponse<JSONObject> getTagsByCategory(@RequestParam("categoryId") Integer categoryId);

}
