package com.example.softwarearchitecture.dao;

import com.example.softwarearchitecture.model.Referee;
import com.example.softwarearchitecture.model.RefereeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RefereeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    int deleteByExample(RefereeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    int insert(Referee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    int insertSelective(Referee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    List<Referee> selectByExample(RefereeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    Referee selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    int updateByExampleSelective(@Param("record") Referee record, @Param("example") RefereeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    int updateByExample(@Param("record") Referee record, @Param("example") RefereeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    int updateByPrimaryKeySelective(Referee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table referee
     *
     * @mbg.generated Wed Nov 11 22:13:40 CST 2020
     */
    int updateByPrimaryKey(Referee record);
}