package com.liang.dto.admin.banner;

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
@ApiModel("轮播图分页Response")
public class AdminBannerPageResponse {

    @ApiModelProperty(value = "分页内容体")
    private List<AdminBannerResponse> banner;

    @ApiModelProperty(value = "分页信息")
    private PageResponse page;
}
