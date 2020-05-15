package com.liang.controller.api;

import com.liang.dto.api.information.ApiInformationPageResponse;
import com.liang.service.api.information.InformationService;
import generated_jooq.tables.pojos.Information;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Liang
 * Created By 2020/3/25
 **/
@RestController
@RequestMapping("/bysj/api/information")
@Api(tags = "5. 资讯api")
@Validated
public class ApiInformationController {

    @Autowired
    private InformationService mInformationService;

    @ApiOperation("获取资讯列表")
    @GetMapping("")
    public ApiInformationPageResponse listInformation(
            Pageable pageable,
            @RequestParam(required = false) String params,
            @ApiParam(allowableValues = "1,2,3,4,5,6")
            @RequestParam(required = false) Integer type) {
        return mInformationService.listInformation(params, type, pageable);
    }

    @ApiOperation("获取资讯详情")
    @GetMapping("/{id}")
    public Information detailInformation(
            @PathVariable Long id) {
        return mInformationService.detailInformation(id);
    }

    @ApiOperation("更新资讯浏览量")
    @PostMapping("/{id}")
    public void updatePV(@PathVariable Long id,
                         @RequestParam(required = false) Long pv) {
        mInformationService.updatePV(id, pv);
    }
}
