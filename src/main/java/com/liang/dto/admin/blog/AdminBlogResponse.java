package com.liang.dto.admin.blog;

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
@ApiModel("博客列表")
@EqualsAndHashCode(callSuper = false)
public class AdminBlogResponse extends BaseResponse {
    /**
     * 博客编号
     * 博客名
     * 博客描述
     * 博客类型
     * 博客访问量
     * 创建时间
     * 更新时间
     */

    @ApiModelProperty(value = "博客编号")
    private Long id;

    @ApiModelProperty(value = "博客名")
    private String name;

    @ApiModelProperty(value = "博客描述")
    private String describe;

    @ApiModelProperty(value = "博客类型")
    private String typeStr;

    @ApiModelProperty(value = "博客访问量")
    private Long pv;

    @ApiModelProperty(value = "创建时间")
    private Date createdAt;

    @ApiModelProperty(value = "更新时间")
    private Date updatedAt;

    @ApiModelProperty(value = "博客类型")
    @JsonIgnore
    private Integer type;
}
