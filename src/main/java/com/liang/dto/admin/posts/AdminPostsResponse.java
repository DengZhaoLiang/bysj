package com.liang.dto.admin.posts;

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
@ApiModel("帖子列表")
@EqualsAndHashCode(callSuper = false)
public class AdminPostsResponse extends BaseResponse {
    /**
     * 帖子编号
     * 帖子名
     * 帖子描述
     * 帖子评论数
     * 帖子状态
     * 置顶状态
     * 审核状态
     * 用户Id
     * 创建时间
     * 更新时间
     */

    @ApiModelProperty(value = "帖子编号")
    private Long id;

    @ApiModelProperty(value = "帖子名")
    private String name;

    @ApiModelProperty(value = "帖子描述")
    private String describe;

    @ApiModelProperty(value = "帖子评论数")
    private Integer pv;

    @ApiModelProperty(value = "帖子状态 1-可评论 0-已完贴")
    private Integer type;

    @ApiModelProperty(value = "置顶状态 0-否 1-是")
    private Integer stick;

    @ApiModelProperty(value = "审核状态 0-拒绝 1-通过")
    private Integer check;

    @ApiModelProperty(value = "用户Id")
    private Integer userId;

    @ApiModelProperty(value = "创建时间")
    private Date createdAt;

    @ApiModelProperty(value = "更新时间")
    private Date updatedAt;
}
