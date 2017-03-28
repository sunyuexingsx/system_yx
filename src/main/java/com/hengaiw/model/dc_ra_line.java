package com.hengaiw.model;

import java.io.Serializable;

public class dc_ra_line implements Serializable {
    private Integer iLineId;

    private String cLineNa;

    private Integer iYardIdDown;

    private Integer iYardIdUp;

    private static final long serialVersionUID = 1L;

    public Integer getiLineId() {
        return iLineId;
    }

    public void setiLineId(Integer iLineId) {
        this.iLineId = iLineId;
    }

    public String getcLineNa() {
        return cLineNa;
    }

    public void setcLineNa(String cLineNa) {
        this.cLineNa = cLineNa == null ? null : cLineNa.trim();
    }

    public Integer getiYardIdDown() {
        return iYardIdDown;
    }

    public void setiYardIdDown(Integer iYardIdDown) {
        this.iYardIdDown = iYardIdDown;
    }

    public Integer getiYardIdUp() {
        return iYardIdUp;
    }

    public void setiYardIdUp(Integer iYardIdUp) {
        this.iYardIdUp = iYardIdUp;
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
        dc_ra_line other = (dc_ra_line) that;
        return (this.getiLineId() == null ? other.getiLineId() == null : this.getiLineId().equals(other.getiLineId()))
            && (this.getcLineNa() == null ? other.getcLineNa() == null : this.getcLineNa().equals(other.getcLineNa()))
            && (this.getiYardIdDown() == null ? other.getiYardIdDown() == null : this.getiYardIdDown().equals(other.getiYardIdDown()))
            && (this.getiYardIdUp() == null ? other.getiYardIdUp() == null : this.getiYardIdUp().equals(other.getiYardIdUp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiLineId() == null) ? 0 : getiLineId().hashCode());
        result = prime * result + ((getcLineNa() == null) ? 0 : getcLineNa().hashCode());
        result = prime * result + ((getiYardIdDown() == null) ? 0 : getiYardIdDown().hashCode());
        result = prime * result + ((getiYardIdUp() == null) ? 0 : getiYardIdUp().hashCode());
        return result;
    }
}