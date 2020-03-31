package com.liang.dto.admin.banner;

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
@ApiModel("轮播图列表")
@EqualsAndHashCode(callSuper = false)
public class AdminBannerResponse extends BaseResponse {

    /**
     * 轮播图编号
     * 轮播图标题
     * 轮播图描述
     * 轮播图路径
     * 文章Id
     * 创建时间
     * 更新时间
     * 操作
     */

    @ApiModelProperty(value = "轮播图编号")
    private Long id;

    @ApiModelProperty(value = "轮播图标题")
    private String name;

    @ApiModelProperty(value = "轮播图描述")
    private String describe;

    @ApiModelProperty(value = "轮播图路径")
    private String img;

    @ApiModelProperty(value = "文章Id")
    private Long blogId;

    @ApiModelProperty(value = "创建时间")
    private Date createdAt;

    @ApiModelProperty(value = "更新时间")
    private Date updatedAt;
}
