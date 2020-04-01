package com.liang.dto.admin.blogBg;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liang.dto.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.validation.annotation.Validated;

/**
 * @author Liang
 * Created By 2020/3/23
 **/
@Data
@Validated
@ApiModel("博客背景图列表")
@EqualsAndHashCode(callSuper = false)
public class AdminBlogBgResponse extends BaseResponse {
    /**
     * 博客背景图编号
     * 博客背景图名
     * 博客背景图描述
     * 博客背景图类型
     * 博客背景图
     * 创建时间
     * 更新时间
     */

    @ApiModelProperty(value = "博客背景图编号")
    private Long id;

    @ApiModelProperty(value = "博客背景图名")
    private String name;

    @ApiModelProperty(value = "博客背景图描述")
    private String describe;

    @ApiModelProperty(value = "博客背景图类型")
    private String typeStr;

    @ApiModelProperty(value = "博客背景图")
    private String img;

    @ApiModelProperty(value = "创建时间")
    private Date createdAt;

    @ApiModelProperty(value = "更新时间")
    private Date updatedAt;

    @ApiModelProperty(value = "博客背景图类型")
    @JsonIgnore
    private Integer type;
}
