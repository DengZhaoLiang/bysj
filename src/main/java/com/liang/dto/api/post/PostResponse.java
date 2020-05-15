package com.liang.dto.api.post;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Date;

/**
 * @author Liang
 * com.liang.dto.api.post PostResponse  2020/5/15 0015  Liang
 */
@Data
@ApiModel("帖子列表")
public class PostResponse {

    @ApiModelProperty(value = "帖子Id")
    private Long id;

    @ApiModelProperty(value = "帖子标题")
    private String name;

    @ApiModelProperty(value = "帖子评论数")
    private Integer pv;

    @ApiModelProperty(value = "创建时间")
    private Date createdAt;

    @ApiModelProperty(value = "置顶标志")
    private Integer stick;

    @ApiModelProperty(value = "审核标志")
    private Integer check;

    @ApiModelProperty(value = "用户名")
    private String user;

    @ApiModelProperty(value = "用户头像")
    private String avatar;

    @ApiModelProperty(value = "userId")
    private Long userId;
}
