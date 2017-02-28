package com.skeye.yagout.dal.service;

import com.skeye.yagout.dal.model.Specialhost;
import com.skeye.yagout.dal.model.SpecialhostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialhostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int countByExample(SpecialhostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int deleteByExample(SpecialhostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int insert(Specialhost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int insertSelective(Specialhost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    List<Specialhost> selectByExample(SpecialhostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    Specialhost selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Specialhost record, @Param("example") SpecialhostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Specialhost record, @Param("example") SpecialhostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Specialhost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table specialhost
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Specialhost record);
}