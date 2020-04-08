package com.liang.dto.admin.information;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liang.dto.BaseResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.sql.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.validation.annotation.Validated;

/**
 * @author Liang
 * Created By 2020/3/23
 **/
@Data
@Validated
@ApiModel("资讯列表")
@EqualsAndHashCode(callSuper = false)
public class AdminInformationResponse extends BaseResponse {
    /**
     * 资讯编号
     * 资讯名
     * 资讯描述
     * 资讯类型
     * 资讯封面图
     * 资讯
     * 访问量
     * 创建时间
     * 更新时间
     */

    @ApiModelProperty(value = "资讯编号")
    private Long id;

    @ApiModelProperty(value = "资讯名")
    private String name;

    @ApiModelProperty(value = "资讯描述")
    private String describe;

    @ApiModelProperty(value = "资讯类型")
    private String typeStr;

    @ApiModelProperty(value = "资讯封面图")
    private String img;

    @ApiModelProperty(value = "资讯")
    private String video;

    @ApiModelProperty(value = "访问量")
    private Integer pv;

    @ApiModelProperty(value = "创建时间")
    private Date createdAt;

    @ApiModelProperty(value = "更新时间")
    private Date updatedAt;

    @ApiModelProperty(value = "资讯类型")
    @JsonIgnore
    private Integer type;
}
