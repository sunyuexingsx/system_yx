package com.hengaiw.commons.result;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @description：QcworkVo
 * @author：hengaiw.com
 * @date：2016/09/15
 */
public class QcworkVo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long iTraId;//列车键
	
	private String cTraNum;//车次

	private Integer eSymArrdep;//到发标志
	
	private Long iConsId;//确报ID
	
	private Integer eConsState;//报文状态
	
	private Long bSymCheck;//核准比特码
	
	private Integer ePlState;//计划执行状态
	
	private Integer iLineIdArrdep;//到发线
	
	private Date dFaNotify;//实际报点时间

	private String dFaNotify_begin;//实际报点开始时间
	
	private String dFaNotify_end;//实际报点结束时间
	
	private Date dTraTime;//计划时间

	private String cAttention;//重点注意事项

    private Integer qcworkStatus;

    private Integer qcworkUser;
    
    private String qcworkUserName;

    private Date qcworkBegintime;

    private Date qcworkEndtime;

    private Integer qcworkSeq;

    private Date qcworkUpdatetime;

	/**
	 * @return the iTraId
	 */
	public Long getiTraId() {
		return iTraId;
	}

	/**
	 * @param iTraId the iTraId to set
	 */
	public void setiTraId(Long iTraId) {
		this.iTraId = iTraId;
	}

	/**
	 * @return the qcworkStatus
	 */
	public Integer getQcworkStatus() {
		return qcworkStatus;
	}

	/**
	 * @param qcworkStatus the qcworkStatus to set
	 */
	public void setQcworkStatus(Integer qcworkStatus) {
		this.qcworkStatus = qcworkStatus;
	}

	/**
	 * @return the qcworkUser
	 */
	public Integer getQcworkUser() {
		return qcworkUser;
	}

	/**
	 * @param qcworkUser the qcworkUser to set
	 */
	public void setQcworkUser(Integer qcworkUser) {
		this.qcworkUser = qcworkUser;
	}

	/**
	 * @return the qcworkBegintime
	 */
	public Date getQcworkBegintime() {
		return qcworkBegintime;
	}

	/**
	 * @param qcworkBegintime the qcworkBegintime to set
	 */
	public void setQcworkBegintime(Date qcworkBegintime) {
		this.qcworkBegintime = qcworkBegintime;
	}

	/**
	 * @return the qcworkEndtime
	 */
	public Date getQcworkEndtime() {
		return qcworkEndtime;
	}

	/**
	 * @param qcworkEndtime the qcworkEndtime to set
	 */
	public void setQcworkEndtime(Date qcworkEndtime) {
		this.qcworkEndtime = qcworkEndtime;
	}

	/**
	 * @return the qcworkSeq
	 */
	public Integer getQcworkSeq() {
		return qcworkSeq;
	}

	/**
	 * @param qcworkSeq the qcworkSeq to set
	 */
	public void setQcworkSeq(Integer qcworkSeq) {
		this.qcworkSeq = qcworkSeq;
	}

	/**
	 * @return the qcworkUpdatetime
	 */
	public Date getQcworkUpdatetime() {
		return qcworkUpdatetime;
	}

	/**
	 * @param qcworkUpdatetime the qcworkUpdatetime to set
	 */
	public void setQcworkUpdatetime(Date qcworkUpdatetime) {
		this.qcworkUpdatetime = qcworkUpdatetime;
	}

	/**
	 * @return the cTraNum
	 */
	public String getcTraNum() {
		return cTraNum;
	}

	/**
	 * @param cTraNum the cTraNum to set
	 */
	public void setcTraNum(String cTraNum) {
		this.cTraNum = cTraNum;
	}

	/**
	 * @return the eSymArrdep
	 */
	public Integer geteSymArrdep() {
		return eSymArrdep;
	}

	/**
	 * @param eSymArrdep the eSymArrdep to set
	 */
	public void seteSymArrdep(Integer eSymArrdep) {
		this.eSymArrdep = eSymArrdep;
	}

	/**
	 * @return the iConsId
	 */
	public Long getiConsId() {
		return iConsId;
	}

	/**
	 * @param iConsId the iConsId to set
	 */
	public void setiConsId(Long iConsId) {
		this.iConsId = iConsId;
	}

	/**
	 * @return the eConsState
	 */
	public Integer geteConsState() {
		return eConsState;
	}

	/**
	 * @param eConsState the eConsState to set
	 */
	public void seteConsState(Integer eConsState) {
		this.eConsState = eConsState;
	}

	/**
	 * @return the bSymCheck
	 */
	public Long getbSymCheck() {
		return bSymCheck;
	}

	/**
	 * @param bSymCheck the bSymCheck to set
	 */
	public void setbSymCheck(Long bSymCheck) {
		this.bSymCheck = bSymCheck;
	}

	/**
	 * @return the ePlState
	 */
	public Integer getePlState() {
		return ePlState;
	}

	/**
	 * @param ePlState the ePlState to set
	 */
	public void setePlState(Integer ePlState) {
		this.ePlState = ePlState;
	}

	/**
	 * @return the dFaNotify
	 */
	public Date getdFaNotify() {
		return dFaNotify;
	}

	/**
	 * @param dFaNotify the dFaNotify to set
	 */
	public void setdFaNotify(Date dFaNotify) {
		this.dFaNotify = dFaNotify;
	}

	/**
	 * @return the cAttention
	 */
	public String getcAttention() {
		return cAttention;
	}

	/**
	 * @param cAttention the cAttention to set
	 */
	public void setcAttention(String cAttention) {
		this.cAttention = cAttention;
	}

	/**
	 * @return the dTraTime
	 */
	public Date getdTraTime() {
		return dTraTime;
	}

	/**
	 * @param dTraTime the dTraTime to set
	 */
	public void setdTraTime(Date dTraTime) {
		this.dTraTime = dTraTime;
	}

	/**
	 * @return the iLineIdArrdep
	 */
	public Integer getiLineIdArrdep() {
		return iLineIdArrdep;
	}

	/**
	 * @param iLineIdArrdep the iLineIdArrdep to set
	 */
	public void setiLineIdArrdep(Integer iLineIdArrdep) {
		this.iLineIdArrdep = iLineIdArrdep;
	}

	/**
	 * @return the dFaNotify_begin
	 */
	public String getdFaNotify_begin() {
		return dFaNotify_begin;
	}

	/**
	 * @param dFaNotify_begin the dFaNotify_begin to set
	 */
	public void setdFaNotify_begin(String dFaNotify_begin) {
		this.dFaNotify_begin = dFaNotify_begin;
	}

	/**
	 * @return the dFaNotify_end
	 */
	public String getdFaNotify_end() {
		return dFaNotify_end;
	}

	/**
	 * @param dFaNotify_end the dFaNotify_end to set
	 */
	public void setdFaNotify_end(String dFaNotify_end) {
		this.dFaNotify_end = dFaNotify_end;
	}

	/**
	 * @return the qcworkUserName
	 */
	public String getQcworkUserName() {
		return qcworkUserName;
	}

	/**
	 * @param qcworkUserName the qcworkUserName to set
	 */
	public void setQcworkUserName(String qcworkUserName) {
		this.qcworkUserName = qcworkUserName;
	}
	
	
    
    
}