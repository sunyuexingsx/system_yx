package com.hengaiw.model;

import java.io.Serializable;
import java.util.Date;

public class dm_express_cars implements Serializable {
    private Long iCarsId;

    private Integer iLineId;

    private Integer iCarInNo;

    private String cCarNote;

    private Boolean qcworkStatus;

    private Integer qcworkUser;

    private Date qcworkBegintime;

    private Date qcworkEndtime;

    private Integer qcworkSeq;

    private Date qcworkUpdatetime;

    private Boolean endworkStatus;

    private Date endworkBegintime;

    private Date endworkEndtime;

    private Integer endworkSeq;

    private Date endworkUpdatetime;

    private Boolean airworkStatus;

    private Date airworkBegintime;

    private Date airworkEndtime;

    private Integer airworkSeq;

    private Date airworkUpdatetime;

    private static final long serialVersionUID = 1L;

    public Long getiCarsId() {
        return iCarsId;
    }

    public void setiCarsId(Long iCarsId) {
        this.iCarsId = iCarsId;
    }

    public Integer getiLineId() {
        return iLineId;
    }

    public void setiLineId(Integer iLineId) {
        this.iLineId = iLineId;
    }

    public Integer getiCarInNo() {
        return iCarInNo;
    }

    public void setiCarInNo(Integer iCarInNo) {
        this.iCarInNo = iCarInNo;
    }

    public String getcCarNote() {
        return cCarNote;
    }

    public void setcCarNote(String cCarNote) {
        this.cCarNote = cCarNote == null ? null : cCarNote.trim();
    }

    public Boolean getQcworkStatus() {
        return qcworkStatus;
    }

    public void setQcworkStatus(Boolean qcworkStatus) {
        this.qcworkStatus = qcworkStatus;
    }

    public Integer getQcworkUser() {
        return qcworkUser;
    }

    public void setQcworkUser(Integer qcworkUser) {
        this.qcworkUser = qcworkUser;
    }

    public Date getQcworkBegintime() {
        return qcworkBegintime;
    }

    public void setQcworkBegintime(Date qcworkBegintime) {
        this.qcworkBegintime = qcworkBegintime;
    }

    public Date getQcworkEndtime() {
        return qcworkEndtime;
    }

    public void setQcworkEndtime(Date qcworkEndtime) {
        this.qcworkEndtime = qcworkEndtime;
    }

    public Integer getQcworkSeq() {
        return qcworkSeq;
    }

    public void setQcworkSeq(Integer qcworkSeq) {
        this.qcworkSeq = qcworkSeq;
    }

    public Date getQcworkUpdatetime() {
        return qcworkUpdatetime;
    }

    public void setQcworkUpdatetime(Date qcworkUpdatetime) {
        this.qcworkUpdatetime = qcworkUpdatetime;
    }

    public Boolean getEndworkStatus() {
        return endworkStatus;
    }

    public void setEndworkStatus(Boolean endworkStatus) {
        this.endworkStatus = endworkStatus;
    }

    public Date getEndworkBegintime() {
        return endworkBegintime;
    }

    public void setEndworkBegintime(Date endworkBegintime) {
        this.endworkBegintime = endworkBegintime;
    }

    public Date getEndworkEndtime() {
        return endworkEndtime;
    }

    public void setEndworkEndtime(Date endworkEndtime) {
        this.endworkEndtime = endworkEndtime;
    }

    public Integer getEndworkSeq() {
        return endworkSeq;
    }

    public void setEndworkSeq(Integer endworkSeq) {
        this.endworkSeq = endworkSeq;
    }

    public Date getEndworkUpdatetime() {
        return endworkUpdatetime;
    }

    public void setEndworkUpdatetime(Date endworkUpdatetime) {
        this.endworkUpdatetime = endworkUpdatetime;
    }

    public Boolean getAirworkStatus() {
        return airworkStatus;
    }

    public void setAirworkStatus(Boolean airworkStatus) {
        this.airworkStatus = airworkStatus;
    }

    public Date getAirworkBegintime() {
        return airworkBegintime;
    }

    public void setAirworkBegintime(Date airworkBegintime) {
        this.airworkBegintime = airworkBegintime;
    }

    public Date getAirworkEndtime() {
        return airworkEndtime;
    }

    public void setAirworkEndtime(Date airworkEndtime) {
        this.airworkEndtime = airworkEndtime;
    }

    public Integer getAirworkSeq() {
        return airworkSeq;
    }

    public void setAirworkSeq(Integer airworkSeq) {
        this.airworkSeq = airworkSeq;
    }

    public Date getAirworkUpdatetime() {
        return airworkUpdatetime;
    }

