package com.hengaiw.model;

import java.io.Serializable;
import java.util.Date;

public class dm_td_tra_text implements Serializable {
    private Long iTraSeq;

    private Long iTraId;

    private Integer iTraInSeq;

    private Integer eSymArrdep;

    private Date dTraTimeArr;

    private Date dTraTimeDep;

    private Integer iLineIdArr;

    private Integer iLineIdDep;

    private Date dFaNotifyArr;

    private Date dFaNotifyDep;

    private Integer iYardId;

    private Integer iLineIdArrdep;

    private Integer eStateArr;

    private Integer eStateDep;

    private Long bPlLock;

    private Date dDepRequest;

    private Date dArrAgree;

    private String cPhoneObturate;

    private String cPhoneSection;

    private String cUseSection;

    private String cPhoneCancel;

    private Date dTraTbArr;

    private Date dTraTbDep;

    private String cOpWork;

    private String cTraNumDep;

    private static final long serialVersionUID = 1L;

    public Long getiTraSeq() {
        return iTraSeq;
    }

    public void setiTraSeq(Long iTraSeq) {
        this.iTraSeq = iTraSeq;
    }

    public Long getiTraId() {
        return iTraId;
    }

    public void setiTraId(Long iTraId) {
        this.iTraId = iTraId;
    }

    public Integer getiTraInSeq() {
        return iTraInSeq;
    }

    public void setiTraInSeq(Integer iTraInSeq) {
        this.iTraInSeq = iTraInSeq;
    }

    public Integer geteSymArrdep() {
        return eSymArrdep;
    }

    public void seteSymArrdep(Integer eSymArrdep) {
        this.eSymArrdep = eSymArrdep;
    }

    public Date getdTraTimeArr() {
        return dTraTimeArr;
    }

    public void setdTraTimeArr(Date dTraTimeArr) {
        this.dTraTimeArr = dTraTimeArr;
    }

    public Date getdTraTimeDep() {
        return dTraTimeDep;
    }

    public void setdTraTimeDep(Date dTraTimeDep) {
        this.dTraTimeDep = dTraTimeDep;
    }

    public Integer getiLineIdArr() {
        return iLineIdArr;
    }

    public void setiLineIdArr(Integer iLineIdArr) {
        this.iLineIdArr = iLineIdArr;
    }

    public Integer getiLineIdDep() {
        return iLineIdDep;
    }

    public void setiLineIdDep(Integer iLineIdDep) {
        this.iLineIdDep = iLineIdDep;
    }

    public Date getdFaNotifyArr() {
        return dFaNotifyArr;
    }

    public void setdFaNotifyArr(Date dFaNotifyArr) {
        this.dFaNotifyArr = dFaNotifyArr;
    }

    public Date getdFaNotifyDep() {
        return dFaNotifyDep;
    }

    public void setdFaNotifyDep(Date dFaNotifyDep) {
        this.dFaNotifyDep = dFaNotifyDep;
    }

    public Integer getiYardId() {
        return iYardId;
    }

    public void setiYardId(Integer iYardId) {
        this.iYardId = iYardId;
    }

    public Integer getiLineIdArrdep() {
        return iLineIdArrdep;
    }

    public void setiLineIdArrdep(Integer iLineIdArrdep) {
        this.iLineIdArrdep = iLineIdArrdep;
    }

    public Integer geteStateArr() {
        return eStateArr;
    }

    public void seteStateArr(Integer eStateArr) {
        this.eStateArr = eStateArr;
    }

    public Integer geteStateDep() {
        return eStateDep;
    }

    public void seteStateDep(Integer eStateDep) {
        this.eStateDep = eStateDep;
    }

    public Long getbPlLock() {
        return bPlLock;
    }

    public void setbPlLock(Long bPlLock) {
        this.bPlLock = bPlLock;
    }

    public Date getdDepRequest() {
        return dDepRequest;
    }

    public void setdDepRequest(Date dDepRequest) {
        this.dDepRequest = dDepRequest;
    }

    public Date getdArrAgree() {
        return dArrAgree;
    }

