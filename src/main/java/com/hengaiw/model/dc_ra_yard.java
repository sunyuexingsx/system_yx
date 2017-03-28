package com.hengaiw.model;

import java.io.Serializable;

public class dc_ra_yard implements Serializable {
    private Integer iRangeId;

    private String cRangeNa;

    private static final long serialVersionUID = 1L;

    public Integer getiRangeId() {
        return iRangeId;
    }

    public void setiRangeId(Integer iRangeId) {
        this.iRangeId = iRangeId;
    }

    public String getcRangeNa() {
        return cRangeNa;
    }

    public void setcRangeNa(String cRangeNa) {
        this.cRangeNa = cRangeNa == null ? null : cRangeNa.trim();
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
        dc_ra_yard other = (dc_ra_yard) that;
        return (this.getiRangeId() == null ? other.getiRangeId() == null : this.getiRangeId().equals(other.getiRangeId()))
            && (this.getcRangeNa() == null ? other.getcRangeNa() == null : this.getcRangeNa().equals(other.getcRangeNa()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiRangeId() == null) ? 0 : getiRangeId().hashCode());
        result = prime * result + ((getcRangeNa() == null) ? 0 : getcRangeNa().hashCode());
        return result;
    }
}