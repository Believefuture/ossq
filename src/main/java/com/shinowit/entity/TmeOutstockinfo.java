package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TmeOutstockinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_outstockinfo.outbillcode
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private String outbillcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_outstockinfo.id
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_outstockinfo.operid
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private String operid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_outstockinfo.outtime
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private Date outtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_outstockinfo.handler
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private String handler;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_outstockinfo.outtype
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private Byte outtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_outstockinfo.totalmoney
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private BigDecimal totalmoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_outstockinfo.remark
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tme_outstockinfo
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_outstockinfo.outbillcode
     *
     * @return the value of tme_outstockinfo.outbillcode
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public String getOutbillcode() {
        return outbillcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_outstockinfo.outbillcode
     *
     * @param outbillcode the value for tme_outstockinfo.outbillcode
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setOutbillcode(String outbillcode) {
        this.outbillcode = outbillcode == null ? null : outbillcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_outstockinfo.id
     *
     * @return the value of tme_outstockinfo.id
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_outstockinfo.id
     *
     * @param id the value for tme_outstockinfo.id
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_outstockinfo.operid
     *
     * @return the value of tme_outstockinfo.operid
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public String getOperid() {
        return operid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_outstockinfo.operid
     *
     * @param operid the value for tme_outstockinfo.operid
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setOperid(String operid) {
        this.operid = operid == null ? null : operid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_outstockinfo.outtime
     *
     * @return the value of tme_outstockinfo.outtime
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public Date getOuttime() {
        return outtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_outstockinfo.outtime
     *
     * @param outtime the value for tme_outstockinfo.outtime
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setOuttime(Date outtime) {
        this.outtime = outtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_outstockinfo.handler
     *
     * @return the value of tme_outstockinfo.handler
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public String getHandler() {
        return handler;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_outstockinfo.handler
     *
     * @param handler the value for tme_outstockinfo.handler
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setHandler(String handler) {
        this.handler = handler == null ? null : handler.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_outstockinfo.outtype
     *
     * @return the value of tme_outstockinfo.outtype
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public Byte getOuttype() {
        return outtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_outstockinfo.outtype
     *
     * @param outtype the value for tme_outstockinfo.outtype
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setOuttype(Byte outtype) {
        this.outtype = outtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_outstockinfo.totalmoney
     *
     * @return the value of tme_outstockinfo.totalmoney
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public BigDecimal getTotalmoney() {
        return totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_outstockinfo.totalmoney
     *
     * @param totalmoney the value for tme_outstockinfo.totalmoney
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setTotalmoney(BigDecimal totalmoney) {
        this.totalmoney = totalmoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_outstockinfo.remark
     *
     * @return the value of tme_outstockinfo.remark
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_outstockinfo.remark
     *
     * @param remark the value for tme_outstockinfo.remark
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tme_outstockinfo
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TmeOutstockinfo other = (TmeOutstockinfo) that;
        return (this.getOutbillcode() == null ? other.getOutbillcode() == null : this.getOutbillcode().equals(other.getOutbillcode()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOperid() == null ? other.getOperid() == null : this.getOperid().equals(other.getOperid()))
            && (this.getOuttime() == null ? other.getOuttime() == null : this.getOuttime().equals(other.getOuttime()))
            && (this.getHandler() == null ? other.getHandler() == null : this.getHandler().equals(other.getHandler()))
            && (this.getOuttype() == null ? other.getOuttype() == null : this.getOuttype().equals(other.getOuttype()))
            && (this.getTotalmoney() == null ? other.getTotalmoney() == null : this.getTotalmoney().equals(other.getTotalmoney()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tme_outstockinfo
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOutbillcode() == null) ? 0 : getOutbillcode().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOperid() == null) ? 0 : getOperid().hashCode());
        result = prime * result + ((getOuttime() == null) ? 0 : getOuttime().hashCode());
        result = prime * result + ((getHandler() == null) ? 0 : getHandler().hashCode());
        result = prime * result + ((getOuttype() == null) ? 0 : getOuttype().hashCode());
        result = prime * result + ((getTotalmoney() == null) ? 0 : getTotalmoney().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}