    public void setdArrAgree(Date dArrAgree) {
        this.dArrAgree = dArrAgree;
    }

    public String getcPhoneObturate() {
        return cPhoneObturate;
    }

    public void setcPhoneObturate(String cPhoneObturate) {
        this.cPhoneObturate = cPhoneObturate == null ? null : cPhoneObturate.trim();
    }

    public String getcPhoneSection() {
        return cPhoneSection;
    }

    public void setcPhoneSection(String cPhoneSection) {
        this.cPhoneSection = cPhoneSection == null ? null : cPhoneSection.trim();
    }

    public String getcUseSection() {
        return cUseSection;
    }

    public void setcUseSection(String cUseSection) {
        this.cUseSection = cUseSection == null ? null : cUseSection.trim();
    }

    public String getcPhoneCancel() {
        return cPhoneCancel;
    }

    public void setcPhoneCancel(String cPhoneCancel) {
        this.cPhoneCancel = cPhoneCancel == null ? null : cPhoneCancel.trim();
    }

    public Date getdTraTbArr() {
        return dTraTbArr;
    }

    public void setdTraTbArr(Date dTraTbArr) {
        this.dTraTbArr = dTraTbArr;
    }

    public Date getdTraTbDep() {
        return dTraTbDep;
    }

    public void setdTraTbDep(Date dTraTbDep) {
        this.dTraTbDep = dTraTbDep;
    }

    public String getcOpWork() {
        return cOpWork;
    }

    public void setcOpWork(String cOpWork) {
        this.cOpWork = cOpWork == null ? null : cOpWork.trim();
    }

    public String getcTraNumDep() {
        return cTraNumDep;
    }

