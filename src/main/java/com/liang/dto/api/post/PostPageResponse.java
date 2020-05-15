package com.liang.dto.api.post;

import com.liang.dto.PageResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author Liang
 * Created By 2020/4/7
 **/
@Data
@ApiModel("帖子分页Response")
public class PostPageResponse {

    @ApiModelProperty(value = "分页内容体")
    private List<PostResponse> post;

    @ApiModelProperty(value = "分页信息")
    private PageResponse page;
}
