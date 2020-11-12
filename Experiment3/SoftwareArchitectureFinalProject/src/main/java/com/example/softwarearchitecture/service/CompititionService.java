package com.example.softwarearchitecture.service;

import com.example.softwarearchitecture.dao.AthletesMapper;
import com.example.softwarearchitecture.dao.CompititionMapper;
import com.example.softwarearchitecture.model.Athletes;
import com.example.softwarearchitecture.model.Compitition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompititionService {
    @Autowired
    private CompititionMapper compititionDAO;

    public Compitition getByPK(Integer key){
        Compitition entity = compititionDAO.selectByPrimaryKey(key);
        return entity;
    }
    public Boolean post(Compitition entity) throws Exception {
        try{
            compititionDAO.insertSelective(entity);
        }
        catch (Exception e){
            throw new Exception("Error");
        }
        return true;

    }

    public Compitition getSimpleMapByPK(Integer key) {
        Compitition entity = getByPK(key);
        return entity;

    }

}
