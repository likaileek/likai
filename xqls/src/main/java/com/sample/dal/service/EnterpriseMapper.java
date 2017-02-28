package com.sample.dal.service;

import org.apache.ibatis.annotations.Param;

import com.sample.dal.model.Enterprise;
import com.sample.dal.model.EnterpriseExample;

import java.util.List;
import java.util.Map;

public interface EnterpriseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int countByExample(EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int deleteByExample(EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer enterpriseNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int insert(Enterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int insertSelective(Enterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    List<Enterprise> selectByExample(EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    Enterprise selectByPrimaryKey(Integer enterpriseNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Enterprise record, @Param("example") EnterpriseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Enterprise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table enterprise
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Enterprise record);



    List<Map<String, Object>>  selectByMap(Map<String,Object> map);
}