    public void setAirworkUpdatetime(Date airworkUpdatetime) {
        this.airworkUpdatetime = airworkUpdatetime;
    }

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
        dm_express_cars other = (dm_express_cars) that;
        return (this.getiCarsId() == null ? other.getiCarsId() == null : this.getiCarsId().equals(other.getiCarsId()))
            && (this.getiLineId() == null ? other.getiLineId() == null : this.getiLineId().equals(other.getiLineId()))
            && (this.getiCarInNo() == null ? other.getiCarInNo() == null : this.getiCarInNo().equals(other.getiCarInNo()))
            && (this.getcCarNote() == null ? other.getcCarNote() == null : this.getcCarNote().equals(other.getcCarNote()))
            && (this.getQcworkStatus() == null ? other.getQcworkStatus() == null : this.getQcworkStatus().equals(other.getQcworkStatus()))
            && (this.getQcworkUser() == null ? other.getQcworkUser() == null : this.getQcworkUser().equals(other.getQcworkUser()))
            && (this.getQcworkBegintime() == null ? other.getQcworkBegintime() == null : this.getQcworkBegintime().equals(other.getQcworkBegintime()))
            && (this.getQcworkEndtime() == null ? other.getQcworkEndtime() == null : this.getQcworkEndtime().equals(other.getQcworkEndtime()))
            && (this.getQcworkSeq() == null ? other.getQcworkSeq() == null : this.getQcworkSeq().equals(other.getQcworkSeq()))
            && (this.getQcworkUpdatetime() == null ? other.getQcworkUpdatetime() == null : this.getQcworkUpdatetime().equals(other.getQcworkUpdatetime()))
            && (this.getEndworkStatus() == null ? other.getEndworkStatus() == null : this.getEndworkStatus().equals(other.getEndworkStatus()))
            && (this.getEndworkBegintime() == null ? other.getEndworkBegintime() == null : this.getEndworkBegintime().equals(other.getEndworkBegintime()))
            && (this.getEndworkEndtime() == null ? other.getEndworkEndtime() == null : this.getEndworkEndtime().equals(other.getEndworkEndtime()))
            && (this.getEndworkSeq() == null ? other.getEndworkSeq() == null : this.getEndworkSeq().equals(other.getEndworkSeq()))
            && (this.getEndworkUpdatetime() == null ? other.getEndworkUpdatetime() == null : this.getEndworkUpdatetime().equals(other.getEndworkUpdatetime()))
            && (this.getAirworkStatus() == null ? other.getAirworkStatus() == null : this.getAirworkStatus().equals(other.getAirworkStatus()))
            && (this.getAirworkBegintime() == null ? other.getAirworkBegintime() == null : this.getAirworkBegintime().equals(other.getAirworkBegintime()))
            && (this.getAirworkEndtime() == null ? other.getAirworkEndtime() == null : this.getAirworkEndtime().equals(other.getAirworkEndtime()))
            && (this.getAirworkSeq() == null ? other.getAirworkSeq() == null : this.getAirworkSeq().equals(other.getAirworkSeq()))
            && (this.getAirworkUpdatetime() == null ? other.getAirworkUpdatetime() == null : this.getAirworkUpdatetime().equals(other.getAirworkUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiCarsId() == null) ? 0 : getiCarsId().hashCode());
        result = prime * result + ((getiLineId() == null) ? 0 : getiLineId().hashCode());
        result = prime * result + ((getiCarInNo() == null) ? 0 : getiCarInNo().hashCode());
        result = prime * result + ((getcCarNote() == null) ? 0 : getcCarNote().hashCode());
        result = prime * result + ((getQcworkStatus() == null) ? 0 : getQcworkStatus().hashCode());
        result = prime * result + ((getQcworkUser() == null) ? 0 : getQcworkUser().hashCode());
        result = prime * result + ((getQcworkBegintime() == null) ? 0 : getQcworkBegintime().hashCode());
        result = prime * result + ((getQcworkEndtime() == null) ? 0 : getQcworkEndtime().hashCode());
        result = prime * result + ((getQcworkSeq() == null) ? 0 : getQcworkSeq().hashCode());
        result = prime * result + ((getQcworkUpdatetime() == null) ? 0 : getQcworkUpdatetime().hashCode());
        result = prime * result + ((getEndworkStatus() == null) ? 0 : getEndworkStatus().hashCode());
        result = prime * result + ((getEndworkBegintime() == null) ? 0 : getEndworkBegintime().hashCode());
        result = prime * result + ((getEndworkEndtime() == null) ? 0 : getEndworkEndtime().hashCode());
        result = prime * result + ((getEndworkSeq() == null) ? 0 : getEndworkSeq().hashCode());
        result = prime * result + ((getEndworkUpdatetime() == null) ? 0 : getEndworkUpdatetime().hashCode());
        result = prime * result + ((getAirworkStatus() == null) ? 0 : getAirworkStatus().hashCode());
        result = prime * result + ((getAirworkBegintime() == null) ? 0 : getAirworkBegintime().hashCode());
        result = prime * result + ((getAirworkEndtime() == null) ? 0 : getAirworkEndtime().hashCode());
        result = prime * result + ((getAirworkSeq() == null) ? 0 : getAirworkSeq().hashCode());
        result = prime * result + ((getAirworkUpdatetime() == null) ? 0 : getAirworkUpdatetime().hashCode());
        return result;
    }
}