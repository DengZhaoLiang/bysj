package com.liang.dto.api.blog;

import com.liang.dto.PageResponse;
import com.liang.dto.admin.blog.AdminBlogResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.Data;

/**
 * @author Liang
 * Created By 2020/3/25
 **/
@Data
@ApiModel("博客分页Response")
public class ApiBlogPageResponse {

    @ApiModelProperty(value = "分页内容体")
    private List<ApiBlogResponse> blog;

    @ApiModelProperty(value = "分页信息")
    private PageResponse page;
}
