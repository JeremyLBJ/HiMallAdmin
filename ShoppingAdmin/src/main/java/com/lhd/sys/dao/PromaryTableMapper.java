package com.lhd.sys.dao;

import com.lhd.sys.entity.PromaryTable;
import com.lhd.sys.entity.PromaryTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PromaryTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    long countByExample(PromaryTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByExample(PromaryTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int deleteByPrimaryKey(Integer citycode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insert(PromaryTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int insertSelective(PromaryTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    List<PromaryTable> selectByExample(PromaryTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    PromaryTable selectByPrimaryKey(Integer citycode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExampleSelective(@Param("record") PromaryTable record, @Param("example") PromaryTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByExample(@Param("record") PromaryTable record, @Param("example") PromaryTableExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKeySelective(PromaryTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table promary_table
     *
     * @mbg.generated Wed Jan 29 15:02:17 CST 2020
     */
    int updateByPrimaryKey(PromaryTable record);
}