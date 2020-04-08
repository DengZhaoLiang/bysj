package com.liang.dto.admin.information;

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
@ApiModel("资讯分页Response")
public class AdminInformationPageResponse {

    @ApiModelProperty(value = "分页内容体")
    private List<AdminInformationResponse> information;

    @ApiModelProperty(value = "分页信息")
    private PageResponse page;
}
