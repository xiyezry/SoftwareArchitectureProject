package com.example.softwarearchitecture.controller;

import com.example.softwarearchitecture.dao.AthletesMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.example.softwarearchitecture.model.Athletes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import com.example.softwarearchitecture.service.AthletesService;

import java.util.Date;

@RestController
@Api(
        value = "athletes",
        tags = "运动员模块"
)
@RequestMapping("api/dem/athletes")
public class AthletesController {

    @Autowired
    private AthletesService athletesService;

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
    public Athletes getSimpleMapByPK(@RequestParam(value = "id")Integer id){
        return athletesService.getSimpleMapByPK(id);
    }

//    public Athletes post(@RequestParam(value = "id")Integer id,
//                         @RequestParam(value = "name")String name,
//                         @RequestParam(value = "birthday") Date birthday,
//                         @RequestParam(value = "gender")String gender,
//                         @RequestParam(value = "height")Double height,
//                         @RequestParam(value = "weight")Double weight,
//                         @RequestParam(value = "department")String department,
//                         @RequestParam(value = "bodyCondition")String bodyCondition,
//                         @RequestParam(value = "banned")Boolean banned){
//
//    }
    @ApiOperation(value = "发布实体",notes = "发布实体")
    @RequestMapping(value = "single/simple",method = RequestMethod.POST)
    @ResponseBody
    public Athletes post(@RequestBody Athletes entity){
        athletesService.post(entity);
        return entity;
    }

    @ApiOperation(value = "删除实体",notes = "删除实体")
    @RequestMapping(value = "single/simple",method = RequestMethod.DELETE)
    public Integer delete(@RequestParam(value = "id")Integer id){
        return athletesService.delete(id);
    }

    @ApiOperation(value = "更新实体",notes = "更新实体")
    @RequestMapping(value = "update/simple",method = RequestMethod.PATCH)
    public Athletes update(@RequestBody Athletes entity) throws Exception {
        return athletesService.update(entity);
    }
}
