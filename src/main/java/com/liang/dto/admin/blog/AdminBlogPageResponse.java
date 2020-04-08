package com.liang.dto.admin.blog;

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
@ApiModel("博客分页Response")
public class AdminBlogPageResponse {

    @ApiModelProperty(value = "分页内容体")
    private List<AdminBlogResponse> blog;

    @ApiModelProperty(value = "分页信息")
    private PageResponse page;
}
