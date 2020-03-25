package com.liang.dto;

import com.liang.dto.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Liang
 * Created By 2020/3/24
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("分页Response")
public class PageResponse{

    @ApiModelProperty(value = "当前页")
    private Integer currentPage;

    @ApiModelProperty(value = "总页数")
    private Integer totalPage;

    @ApiModelProperty(value = "上一页")
    private Integer previous;

    @ApiModelProperty(value = "下一页")
    private Integer next;
}
