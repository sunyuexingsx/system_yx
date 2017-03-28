package com.hengaiw.model;

import java.io.Serializable;
import java.util.Date;

public class dm_express_cut implements Serializable {
    private Long iCutId;

    private Short iLineId;

    private Short iCarCnt;

    private Short eCoupFlag;

    private Short iTrackZero;

    private String cRemark;

    private String cCarId;

    private Date dStart;

    private Date dEnd;

    private static final long serialVersionUID = 1L;

    public Long getiCutId() {
        return iCutId;
    }

    public void setiCutId(Long iCutId) {
        this.iCutId = iCutId;
    }

    public Short getiLineId() {
        return iLineId;
    }

    public void setiLineId(Short iLineId) {
        this.iLineId = iLineId;
    }

    public Short getiCarCnt() {
        return iCarCnt;
    }

    public void setiCarCnt(Short iCarCnt) {
        this.iCarCnt = iCarCnt;
    }

    public Short geteCoupFlag() {
        return eCoupFlag;
    }

    public void seteCoupFlag(Short eCoupFlag) {
        this.eCoupFlag = eCoupFlag;
    }

    public Short getiTrackZero() {
        return iTrackZero;
    }

    public void setiTrackZero(Short iTrackZero) {
        this.iTrackZero = iTrackZero;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark == null ? null : cRemark.trim();
    }

    public String getcCarId() {
        return cCarId;
    }

    public void setcCarId(String cCarId) {
        this.cCarId = cCarId == null ? null : cCarId.trim();
    }

    public Date getdStart() {
        return dStart;
    }

    public void setdStart(Date dStart) {
        this.dStart = dStart;
    }

    public Date getdEnd() {
        return dEnd;
    }

    public void setdEnd(Date dEnd) {
        this.dEnd = dEnd;
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
        dm_express_cut other = (dm_express_cut) that;
        return (this.getiCutId() == null ? other.getiCutId() == null : this.getiCutId().equals(other.getiCutId()))
            && (this.getiLineId() == null ? other.getiLineId() == null : this.getiLineId().equals(other.getiLineId()))
            && (this.getiCarCnt() == null ? other.getiCarCnt() == null : this.getiCarCnt().equals(other.getiCarCnt()))
            && (this.geteCoupFlag() == null ? other.geteCoupFlag() == null : this.geteCoupFlag().equals(other.geteCoupFlag()))
            && (this.getiTrackZero() == null ? other.getiTrackZero() == null : this.getiTrackZero().equals(other.getiTrackZero()))
            && (this.getcRemark() == null ? other.getcRemark() == null : this.getcRemark().equals(other.getcRemark()))
            && (this.getcCarId() == null ? other.getcCarId() == null : this.getcCarId().equals(other.getcCarId()))
            && (this.getdStart() == null ? other.getdStart() == null : this.getdStart().equals(other.getdStart()))
            && (this.getdEnd() == null ? other.getdEnd() == null : this.getdEnd().equals(other.getdEnd()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiCutId() == null) ? 0 : getiCutId().hashCode());
        result = prime * result + ((getiLineId() == null) ? 0 : getiLineId().hashCode());
        result = prime * result + ((getiCarCnt() == null) ? 0 : getiCarCnt().hashCode());
        result = prime * result + ((geteCoupFlag() == null) ? 0 : geteCoupFlag().hashCode());
        result = prime * result + ((getiTrackZero() == null) ? 0 : getiTrackZero().hashCode());
        result = prime * result + ((getcRemark() == null) ? 0 : getcRemark().hashCode());
        result = prime * result + ((getcCarId() == null) ? 0 : getcCarId().hashCode());
        result = prime * result + ((getdStart() == null) ? 0 : getdStart().hashCode());
        result = prime * result + ((getdEnd() == null) ? 0 : getdEnd().hashCode());
        return result;
    }
}