    public void setcTraNumDep(String cTraNumDep) {
        this.cTraNumDep = cTraNumDep == null ? null : cTraNumDep.trim();
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
        dm_td_tra_text other = (dm_td_tra_text) that;
        return (this.getiTraSeq() == null ? other.getiTraSeq() == null : this.getiTraSeq().equals(other.getiTraSeq()))
            && (this.getiTraId() == null ? other.getiTraId() == null : this.getiTraId().equals(other.getiTraId()))
            && (this.getiTraInSeq() == null ? other.getiTraInSeq() == null : this.getiTraInSeq().equals(other.getiTraInSeq()))
            && (this.geteSymArrdep() == null ? other.geteSymArrdep() == null : this.geteSymArrdep().equals(other.geteSymArrdep()))
            && (this.getdTraTimeArr() == null ? other.getdTraTimeArr() == null : this.getdTraTimeArr().equals(other.getdTraTimeArr()))
            && (this.getdTraTimeDep() == null ? other.getdTraTimeDep() == null : this.getdTraTimeDep().equals(other.getdTraTimeDep()))
            && (this.getiLineIdArr() == null ? other.getiLineIdArr() == null : this.getiLineIdArr().equals(other.getiLineIdArr()))
            && (this.getiLineIdDep() == null ? other.getiLineIdDep() == null : this.getiLineIdDep().equals(other.getiLineIdDep()))
            && (this.getdFaNotifyArr() == null ? other.getdFaNotifyArr() == null : this.getdFaNotifyArr().equals(other.getdFaNotifyArr()))
            && (this.getdFaNotifyDep() == null ? other.getdFaNotifyDep() == null : this.getdFaNotifyDep().equals(other.getdFaNotifyDep()))
            && (this.getiYardId() == null ? other.getiYardId() == null : this.getiYardId().equals(other.getiYardId()))
            && (this.getiLineIdArrdep() == null ? other.getiLineIdArrdep() == null : this.getiLineIdArrdep().equals(other.getiLineIdArrdep()))
            && (this.geteStateArr() == null ? other.geteStateArr() == null : this.geteStateArr().equals(other.geteStateArr()))
            && (this.geteStateDep() == null ? other.geteStateDep() == null : this.geteStateDep().equals(other.geteStateDep()))
            && (this.getbPlLock() == null ? other.getbPlLock() == null : this.getbPlLock().equals(other.getbPlLock()))
            && (this.getdDepRequest() == null ? other.getdDepRequest() == null : this.getdDepRequest().equals(other.getdDepRequest()))
            && (this.getdArrAgree() == null ? other.getdArrAgree() == null : this.getdArrAgree().equals(other.getdArrAgree()))
            && (this.getcPhoneObturate() == null ? other.getcPhoneObturate() == null : this.getcPhoneObturate().equals(other.getcPhoneObturate()))
            && (this.getcPhoneSection() == null ? other.getcPhoneSection() == null : this.getcPhoneSection().equals(other.getcPhoneSection()))
            && (this.getcUseSection() == null ? other.getcUseSection() == null : this.getcUseSection().equals(other.getcUseSection()))
            && (this.getcPhoneCancel() == null ? other.getcPhoneCancel() == null : this.getcPhoneCancel().equals(other.getcPhoneCancel()))
            && (this.getdTraTbArr() == null ? other.getdTraTbArr() == null : this.getdTraTbArr().equals(other.getdTraTbArr()))
            && (this.getdTraTbDep() == null ? other.getdTraTbDep() == null : this.getdTraTbDep().equals(other.getdTraTbDep()))
            && (this.getcOpWork() == null ? other.getcOpWork() == null : this.getcOpWork().equals(other.getcOpWork()))
            && (this.getcTraNumDep() == null ? other.getcTraNumDep() == null : this.getcTraNumDep().equals(other.getcTraNumDep()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiTraSeq() == null) ? 0 : getiTraSeq().hashCode());
        result = prime * result + ((getiTraId() == null) ? 0 : getiTraId().hashCode());
        result = prime * result + ((getiTraInSeq() == null) ? 0 : getiTraInSeq().hashCode());
        result = prime * result + ((geteSymArrdep() == null) ? 0 : geteSymArrdep().hashCode());
        result = prime * result + ((getdTraTimeArr() == null) ? 0 : getdTraTimeArr().hashCode());
        result = prime * result + ((getdTraTimeDep() == null) ? 0 : getdTraTimeDep().hashCode());
        result = prime * result + ((getiLineIdArr() == null) ? 0 : getiLineIdArr().hashCode());
        result = prime * result + ((getiLineIdDep() == null) ? 0 : getiLineIdDep().hashCode());
        result = prime * result + ((getdFaNotifyArr() == null) ? 0 : getdFaNotifyArr().hashCode());
        result = prime * result + ((getdFaNotifyDep() == null) ? 0 : getdFaNotifyDep().hashCode());
        result = prime * result + ((getiYardId() == null) ? 0 : getiYardId().hashCode());
        result = prime * result + ((getiLineIdArrdep() == null) ? 0 : getiLineIdArrdep().hashCode());
        result = prime * result + ((geteStateArr() == null) ? 0 : geteStateArr().hashCode());
        result = prime * result + ((geteStateDep() == null) ? 0 : geteStateDep().hashCode());
        result = prime * result + ((getbPlLock() == null) ? 0 : getbPlLock().hashCode());
        result = prime * result + ((getdDepRequest() == null) ? 0 : getdDepRequest().hashCode());
        result = prime * result + ((getdArrAgree() == null) ? 0 : getdArrAgree().hashCode());
        result = prime * result + ((getcPhoneObturate() == null) ? 0 : getcPhoneObturate().hashCode());
        result = prime * result + ((getcPhoneSection() == null) ? 0 : getcPhoneSection().hashCode());
        result = prime * result + ((getcUseSection() == null) ? 0 : getcUseSection().hashCode());
        result = prime * result + ((getcPhoneCancel() == null) ? 0 : getcPhoneCancel().hashCode());
        result = prime * result + ((getdTraTbArr() == null) ? 0 : getdTraTbArr().hashCode());
        result = prime * result + ((getdTraTbDep() == null) ? 0 : getdTraTbDep().hashCode());
        result = prime * result + ((getcOpWork() == null) ? 0 : getcOpWork().hashCode());
        result = prime * result + ((getcTraNumDep() == null) ? 0 : getcTraNumDep().hashCode());
        return result;
    }
}