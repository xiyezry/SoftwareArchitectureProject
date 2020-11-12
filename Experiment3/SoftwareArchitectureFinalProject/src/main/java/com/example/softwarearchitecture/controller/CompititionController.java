package com.example.softwarearchitecture.controller;

import com.example.softwarearchitecture.model.Athletes;
import com.example.softwarearchitecture.model.Compitition;
import com.example.softwarearchitecture.service.AthletesService;
import com.example.softwarearchitecture.service.CompititionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(
        value = "compititions",
        tags = "竞赛模块"
)
@RequestMapping("api/dem/compititions")
public class CompititionController {
    @Autowired
    private CompititionService compititionService;

    @ApiOperation(value = "获取实体",
            notes = "获取实体")
    @RequestMapping(
            value = "single/simple",
            method = RequestMethod.GET
    )
    @Transactional(
            rollbackFor = Exception.class
    )
    @ResponseBody
    public Compitition getSimpleMapByPK(@RequestParam(value = "id")Integer id){
        return compititionService.getSimpleMapByPK(id);
    }
}
