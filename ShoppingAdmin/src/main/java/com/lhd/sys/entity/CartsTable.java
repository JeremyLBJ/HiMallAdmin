package com.lhd.sys.entity;

import java.util.Date;

public class CartsTable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carts_table.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carts_table.userId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carts_table.cId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Integer cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carts_table.createTime
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carts_table.id
     *
     * @return the value of carts_table.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carts_table.id
     *
     * @param id the value for carts_table.id
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carts_table.userId
     *
     * @return the value of carts_table.userId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carts_table.userId
     *
     * @param userid the value for carts_table.userId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carts_table.cId
     *
     * @return the value of carts_table.cId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carts_table.cId
     *
     * @param cid the value for carts_table.cId
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column carts_table.createTime
     *
     * @return the value of carts_table.createTime
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column carts_table.createTime
     *
     * @param createtime the value for carts_table.createTime
     *
     * @mbg.generated Sat Nov 16 18:45:00 CST 2019
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}