package com.liang.dto.admin.user;

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
@ApiModel("用户列表")
@EqualsAndHashCode(callSuper = false)
public class AdminUserResponse extends BaseResponse {

    /**
     * 用户编号
     * 用户姓名
     * 用户邮箱
     * 用户手机号
     * 用户密码
     * 最新登录时间
     * 创建时间
     * 更新时间
     * 操作
     */

    @ApiModelProperty(value = "用户编号")
    private Long id;

    @ApiModelProperty(value = "用户姓名")
    private String name;

    @ApiModelProperty(value = "用户邮箱")
    private String email;

    @ApiModelProperty(value = "用户手机号")
    private String phone;

    @ApiModelProperty(value = "用户密码")
    private String password;

    @ApiModelProperty(value = "最新登录时间")
    private Date lastLoginAt;

    @ApiModelProperty(value = "创建时间")
    private Date createdAt;

    @ApiModelProperty(value = "创建时间")
    private Date updatedAt;
}
