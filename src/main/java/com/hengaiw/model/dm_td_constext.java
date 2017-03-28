package com.hengaiw.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class dm_td_constext implements Serializable {
    private Long iCarId;

    private Integer iVersionNo;

    private String cCarCo;

    private Long iConsIdArr;

    private Long iConsIdDep;

    private Integer iConsNoArr;

    private Integer iConsNoDep;

    private String cSuitType;

    private String cCarType;

    private String cCarTypeForsh;

    private Integer eCarType;

    private Integer eOilType;

    private BigDecimal fWeghOwn;

    private BigDecimal fLen;

    private BigDecimal fWeghLoad;

    private String cStaCoArr;

    private String cStaNaArr;

    private String cBurCoArr;

    private Integer iSburCoArr;

    private String cStaCoEnd;

    private String cStaNaEnd;

    private String cGoodsNa;

    private String cConsignee;

    private String cStaCoDep;

    private String cStaNaDep;

    private Integer iCanvasNum;

    private Integer eSymBadcar;

    private String cRemark;

    private Integer eSymGro;

    private Integer eSymWegh;

    private Integer eSymLcl;

    private Integer eSymArmy;

    private Integer eSymEcho;

    private Integer eSymEnterprise;

    private Integer eSymOutserv;

    private Integer eSymOther;

    private Integer eOutservCo;

    private String cSealId;

    private String cCanvasId;

    private Integer iGroId;

    private Integer iLineId;

    private String cLineNa;

    private Long bCarChara;

    private Integer eCarChara;

    private String cTraNumArr;

    private Date dTraArr;

    private String cInvCo;

    private String cCanvasId1;

    private String cCanvasId2;

    private Integer iGroIdStat;

    private String cConsignor;

    private Long bCarState;

    private Date dLineIn;

    private Integer iGoodsNum;

    private Date dWork;

    private Date dWorkBegin;

    private Date dLineOut;

    private BigDecimal fRatekmsUnload;

    private BigDecimal fRatekmsLoad;

    private Short iLimitSpeed;

    private String cStaCoRouteComp;

    private static final long serialVersionUID = 1L;

    public Long getiCarId() {
        return iCarId;
    }

    public void setiCarId(Long iCarId) {
        this.iCarId = iCarId;
    }

    public Integer getiVersionNo() {
        return iVersionNo;
    }

    public void setiVersionNo(Integer iVersionNo) {
        this.iVersionNo = iVersionNo;
    }

    public String getcCarCo() {
        return cCarCo;
    }

    public void setcCarCo(String cCarCo) {
        this.cCarCo = cCarCo == null ? null : cCarCo.trim();
    }

    public Long getiConsIdArr() {
        return iConsIdArr;
    }

    public void setiConsIdArr(Long iConsIdArr) {
        this.iConsIdArr = iConsIdArr;
    }

    public Long getiConsIdDep() {
        return iConsIdDep;
    }

    public void setiConsIdDep(Long iConsIdDep) {
        this.iConsIdDep = iConsIdDep;
    }

    public Integer getiConsNoArr() {
        return iConsNoArr;
    }

    public void setiConsNoArr(Integer iConsNoArr) {
        this.iConsNoArr = iConsNoArr;
    }

    public Integer getiConsNoDep() {
        return iConsNoDep;
    }

    public void setiConsNoDep(Integer iConsNoDep) {
        this.iConsNoDep = iConsNoDep;
    }

    public String getcSuitType() {
        return cSuitType;
    }

    public void setcSuitType(String cSuitType) {
        this.cSuitType = cSuitType == null ? null : cSuitType.trim();
    }

    public String getcCarType() {
        return cCarType;
    }

    public void setcCarType(String cCarType) {
        this.cCarType = cCarType == null ? null : cCarType.trim();
    }

    public String getcCarTypeForsh() {
        return cCarTypeForsh;
    }

    public void setcCarTypeForsh(String cCarTypeForsh) {
        this.cCarTypeForsh = cCarTypeForsh == null ? null : cCarTypeForsh.trim();
    }

    public Integer geteCarType() {
        return eCarType;
    }

    public void seteCarType(Integer eCarType) {
        this.eCarType = eCarType;
    }

    public Integer geteOilType() {
        return eOilType;
    }

    public void seteOilType(Integer eOilType) {
        this.eOilType = eOilType;
    }

    public BigDecimal getfWeghOwn() {
        return fWeghOwn;
    }

    public void setfWeghOwn(BigDecimal fWeghOwn) {
        this.fWeghOwn = fWeghOwn;
    }

    public BigDecimal getfLen() {
        return fLen;
    }

    public void setfLen(BigDecimal fLen) {
        this.fLen = fLen;
    }

    public BigDecimal getfWeghLoad() {
        return fWeghLoad;
    }

    public void setfWeghLoad(BigDecimal fWeghLoad) {
        this.fWeghLoad = fWeghLoad;
    }

    public String getcStaCoArr() {
        return cStaCoArr;
    }

    public void setcStaCoArr(String cStaCoArr) {
        this.cStaCoArr = cStaCoArr == null ? null : cStaCoArr.trim();
    }

    public String getcStaNaArr() {
        return cStaNaArr;
    }

    public void setcStaNaArr(String cStaNaArr) {
        this.cStaNaArr = cStaNaArr == null ? null : cStaNaArr.trim();
    }

    public String getcBurCoArr() {
        return cBurCoArr;
    }

    public void setcBurCoArr(String cBurCoArr) {
        this.cBurCoArr = cBurCoArr == null ? null : cBurCoArr.trim();
    }

    public Integer getiSburCoArr() {
        return iSburCoArr;
    }

    public void setiSburCoArr(Integer iSburCoArr) {
        this.iSburCoArr = iSburCoArr;
    }

    public String getcStaCoEnd() {
        return cStaCoEnd;
    }

    public void setcStaCoEnd(String cStaCoEnd) {
        this.cStaCoEnd = cStaCoEnd == null ? null : cStaCoEnd.trim();
    }

    public String getcStaNaEnd() {
        return cStaNaEnd;
    }

    public void setcStaNaEnd(String cStaNaEnd) {
        this.cStaNaEnd = cStaNaEnd == null ? null : cStaNaEnd.trim();
    }

    public String getcGoodsNa() {
        return cGoodsNa;
    }

    public void setcGoodsNa(String cGoodsNa) {
        this.cGoodsNa = cGoodsNa == null ? null : cGoodsNa.trim();
    }

    public String getcConsignee() {
        return cConsignee;
    }

    public void setcConsignee(String cConsignee) {
        this.cConsignee = cConsignee == null ? null : cConsignee.trim();
    }

    public String getcStaCoDep() {
        return cStaCoDep;
    }

    public void setcStaCoDep(String cStaCoDep) {
        this.cStaCoDep = cStaCoDep == null ? null : cStaCoDep.trim();
    }

    public String getcStaNaDep() {
        return cStaNaDep;
    }

    public void setcStaNaDep(String cStaNaDep) {
        this.cStaNaDep = cStaNaDep == null ? null : cStaNaDep.trim();
    }

    public Integer getiCanvasNum() {
        return iCanvasNum;
    }

    public void setiCanvasNum(Integer iCanvasNum) {
        this.iCanvasNum = iCanvasNum;
    }

    public Integer geteSymBadcar() {
        return eSymBadcar;
    }

    public void seteSymBadcar(Integer eSymBadcar) {
        this.eSymBadcar = eSymBadcar;
    }

    public String getcRemark() {
        return cRemark;
    }

    public void setcRemark(String cRemark) {
        this.cRemark = cRemark == null ? null : cRemark.trim();
    }

    public Integer geteSymGro() {
        return eSymGro;
    }

    public void seteSymGro(Integer eSymGro) {
        this.eSymGro = eSymGro;
    }

    public Integer geteSymWegh() {
        return eSymWegh;
    }

    public void seteSymWegh(Integer eSymWegh) {
        this.eSymWegh = eSymWegh;
    }

    public Integer geteSymLcl() {
        return eSymLcl;
    }

    public void seteSymLcl(Integer eSymLcl) {
        this.eSymLcl = eSymLcl;
    }

    public Integer geteSymArmy() {
        return eSymArmy;
    }

    public void seteSymArmy(Integer eSymArmy) {
        this.eSymArmy = eSymArmy;
    }

    public Integer geteSymEcho() {
        return eSymEcho;
    }

    public void seteSymEcho(Integer eSymEcho) {
        this.eSymEcho = eSymEcho;
    }

    public Integer geteSymEnterprise() {
        return eSymEnterprise;
    }

    public void seteSymEnterprise(Integer eSymEnterprise) {
        this.eSymEnterprise = eSymEnterprise;
    }

    public Integer geteSymOutserv() {
        return eSymOutserv;
    }

    public void seteSymOutserv(Integer eSymOutserv) {
        this.eSymOutserv = eSymOutserv;
    }

    public Integer geteSymOther() {
        return eSymOther;
    }

    public void seteSymOther(Integer eSymOther) {
        this.eSymOther = eSymOther;
    }

    public Integer geteOutservCo() {
        return eOutservCo;
    }

    public void seteOutservCo(Integer eOutservCo) {
        this.eOutservCo = eOutservCo;
    }

    public String getcSealId() {
        return cSealId;
    }

    public void setcSealId(String cSealId) {
        this.cSealId = cSealId == null ? null : cSealId.trim();
    }

    public String getcCanvasId() {
        return cCanvasId;
    }

    public void setcCanvasId(String cCanvasId) {
        this.cCanvasId = cCanvasId == null ? null : cCanvasId.trim();
    }

    public Integer getiGroId() {
        return iGroId;
    }

    public void setiGroId(Integer iGroId) {
        this.iGroId = iGroId;
    }

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

    public Long getbCarChara() {
        return bCarChara;
    }

    public void setbCarChara(Long bCarChara) {
        this.bCarChara = bCarChara;
    }

    public Integer geteCarChara() {
        return eCarChara;
    }

    public void seteCarChara(Integer eCarChara) {
        this.eCarChara = eCarChara;
    }

    public String getcTraNumArr() {
        return cTraNumArr;
    }

    public void setcTraNumArr(String cTraNumArr) {
        this.cTraNumArr = cTraNumArr == null ? null : cTraNumArr.trim();
    }

    public Date getdTraArr() {
        return dTraArr;
    }

    public void setdTraArr(Date dTraArr) {
        this.dTraArr = dTraArr;
    }

    public String getcInvCo() {
        return cInvCo;
    }

    public void setcInvCo(String cInvCo) {
        this.cInvCo = cInvCo == null ? null : cInvCo.trim();
    }

    public String getcCanvasId1() {
        return cCanvasId1;
    }

    public void setcCanvasId1(String cCanvasId1) {
        this.cCanvasId1 = cCanvasId1 == null ? null : cCanvasId1.trim();
    }

    public String getcCanvasId2() {
        return cCanvasId2;
    }

    public void setcCanvasId2(String cCanvasId2) {
        this.cCanvasId2 = cCanvasId2 == null ? null : cCanvasId2.trim();
    }

    public Integer getiGroIdStat() {
        return iGroIdStat;
    }

    public void setiGroIdStat(Integer iGroIdStat) {
        this.iGroIdStat = iGroIdStat;
    }

    public String getcConsignor() {
        return cConsignor;
    }

    public void setcConsignor(String cConsignor) {
        this.cConsignor = cConsignor == null ? null : cConsignor.trim();
    }

    public Long getbCarState() {
        return bCarState;
    }

    public void setbCarState(Long bCarState) {
        this.bCarState = bCarState;
    }

    public Date getdLineIn() {
        return dLineIn;
    }

    public void setdLineIn(Date dLineIn) {
        this.dLineIn = dLineIn;
    }

    public Integer getiGoodsNum() {
        return iGoodsNum;
    }

    public void setiGoodsNum(Integer iGoodsNum) {
        this.iGoodsNum = iGoodsNum;
    }

    public Date getdWork() {
        return dWork;
    }

    public void setdWork(Date dWork) {
        this.dWork = dWork;
    }

    public Date getdWorkBegin() {
        return dWorkBegin;
    }

    public void setdWorkBegin(Date dWorkBegin) {
        this.dWorkBegin = dWorkBegin;
    }

    public Date getdLineOut() {
        return dLineOut;
    }

    public void setdLineOut(Date dLineOut) {
        this.dLineOut = dLineOut;
    }

    public BigDecimal getfRatekmsUnload() {
        return fRatekmsUnload;
    }

    public void setfRatekmsUnload(BigDecimal fRatekmsUnload) {
        this.fRatekmsUnload = fRatekmsUnload;
    }

    public BigDecimal getfRatekmsLoad() {
        return fRatekmsLoad;
    }

    public void setfRatekmsLoad(BigDecimal fRatekmsLoad) {
        this.fRatekmsLoad = fRatekmsLoad;
    }

    public Short getiLimitSpeed() {
        return iLimitSpeed;
    }

    public void setiLimitSpeed(Short iLimitSpeed) {
        this.iLimitSpeed = iLimitSpeed;
    }

    public String getcStaCoRouteComp() {
        return cStaCoRouteComp;
    }

    public void setcStaCoRouteComp(String cStaCoRouteComp) {
        this.cStaCoRouteComp = cStaCoRouteComp == null ? null : cStaCoRouteComp.trim();
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
        dm_td_constext other = (dm_td_constext) that;
        return (this.getiCarId() == null ? other.getiCarId() == null : this.getiCarId().equals(other.getiCarId()))
            && (this.getiVersionNo() == null ? other.getiVersionNo() == null : this.getiVersionNo().equals(other.getiVersionNo()))
            && (this.getcCarCo() == null ? other.getcCarCo() == null : this.getcCarCo().equals(other.getcCarCo()))
            && (this.getiConsIdArr() == null ? other.getiConsIdArr() == null : this.getiConsIdArr().equals(other.getiConsIdArr()))
            && (this.getiConsIdDep() == null ? other.getiConsIdDep() == null : this.getiConsIdDep().equals(other.getiConsIdDep()))
            && (this.getiConsNoArr() == null ? other.getiConsNoArr() == null : this.getiConsNoArr().equals(other.getiConsNoArr()))
            && (this.getiConsNoDep() == null ? other.getiConsNoDep() == null : this.getiConsNoDep().equals(other.getiConsNoDep()))
            && (this.getcSuitType() == null ? other.getcSuitType() == null : this.getcSuitType().equals(other.getcSuitType()))
            && (this.getcCarType() == null ? other.getcCarType() == null : this.getcCarType().equals(other.getcCarType()))
            && (this.getcCarTypeForsh() == null ? other.getcCarTypeForsh() == null : this.getcCarTypeForsh().equals(other.getcCarTypeForsh()))
            && (this.geteCarType() == null ? other.geteCarType() == null : this.geteCarType().equals(other.geteCarType()))
            && (this.geteOilType() == null ? other.geteOilType() == null : this.geteOilType().equals(other.geteOilType()))
            && (this.getfWeghOwn() == null ? other.getfWeghOwn() == null : this.getfWeghOwn().equals(other.getfWeghOwn()))
            && (this.getfLen() == null ? other.getfLen() == null : this.getfLen().equals(other.getfLen()))
            && (this.getfWeghLoad() == null ? other.getfWeghLoad() == null : this.getfWeghLoad().equals(other.getfWeghLoad()))
            && (this.getcStaCoArr() == null ? other.getcStaCoArr() == null : this.getcStaCoArr().equals(other.getcStaCoArr()))
            && (this.getcStaNaArr() == null ? other.getcStaNaArr() == null : this.getcStaNaArr().equals(other.getcStaNaArr()))
            && (this.getcBurCoArr() == null ? other.getcBurCoArr() == null : this.getcBurCoArr().equals(other.getcBurCoArr()))
            && (this.getiSburCoArr() == null ? other.getiSburCoArr() == null : this.getiSburCoArr().equals(other.getiSburCoArr()))
            && (this.getcStaCoEnd() == null ? other.getcStaCoEnd() == null : this.getcStaCoEnd().equals(other.getcStaCoEnd()))
            && (this.getcStaNaEnd() == null ? other.getcStaNaEnd() == null : this.getcStaNaEnd().equals(other.getcStaNaEnd()))
            && (this.getcGoodsNa() == null ? other.getcGoodsNa() == null : this.getcGoodsNa().equals(other.getcGoodsNa()))
            && (this.getcConsignee() == null ? other.getcConsignee() == null : this.getcConsignee().equals(other.getcConsignee()))
            && (this.getcStaCoDep() == null ? other.getcStaCoDep() == null : this.getcStaCoDep().equals(other.getcStaCoDep()))
            && (this.getcStaNaDep() == null ? other.getcStaNaDep() == null : this.getcStaNaDep().equals(other.getcStaNaDep()))
            && (this.getiCanvasNum() == null ? other.getiCanvasNum() == null : this.getiCanvasNum().equals(other.getiCanvasNum()))
            && (this.geteSymBadcar() == null ? other.geteSymBadcar() == null : this.geteSymBadcar().equals(other.geteSymBadcar()))
            && (this.getcRemark() == null ? other.getcRemark() == null : this.getcRemark().equals(other.getcRemark()))
            && (this.geteSymGro() == null ? other.geteSymGro() == null : this.geteSymGro().equals(other.geteSymGro()))
            && (this.geteSymWegh() == null ? other.geteSymWegh() == null : this.geteSymWegh().equals(other.geteSymWegh()))
            && (this.geteSymLcl() == null ? other.geteSymLcl() == null : this.geteSymLcl().equals(other.geteSymLcl()))
            && (this.geteSymArmy() == null ? other.geteSymArmy() == null : this.geteSymArmy().equals(other.geteSymArmy()))
            && (this.geteSymEcho() == null ? other.geteSymEcho() == null : this.geteSymEcho().equals(other.geteSymEcho()))
            && (this.geteSymEnterprise() == null ? other.geteSymEnterprise() == null : this.geteSymEnterprise().equals(other.geteSymEnterprise()))
            && (this.geteSymOutserv() == null ? other.geteSymOutserv() == null : this.geteSymOutserv().equals(other.geteSymOutserv()))
            && (this.geteSymOther() == null ? other.geteSymOther() == null : this.geteSymOther().equals(other.geteSymOther()))
            && (this.geteOutservCo() == null ? other.geteOutservCo() == null : this.geteOutservCo().equals(other.geteOutservCo()))
            && (this.getcSealId() == null ? other.getcSealId() == null : this.getcSealId().equals(other.getcSealId()))
            && (this.getcCanvasId() == null ? other.getcCanvasId() == null : this.getcCanvasId().equals(other.getcCanvasId()))
            && (this.getiGroId() == null ? other.getiGroId() == null : this.getiGroId().equals(other.getiGroId()))
            && (this.getiLineId() == null ? other.getiLineId() == null : this.getiLineId().equals(other.getiLineId()))
            && (this.getcLineNa() == null ? other.getcLineNa() == null : this.getcLineNa().equals(other.getcLineNa()))
            && (this.getbCarChara() == null ? other.getbCarChara() == null : this.getbCarChara().equals(other.getbCarChara()))
            && (this.geteCarChara() == null ? other.geteCarChara() == null : this.geteCarChara().equals(other.geteCarChara()))
            && (this.getcTraNumArr() == null ? other.getcTraNumArr() == null : this.getcTraNumArr().equals(other.getcTraNumArr()))
            && (this.getdTraArr() == null ? other.getdTraArr() == null : this.getdTraArr().equals(other.getdTraArr()))
            && (this.getcInvCo() == null ? other.getcInvCo() == null : this.getcInvCo().equals(other.getcInvCo()))
            && (this.getcCanvasId1() == null ? other.getcCanvasId1() == null : this.getcCanvasId1().equals(other.getcCanvasId1()))
            && (this.getcCanvasId2() == null ? other.getcCanvasId2() == null : this.getcCanvasId2().equals(other.getcCanvasId2()))
            && (this.getiGroIdStat() == null ? other.getiGroIdStat() == null : this.getiGroIdStat().equals(other.getiGroIdStat()))
            && (this.getcConsignor() == null ? other.getcConsignor() == null : this.getcConsignor().equals(other.getcConsignor()))
            && (this.getbCarState() == null ? other.getbCarState() == null : this.getbCarState().equals(other.getbCarState()))
            && (this.getdLineIn() == null ? other.getdLineIn() == null : this.getdLineIn().equals(other.getdLineIn()))
            && (this.getiGoodsNum() == null ? other.getiGoodsNum() == null : this.getiGoodsNum().equals(other.getiGoodsNum()))
            && (this.getdWork() == null ? other.getdWork() == null : this.getdWork().equals(other.getdWork()))
            && (this.getdWorkBegin() == null ? other.getdWorkBegin() == null : this.getdWorkBegin().equals(other.getdWorkBegin()))
            && (this.getdLineOut() == null ? other.getdLineOut() == null : this.getdLineOut().equals(other.getdLineOut()))
            && (this.getfRatekmsUnload() == null ? other.getfRatekmsUnload() == null : this.getfRatekmsUnload().equals(other.getfRatekmsUnload()))
            && (this.getfRatekmsLoad() == null ? other.getfRatekmsLoad() == null : this.getfRatekmsLoad().equals(other.getfRatekmsLoad()))
            && (this.getiLimitSpeed() == null ? other.getiLimitSpeed() == null : this.getiLimitSpeed().equals(other.getiLimitSpeed()))
            && (this.getcStaCoRouteComp() == null ? other.getcStaCoRouteComp() == null : this.getcStaCoRouteComp().equals(other.getcStaCoRouteComp()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getiCarId() == null) ? 0 : getiCarId().hashCode());
        result = prime * result + ((getiVersionNo() == null) ? 0 : getiVersionNo().hashCode());
        result = prime * result + ((getcCarCo() == null) ? 0 : getcCarCo().hashCode());
        result = prime * result + ((getiConsIdArr() == null) ? 0 : getiConsIdArr().hashCode());
        result = prime * result + ((getiConsIdDep() == null) ? 0 : getiConsIdDep().hashCode());
        result = prime * result + ((getiConsNoArr() == null) ? 0 : getiConsNoArr().hashCode());
        result = prime * result + ((getiConsNoDep() == null) ? 0 : getiConsNoDep().hashCode());
        result = prime * result + ((getcSuitType() == null) ? 0 : getcSuitType().hashCode());
        result = prime * result + ((getcCarType() == null) ? 0 : getcCarType().hashCode());
        result = prime * result + ((getcCarTypeForsh() == null) ? 0 : getcCarTypeForsh().hashCode());
        result = prime * result + ((geteCarType() == null) ? 0 : geteCarType().hashCode());
        result = prime * result + ((geteOilType() == null) ? 0 : geteOilType().hashCode());
        result = prime * result + ((getfWeghOwn() == null) ? 0 : getfWeghOwn().hashCode());
        result = prime * result + ((getfLen() == null) ? 0 : getfLen().hashCode());
        result = prime * result + ((getfWeghLoad() == null) ? 0 : getfWeghLoad().hashCode());
        result = prime * result + ((getcStaCoArr() == null) ? 0 : getcStaCoArr().hashCode());
        result = prime * result + ((getcStaNaArr() == null) ? 0 : getcStaNaArr().hashCode());
        result = prime * result + ((getcBurCoArr() == null) ? 0 : getcBurCoArr().hashCode());
        result = prime * result + ((getiSburCoArr() == null) ? 0 : getiSburCoArr().hashCode());
        result = prime * result + ((getcStaCoEnd() == null) ? 0 : getcStaCoEnd().hashCode());
        result = prime * result + ((getcStaNaEnd() == null) ? 0 : getcStaNaEnd().hashCode());
        result = prime * result + ((getcGoodsNa() == null) ? 0 : getcGoodsNa().hashCode());
        result = prime * result + ((getcConsignee() == null) ? 0 : getcConsignee().hashCode());
        result = prime * result + ((getcStaCoDep() == null) ? 0 : getcStaCoDep().hashCode());
        result = prime * result + ((getcStaNaDep() == null) ? 0 : getcStaNaDep().hashCode());
        result = prime * result + ((getiCanvasNum() == null) ? 0 : getiCanvasNum().hashCode());
        result = prime * result + ((geteSymBadcar() == null) ? 0 : geteSymBadcar().hashCode());
        result = prime * result + ((getcRemark() == null) ? 0 : getcRemark().hashCode());
        result = prime * result + ((geteSymGro() == null) ? 0 : geteSymGro().hashCode());
        result = prime * result + ((geteSymWegh() == null) ? 0 : geteSymWegh().hashCode());
        result = prime * result + ((geteSymLcl() == null) ? 0 : geteSymLcl().hashCode());
        result = prime * result + ((geteSymArmy() == null) ? 0 : geteSymArmy().hashCode());
        result = prime * result + ((geteSymEcho() == null) ? 0 : geteSymEcho().hashCode());
        result = prime * result + ((geteSymEnterprise() == null) ? 0 : geteSymEnterprise().hashCode());
        result = prime * result + ((geteSymOutserv() == null) ? 0 : geteSymOutserv().hashCode());
        result = prime * result + ((geteSymOther() == null) ? 0 : geteSymOther().hashCode());
        result = prime * result + ((geteOutservCo() == null) ? 0 : geteOutservCo().hashCode());
        result = prime * result + ((getcSealId() == null) ? 0 : getcSealId().hashCode());
        result = prime * result + ((getcCanvasId() == null) ? 0 : getcCanvasId().hashCode());
        result = prime * result + ((getiGroId() == null) ? 0 : getiGroId().hashCode());
        result = prime * result + ((getiLineId() == null) ? 0 : getiLineId().hashCode());
        result = prime * result + ((getcLineNa() == null) ? 0 : getcLineNa().hashCode());
        result = prime * result + ((getbCarChara() == null) ? 0 : getbCarChara().hashCode());
        result = prime * result + ((geteCarChara() == null) ? 0 : geteCarChara().hashCode());
        result = prime * result + ((getcTraNumArr() == null) ? 0 : getcTraNumArr().hashCode());
        result = prime * result + ((getdTraArr() == null) ? 0 : getdTraArr().hashCode());
        result = prime * result + ((getcInvCo() == null) ? 0 : getcInvCo().hashCode());
        result = prime * result + ((getcCanvasId1() == null) ? 0 : getcCanvasId1().hashCode());
        result = prime * result + ((getcCanvasId2() == null) ? 0 : getcCanvasId2().hashCode());
        result = prime * result + ((getiGroIdStat() == null) ? 0 : getiGroIdStat().hashCode());
        result = prime * result + ((getcConsignor() == null) ? 0 : getcConsignor().hashCode());
        result = prime * result + ((getbCarState() == null) ? 0 : getbCarState().hashCode());
        result = prime * result + ((getdLineIn() == null) ? 0 : getdLineIn().hashCode());
        result = prime * result + ((getiGoodsNum() == null) ? 0 : getiGoodsNum().hashCode());
        result = prime * result + ((getdWork() == null) ? 0 : getdWork().hashCode());
        result = prime * result + ((getdWorkBegin() == null) ? 0 : getdWorkBegin().hashCode());
        result = prime * result + ((getdLineOut() == null) ? 0 : getdLineOut().hashCode());
        result = prime * result + ((getfRatekmsUnload() == null) ? 0 : getfRatekmsUnload().hashCode());
        result = prime * result + ((getfRatekmsLoad() == null) ? 0 : getfRatekmsLoad().hashCode());
        result = prime * result + ((getiLimitSpeed() == null) ? 0 : getiLimitSpeed().hashCode());
        result = prime * result + ((getcStaCoRouteComp() == null) ? 0 : getcStaCoRouteComp().hashCode());
        return result;
    }
}