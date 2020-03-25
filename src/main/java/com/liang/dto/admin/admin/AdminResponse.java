package com.liang.dto.admin.admin;

import com.liang.dto.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Date;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

/**
 * @author Liang
 * Created By 2020/3/23
 **/
@Data
@Validated
@ApiModel("管理员列表")
public class AdminResponse extends BaseResponse {

    @ApiModelProperty(value = "管理员编号")
    private Long id;

    @ApiModelProperty(value = "管理员姓名")
    private String name;

    @ApiModelProperty(value = "管理员账号")
    private String account;

    @ApiModelProperty(value = "创建时间")
    private Date createdAt;
}
