package com.liang.dto.admin.admin;

import com.liang.dto.PageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 * @author Liang
 * Created By 2020/3/25
 **/
@Data
@ApiModel("管理员分页Response")
public class AdminPageResponse {

    @ApiModelProperty(value = "分页内容体")
    private List<AdminResponse> admin;

    @ApiModelProperty(value = "分页信息")
    private PageResponse page;
}
