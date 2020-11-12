package com.example.softwarearchitecture.service;

import com.example.softwarearchitecture.dao.AthletesMapper;
import com.example.softwarearchitecture.mapper.Mapper;
import com.example.softwarearchitecture.model.Athletes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class AthletesService {
    @Autowired
    private AthletesMapper athletesDAO;

    public Athletes getByPK(Integer key){
        Athletes entity = athletesDAO.selectByPrimaryKey(key);
        return entity;
    }

    /**
     * 新增一个运动员
     * @param entity 运动员实例
     * @return 对应的Map
     */
    public Map<String,Object> post(Athletes entity)  {
        athletesDAO.insertSelective(entity);
        return Mapper.entityTOMap(entity);
    }

    public Athletes getSimpleMapByPK(Integer key) {
        Athletes entity = getByPK(key);
        return entity;
    }

    public Integer delete(Integer key){
        AtomicInteger count = new AtomicInteger();
        return count.addAndGet(athletesDAO.deleteByPrimaryKey(key));
    }

    public Athletes update(Athletes entity) throws Exception {
        Athletes athletesEntity = getByPK(entity.getId());
        if(athletesEntity==null){
            throw new Exception("未发现对应运动员");
        }
        athletesDAO.updateByPrimaryKeySelective(entity);
        return entity;
    }
}
