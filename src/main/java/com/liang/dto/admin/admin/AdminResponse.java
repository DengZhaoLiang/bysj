package com.liang.dto.admin.admin;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * @author Liang
 * Created By 2020/3/23
 **/
@Data
@Validated
@ApiModel
public class AdminResponse {

    @ApiModelProperty(value = "管理员编号")
    private Long id;

    @ApiModelProperty(value = "管理员姓名")
    private String name;

    @ApiModelProperty(value = "管理员账号")
    private String account;

    @ApiModelProperty(value = "创建时间")
    private Long createdAt;
}
