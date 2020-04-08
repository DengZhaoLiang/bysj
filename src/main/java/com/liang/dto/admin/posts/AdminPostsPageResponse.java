package com.liang.dto.admin.posts;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.information.AdminInformationResponse;
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
public class AdminPostsPageResponse {

    @ApiModelProperty(value = "分页内容体")
    private List<AdminPostsResponse> posts;

    @ApiModelProperty(value = "分页信息")
    private PageResponse page;
}
