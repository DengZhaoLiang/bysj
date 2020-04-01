package com.liang.dto.api.blog;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.blog.AdminBlogResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 * @author Liang
 * Created By 2020/3/25
 **/
@Data
@ApiModel("博客分页Response")
public class ApiBlogPageResponse {

    @ApiModelProperty(value = "分页内容体")
    private List<ApiBlogResponse> blog;

    @ApiModelProperty(value = "分页信息")
    private PageResponse page;

    @ApiModelProperty(value = "所有文章数")
    private Integer all;

    @ApiModelProperty(value = "新闻文章数")
    private Integer news;

    @ApiModelProperty(value = "教学文章数")
    private Integer teaching;

    @ApiModelProperty(value = "信息文章数")
    private Integer information;

    @ApiModelProperty(value = "最新内容体")
    private List<ApiBlogResponse> latest;

}
