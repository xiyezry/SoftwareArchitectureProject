package com.example.softwarearchitecture.mapper;

import com.example.softwarearchitecture.model.Athletes;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Mapper {
    public static Map<String,Object> entityTOMap (Athletes entity){
        Map<String,Object> map = new HashMap<String, Object>();

        map.put("id",entity.getId());
        map.put("name",entity.getName());
        map.put("birthday",entity.getBirthday());
        map.put("gender",entity.getGender());
        map.put("height",entity.getHeight());
        map.put("weight",entity.getWeight());
        map.put("department",entity.getDepartment());
        map.put("bodyCondition",entity.getBodyCondition());
        map.put("banned",entity.getBanned());

        return map;
    }

    public static Athletes mapTOEntity(Map<String,Object> map){
        Athletes entity = new Athletes();

        entity.setId((Integer) map.get("id"));
        entity.setName((String) map.get("name"));
        entity.setBirthday((Date) map.get("birthday"));
        entity.setGender((String) map.get("gender"));
        entity.setHeight((Double) map.get("height"));
        entity.setWeight((Double) map.get("weight"));
        entity.setDepartment((String) map.get("department"));
        entity.setBodyCondition((String) map.get("bodyCondition"));
        entity.setBanned((Boolean) map.get("banned"));

        return entity;
    }

//    public static Map<String, Object> createMap(@RequestParam(value = "id")Integer id,
//                                                String name,
//                                                 Date birthday,
//                                                String gender,
//                                                Double height,
//                                                Double weight,
//                                                String department,
//                                                String bodyCondition,
//                                                Boolean banned){
//
//    }
}
