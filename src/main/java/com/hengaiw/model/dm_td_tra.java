package com.hengaiw.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class dm_td_tra implements Serializable {
    private Long iTraId;

    private String cTraNum;

    private Integer eSymArrdep;

    private Integer iLocomNum;

    private BigDecimal fWegh;

    private BigDecimal fLen;

    private Integer iCarNum;

    private Integer eTraChara;

    private Long iConsId;

    private Integer eConsState;

    private Long bSymCheck;

    private Integer iOrderId;

    private String cLocomCo1;

    private String cLocomCo2;

    private Integer eLocomType;

    private Integer ePlState;

    private Integer eWorkNotice;

    private Integer eRecordU;

    private Integer eReasonLate;

    private Integer ePlType;

    private String cTraNumTb;

    private String cTraNumMatch;

    private String cTraNumLocom;

    private String cTraNumLocom1;

    private Long bPlLock;

    private Date dLocom;

    private String cOpLocom;

    private String cRemark;

    private Long bVoiceState;

    private Integer iLineIdArrdep;

    private Date dFaNotify;

    private Date dTraTime;

    private String cAttention;

    private static final long serialVersionUID = 1L;

    public Long getiTraId() {
        return iTraId;
    }

    public void setiTraId(Long iTraId) {
        this.iTraId = iTraId;
    }

    public String getcTraNum() {
        return cTraNum;
    }

    public void setcTraNum(String cTraNum) {
        this.cTraNum = cTraNum == null ? null : cTraNum.trim();
    }

    public Integer geteSymArrdep() {
        return eSymArrdep;
    }

    public void seteSymArrdep(Integer eSymArrdep) {
        this.eSymArrdep = eSymArrdep;
    }

    public Integer getiLocomNum() {
        return iLocomNum;
    }

    public void setiLocomNum(Integer iLocomNum) {
        this.iLocomNum = iLocomNum;
    }

    public BigDecimal getfWegh() {
        return fWegh;
    }

    public void setfWegh(BigDecimal fWegh) {
        this.fWegh = fWegh;
    }

    public BigDecimal getfLen() {
        return fLen;
    }

    public void setfLen(BigDecimal fLen) {
        this.fLen = fLen;
    }

    public Integer getiCarNum() {
        return iCarNum;
    }

    public void setiCarNum(Integer iCarNum) {
        this.iCarNum = iCarNum;
    }

    public Integer geteTraChara() {
        return eTraChara;
    }

    public void seteTraChara(Integer eTraChara) {
        this.eTraChara = eTraChara;
    }

    public Long getiConsId() {
        return iConsId;
    }

    public void setiConsId(Long iConsId) {
        this.iConsId = iConsId;
    }

    public Integer geteConsState() {
        return eConsState;
    }

    public void seteConsState(Integer eConsState) {
        this.eConsState = eConsState;
    }

    public Long getbSymCheck() {
        return bSymCheck;
    }

    public void setbSymCheck(Long bSymCheck) {
        this.bSymCheck = bSymCheck;
    }

    public Integer getiOrderId() {
        return iOrderId;
    }

    public void setiOrderId(Integer iOrderId) {
        this.iOrderId = iOrderId;
    }

    public String getcLocomCo1() {
        return cLocomCo1;
    }

    public void setcLocomCo1(String cLocomCo1) {
        this.cLocomCo1 = cLocomCo1 == null ? null : cLocomCo1.trim();
    }

    public String getcLocomCo2() {
        return cLocomCo2;
    }

    public void setcLocomCo2(String cLocomCo2) {
        this.cLocomCo2 = cLocomCo2 == null ? null : cLocomCo2.trim();
    }

    public Integer geteLocomType() {
        return eLocomType;
    }

    public void seteLocomType(Integer eLocomType) {
        this.eLocomType = eLocomType;
    }

    public Integer getePlState() {
        return ePlState;
    }

    public void setePlState(Integer ePlState) {
        this.ePlState = ePlState;
    }

    public Integer geteWorkNotice() {
        return eWorkNotice;
    }

    public void seteWorkNotice(Integer eWorkNotice) {
        this.eWorkNotice = eWorkNotice;
    }

    public Integer geteRecordU() {
        return eRecordU;
    }

    public void seteRecordU(Integer eRecordU) {
        this.eRecordU = eRecordU;
    }

    public Integer geteReasonLate() {
        return eReasonLate;
    }

    public void seteReasonLate(Integer eReasonLate) {
        this.eReasonLate = eReasonLate;
    }

    public Integer getePlType() {
        return ePlType;
    }

    public void setePlType(Integer ePlType) {
        this.ePlType = ePlType;
    }

    public String getcTraNumTb() {
        return cTraNumTb;
    }

    public void setcTraNumTb(String cTraNumTb) {
        this.cTraNumTb = cTraNumTb == null ? null : cTraNumTb.trim();
    }

    public String getcTraNumMatch() {
        return cTraNumMatch;
    }

    public void setcTraNumMatch(String cTraNumMatch) {
        this.cTraNumMatch = cTraNumMatch == null ? null : cTraNumMatch.trim();
    }

    public String getcTraNumLocom() {
        return cTraNumLocom;
    }

    public void setcTraNumLocom(String cTraNumLocom) {
        this.cTraNumLocom = cTraNumLocom == null ? null : cTraNumLocom.trim();
    }

    public String getcTraNumLocom1() {
        return cTraNumLocom1;
    }

    public void setcTraNumLocom1(String cTraNumLocom1) {
        this.cTraNumLocom1 = cTraNumLocom1 == null ? null : cTraNumLocom1.trim();
    }

    public Long getbPlLock() {
        return bPlLock;
    }

    public void setbPlLock(Long bPlLock) {
        this.bPlLock = bPlLock;
    }

    public Date getdLocom() {
        return dLocom;
    }

    public void setdLocom(Date dLocom) {
        this.dLocom = dLocom;
    }

    public String getcOpLocom() {
        return cOpLocom;
    }

    public void setcOpLocom(String cOpLocom) {
        this.cOpLocom = cOpLocom == null ? null : cOpLocom.trim();
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark == null ? null : cRemark.trim();
    }

    public Long getbVoiceState() {
        return bVoiceState;
    }

    public void setbVoiceState(Long bVoiceState) {
        this.bVoiceState = bVoiceState;
    }

    public Integer getiLineIdArrdep() {
        return iLineIdArrdep;
    }

    public void setiLineIdArrdep(Integer iLineIdArrdep) {
        this.iLineIdArrdep = iLineIdArrdep;
    }

    public Date getdFaNotify() {
        return dFaNotify;
    }

    public void setdFaNotify(Date dFaNotify) {
        this.dFaNotify = dFaNotify;
    }

    public Date getdTraTime() {
        return dTraTime;
    }

    public void setdTraTime(Date dTraTime) {
        this.dTraTime = dTraTime;
    }

    public String getcAttention() {
        return cAttention;
    }

    public void setcAttention(String cAttention) {
        this.cAttention = cAttention == null ? null : cAttention.trim();
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
        dm_td_tra other = (dm_td_tra) that;
        return (this.getiTraId() == null ? other.getiTraId() == null : this.getiTraId().equals(other.getiTraId()))
            && (this.getcTraNum() == null ? other.getcTraNum() == null : this.getcTraNum().equals(other.getcTraNum()))
            && (this.geteSymArrdep() == null ? other.geteSymArrdep() == null : this.geteSymArrdep().equals(other.geteSymArrdep()))
            && (this.getiLocomNum() == null ? other.getiLocomNum() == null : this.getiLocomNum().equals(other.getiLocomNum()))
            && (this.getfWegh() == null ? other.getfWegh() == null : this.getfWegh().equals(other.getfWegh()))
            && (this.getfLen() == null ? other.getfLen() == null : this.getfLen().equals(other.getfLen()))
            && (this.getiCarNum() == null ? other.getiCarNum() == null : this.getiCarNum().equals(other.getiCarNum()))
            && (this.geteTraChara() == null ? other.geteTraChara() == null : this.geteTraChara().equals(other.geteTraChara()))
            && (this.getiConsId() == null ? other.getiConsId() == null : this.getiConsId().equals(other.getiConsId()))
            && (this.geteConsState() == null ? other.geteConsState() == null : this.geteConsState().equals(other.geteConsState()))
            && (this.getbSymCheck() == null ? other.getbSymCheck() == null : this.getbSymCheck().equals(other.getbSymCheck()))
            && (this.getiOrderId() == null ? other.getiOrderId() == null : this.getiOrderId().equals(other.getiOrderId()))
            && (this.getcLocomCo1() == null ? other.getcLocomCo1() == null : this.getcLocomCo1().equals(other.getcLocomCo1()))
            && (this.getcLocomCo2() == null ? other.getcLocomCo2() == null : this.getcLocomCo2().equals(other.getcLocomCo2()))
            && (this.geteLocomType() == null ? other.geteLocomType() == null : this.geteLocomType().equals(other.geteLocomType()))
            && (this.getePlState() == null ? other.getePlState() == null : this.getePlState().equals(other.getePlState()))
            && (this.geteWorkNotice() == null ? other.geteWorkNotice() == null : this.geteWorkNotice().equals(other.geteWorkNotice()))
            && (this.geteRecordU() == null ? other.geteRecordU() == null : this.geteRecordU().equals(other.geteRecordU()))
            && (this.geteReasonLate() == null ? other.geteReasonLate() == null : this.geteReasonLate().equals(other.geteReasonLate()))
            && (this.getePlType() == null ? other.getePlType() == null : this.getePlType().equals(other.getePlType()))
            && (this.getcTraNumTb() == null ? other.getcTraNumTb() == null : this.getcTraNumTb().equals(other.getcTraNumTb()))
            && (this.getcTraNumMatch() == null ? other.getcTraNumMatch() == null : this.getcTraNumMatch().equals(other.getcTraNumMatch()))
            && (this.getcTraNumLocom() == null ? other.getcTraNumLocom() == null : this.getcTraNumLocom().equals(other.getcTraNumLocom()))
            && (this.getcTraNumLocom1() == null ? other.getcTraNumLocom1() == null : this.getcTraNumLocom1().equals(other.getcTraNumLocom1()))
            && (this.getbPlLock() == null ? other.getbPlLock() == null : this.getbPlLock().equals(other.getbPlLock()))
            && (this.getdLocom() == null ? other.getdLocom() == null : this.getdLocom().equals(other.getdLocom()))
            && (this.getcOpLocom() == null ? other.getcOpLocom() == null : this.getcOpLocom().equals(other.getcOpLocom()))
            && (this.getcRemark() == null ? other.getcRemark() == null : this.getcRemark().equals(other.getcRemark()))
            && (this.getbVoiceState() == null ? other.getbVoiceState() == null : this.getbVoiceState().equals(other.getbVoiceState()))
            && (this.getiLineIdArrdep() == null ? other.getiLineIdArrdep() == null : this.getiLineIdArrdep().equals(other.getiLineIdArrdep()))
            && (this.getdFaNotify() == null ? other.getdFaNotify() == null : this.getdFaNotify().equals(other.getdFaNotify()))
            && (this.getdTraTime() == null ? other.getdTraTime() == null : this.getdTraTime().equals(other.getdTraTime()))
            && (this.getcAttention() == null ? other.getcAttention() == null : this.getcAttention().equals(other.getcAttention()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiTraId() == null) ? 0 : getiTraId().hashCode());
        result = prime * result + ((getcTraNum() == null) ? 0 : getcTraNum().hashCode());
        result = prime * result + ((geteSymArrdep() == null) ? 0 : geteSymArrdep().hashCode());
        result = prime * result + ((getiLocomNum() == null) ? 0 : getiLocomNum().hashCode());
        result = prime * result + ((getfWegh() == null) ? 0 : getfWegh().hashCode());
        result = prime * result + ((getfLen() == null) ? 0 : getfLen().hashCode());
        result = prime * result + ((getiCarNum() == null) ? 0 : getiCarNum().hashCode());
        result = prime * result + ((geteTraChara() == null) ? 0 : geteTraChara().hashCode());
        result = prime * result + ((getiConsId() == null) ? 0 : getiConsId().hashCode());
        result = prime * result + ((geteConsState() == null) ? 0 : geteConsState().hashCode());
        result = prime * result + ((getbSymCheck() == null) ? 0 : getbSymCheck().hashCode());
        result = prime * result + ((getiOrderId() == null) ? 0 : getiOrderId().hashCode());
        result = prime * result + ((getcLocomCo1() == null) ? 0 : getcLocomCo1().hashCode());
        result = prime * result + ((getcLocomCo2() == null) ? 0 : getcLocomCo2().hashCode());
        result = prime * result + ((geteLocomType() == null) ? 0 : geteLocomType().hashCode());
        result = prime * result + ((getePlState() == null) ? 0 : getePlState().hashCode());
        result = prime * result + ((geteWorkNotice() == null) ? 0 : geteWorkNotice().hashCode());
        result = prime * result + ((geteRecordU() == null) ? 0 : geteRecordU().hashCode());
        result = prime * result + ((geteReasonLate() == null) ? 0 : geteReasonLate().hashCode());
        result = prime * result + ((getePlType() == null) ? 0 : getePlType().hashCode());
        result = prime * result + ((getcTraNumTb() == null) ? 0 : getcTraNumTb().hashCode());
        result = prime * result + ((getcTraNumMatch() == null) ? 0 : getcTraNumMatch().hashCode());
        result = prime * result + ((getcTraNumLocom() == null) ? 0 : getcTraNumLocom().hashCode());
        result = prime * result + ((getcTraNumLocom1() == null) ? 0 : getcTraNumLocom1().hashCode());
        result = prime * result + ((getbPlLock() == null) ? 0 : getbPlLock().hashCode());
        result = prime * result + ((getdLocom() == null) ? 0 : getdLocom().hashCode());
        result = prime * result + ((getcOpLocom() == null) ? 0 : getcOpLocom().hashCode());
        result = prime * result + ((getcRemark() == null) ? 0 : getcRemark().hashCode());
        result = prime * result + ((getbVoiceState() == null) ? 0 : getbVoiceState().hashCode());
        result = prime * result + ((getiLineIdArrdep() == null) ? 0 : getiLineIdArrdep().hashCode());
        result = prime * result + ((getdFaNotify() == null) ? 0 : getdFaNotify().hashCode());
        result = prime * result + ((getdTraTime() == null) ? 0 : getdTraTime().hashCode());
        result = prime * result + ((getcAttention() == null) ? 0 : getcAttention().hashCode());
        return result;
    }
}