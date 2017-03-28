package com.hengaiw.model;

import java.io.Serializable;
import java.util.Date;

public class dm_express_flow implements Serializable {
    private Integer iFlowId;

    private Integer iConsId;

    private Short eFlowType;

    private Short eWorkRange;

    private Short bFlowState;

    private Short iLocomId;

    private Short iFlowNo;

    private Integer iFlowOrder;

    private Short iFlowNoStart;

    private String cTrainNum;

    private String cOpMaker;

    private Date dFaStart;

    private Date dFaEnd;

    private Date dPlStart;

    private Date dPlEnd;

    private Integer iFlowIdUnite;

    private static final long serialVersionUID = 1L;

    public Integer getiFlowId() {
        return iFlowId;
    }

    public void setiFlowId(Integer iFlowId) {
        this.iFlowId = iFlowId;
    }

    public Integer getiConsId() {
        return iConsId;
    }

    public void setiConsId(Integer iConsId) {
        this.iConsId = iConsId;
    }

    public Short geteFlowType() {
        return eFlowType;
    }

    public void seteFlowType(Short eFlowType) {
        this.eFlowType = eFlowType;
    }

    public Short geteWorkRange() {
        return eWorkRange;
    }

    public void seteWorkRange(Short eWorkRange) {
        this.eWorkRange = eWorkRange;
    }

    public Short getbFlowState() {
        return bFlowState;
    }

    public void setbFlowState(Short bFlowState) {
        this.bFlowState = bFlowState;
    }

    public Short getiLocomId() {
        return iLocomId;
    }

    public void setiLocomId(Short iLocomId) {
        this.iLocomId = iLocomId;
    }

    public Short getiFlowNo() {
        return iFlowNo;
    }

    public void setiFlowNo(Short iFlowNo) {
        this.iFlowNo = iFlowNo;
    }

    public Integer getiFlowOrder() {
        return iFlowOrder;
    }

    public void setiFlowOrder(Integer iFlowOrder) {
        this.iFlowOrder = iFlowOrder;
    }

    public Short getiFlowNoStart() {
        return iFlowNoStart;
    }

    public void setiFlowNoStart(Short iFlowNoStart) {
        this.iFlowNoStart = iFlowNoStart;
    }

    public String getcTrainNum() {
        return cTrainNum;
    }

    public void setcTrainNum(String cTrainNum) {
        this.cTrainNum = cTrainNum == null ? null : cTrainNum.trim();
    }

    public String getcOpMaker() {
        return cOpMaker;
    }

    public void setcOpMaker(String cOpMaker) {
        this.cOpMaker = cOpMaker == null ? null : cOpMaker.trim();
    }

    public Date getdFaStart() {
        return dFaStart;
    }

    public void setdFaStart(Date dFaStart) {
        this.dFaStart = dFaStart;
    }

    public Date getdFaEnd() {
        return dFaEnd;
    }

    public void setdFaEnd(Date dFaEnd) {
        this.dFaEnd = dFaEnd;
    }

    public Date getdPlStart() {
        return dPlStart;
    }

    public void setdPlStart(Date dPlStart) {
        this.dPlStart = dPlStart;
    }

    public Date getdPlEnd() {
        return dPlEnd;
    }

    public void setdPlEnd(Date dPlEnd) {
        this.dPlEnd = dPlEnd;
    }

    public Integer getiFlowIdUnite() {
        return iFlowIdUnite;
    }

    public void setiFlowIdUnite(Integer iFlowIdUnite) {
        this.iFlowIdUnite = iFlowIdUnite;
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
        dm_express_flow other = (dm_express_flow) that;
        return (this.getiFlowId() == null ? other.getiFlowId() == null : this.getiFlowId().equals(other.getiFlowId()))
            && (this.getiConsId() == null ? other.getiConsId() == null : this.getiConsId().equals(other.getiConsId()))
            && (this.geteFlowType() == null ? other.geteFlowType() == null : this.geteFlowType().equals(other.geteFlowType()))
            && (this.geteWorkRange() == null ? other.geteWorkRange() == null : this.geteWorkRange().equals(other.geteWorkRange()))
            && (this.getbFlowState() == null ? other.getbFlowState() == null : this.getbFlowState().equals(other.getbFlowState()))
            && (this.getiLocomId() == null ? other.getiLocomId() == null : this.getiLocomId().equals(other.getiLocomId()))
            && (this.getiFlowNo() == null ? other.getiFlowNo() == null : this.getiFlowNo().equals(other.getiFlowNo()))
            && (this.getiFlowOrder() == null ? other.getiFlowOrder() == null : this.getiFlowOrder().equals(other.getiFlowOrder()))
            && (this.getiFlowNoStart() == null ? other.getiFlowNoStart() == null : this.getiFlowNoStart().equals(other.getiFlowNoStart()))
            && (this.getcTrainNum() == null ? other.getcTrainNum() == null : this.getcTrainNum().equals(other.getcTrainNum()))
            && (this.getcOpMaker() == null ? other.getcOpMaker() == null : this.getcOpMaker().equals(other.getcOpMaker()))
            && (this.getdFaStart() == null ? other.getdFaStart() == null : this.getdFaStart().equals(other.getdFaStart()))
            && (this.getdFaEnd() == null ? other.getdFaEnd() == null : this.getdFaEnd().equals(other.getdFaEnd()))
            && (this.getdPlStart() == null ? other.getdPlStart() == null : this.getdPlStart().equals(other.getdPlStart()))
            && (this.getdPlEnd() == null ? other.getdPlEnd() == null : this.getdPlEnd().equals(other.getdPlEnd()))
            && (this.getiFlowIdUnite() == null ? other.getiFlowIdUnite() == null : this.getiFlowIdUnite().equals(other.getiFlowIdUnite()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiFlowId() == null) ? 0 : getiFlowId().hashCode());
        result = prime * result + ((getiConsId() == null) ? 0 : getiConsId().hashCode());
        result = prime * result + ((geteFlowType() == null) ? 0 : geteFlowType().hashCode());
        result = prime * result + ((geteWorkRange() == null) ? 0 : geteWorkRange().hashCode());
        result = prime * result + ((getbFlowState() == null) ? 0 : getbFlowState().hashCode());
        result = prime * result + ((getiLocomId() == null) ? 0 : getiLocomId().hashCode());
        result = prime * result + ((getiFlowNo() == null) ? 0 : getiFlowNo().hashCode());
        result = prime * result + ((getiFlowOrder() == null) ? 0 : getiFlowOrder().hashCode());
        result = prime * result + ((getiFlowNoStart() == null) ? 0 : getiFlowNoStart().hashCode());
        result = prime * result + ((getcTrainNum() == null) ? 0 : getcTrainNum().hashCode());
        result = prime * result + ((getcOpMaker() == null) ? 0 : getcOpMaker().hashCode());
        result = prime * result + ((getdFaStart() == null) ? 0 : getdFaStart().hashCode());
        result = prime * result + ((getdFaEnd() == null) ? 0 : getdFaEnd().hashCode());
        result = prime * result + ((getdPlStart() == null) ? 0 : getdPlStart().hashCode());
        result = prime * result + ((getdPlEnd() == null) ? 0 : getdPlEnd().hashCode());
        result = prime * result + ((getiFlowIdUnite() == null) ? 0 : getiFlowIdUnite().hashCode());
        return result;
    }
}