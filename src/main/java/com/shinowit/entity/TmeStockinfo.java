package com.shinowit.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class TmeStockinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_stockinfo.id
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_stockinfo.merchandiseid
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private String merchandiseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_stockinfo.avgprice
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private BigDecimal avgprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tme_stockinfo.num
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private Integer num;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tme_stockinfo
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_stockinfo.id
     *
     * @return the value of tme_stockinfo.id
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_stockinfo.id
     *
     * @param id the value for tme_stockinfo.id
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_stockinfo.merchandiseid
     *
     * @return the value of tme_stockinfo.merchandiseid
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public String getMerchandiseid() {
        return merchandiseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_stockinfo.merchandiseid
     *
     * @param merchandiseid the value for tme_stockinfo.merchandiseid
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setMerchandiseid(String merchandiseid) {
        this.merchandiseid = merchandiseid == null ? null : merchandiseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_stockinfo.avgprice
     *
     * @return the value of tme_stockinfo.avgprice
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public BigDecimal getAvgprice() {
        return avgprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_stockinfo.avgprice
     *
     * @param avgprice the value for tme_stockinfo.avgprice
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setAvgprice(BigDecimal avgprice) {
        this.avgprice = avgprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tme_stockinfo.num
     *
     * @return the value of tme_stockinfo.num
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tme_stockinfo.num
     *
     * @param num the value for tme_stockinfo.num
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tme_stockinfo
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
        TmeStockinfo other = (TmeStockinfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMerchandiseid() == null ? other.getMerchandiseid() == null : this.getMerchandiseid().equals(other.getMerchandiseid()))
            && (this.getAvgprice() == null ? other.getAvgprice() == null : this.getAvgprice().equals(other.getAvgprice()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tme_stockinfo
     *
     * @mbggenerated Mon Dec 29 20:01:04 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMerchandiseid() == null) ? 0 : getMerchandiseid().hashCode());
        result = prime * result + ((getAvgprice() == null) ? 0 : getAvgprice().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        return result;
    }
}