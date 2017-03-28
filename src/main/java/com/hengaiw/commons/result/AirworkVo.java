package com.hengaiw.commons.result;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @description：QcworkVo
 * @author：hengaiw.com
 * @date：2016/09/15
 */
public class AirworkVo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	private Long I_CAR_ID;//车辆ID
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date D_TRA_ARR;//到达时间

    private String C_TRA_NUM_ARR;//到达车次
    
    private Long I_LINE_ID;//到达股道
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date  AirworkEndtime;//作业结束时间
    
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date AirworkBegintime;//作业开始时间

    private Integer AirworkStatus;
	private String C_RANGE_NA;
	/**
	 * @return the d_TRA_ARR
	 */
	public Date getD_TRA_ARR() {
		return D_TRA_ARR;
	}

	/**
	 * @param d_TRA_ARR the d_TRA_ARR to set
	 */
	public void setD_TRA_ARR(Date d_TRA_ARR) {
		D_TRA_ARR = d_TRA_ARR;
	}

	/**
	 * @return the c_TRA_NUM_ARR
	 */
	public String getC_TRA_NUM_ARR() {
		return C_TRA_NUM_ARR;
	}

	/**
	 * @param c_TRA_NUM_ARR the c_TRA_NUM_ARR to set
	 */
	public void setC_TRA_NUM_ARR(String c_TRA_NUM_ARR) {
		C_TRA_NUM_ARR = c_TRA_NUM_ARR;
	}

	/**
	 * @return the i_LINE_ID
	 */
	public Long getI_LINE_ID() {
		return I_LINE_ID;
	}

	/**
	 * @param i_LINE_ID the i_LINE_ID to set
	 */
	public void setI_LINE_ID(Long i_LINE_ID) {
		I_LINE_ID = i_LINE_ID;
	}

	/**
	 * @return the d_WORK
	 */
	public Date getAirworkBegintime() {
		return AirworkBegintime;
	}

	/**
	 * @param d_WORK the d_WORK to set
	 */
	public void setAirworkBegintime(Date airworkBegintime) {
		AirworkBegintime = airworkBegintime;
	}

	/**
	 * @return the d_WORK_BEGIN
	 */
	public Date getAirworkEndtime() {
		return AirworkEndtime;
	}

	/**
	 * @param d_WORK_BEGIN the d_WORK_BEGIN to set
	 */
	public void setAirworkEndtime(Date airworkEndtime) {
		AirworkEndtime = airworkEndtime;
	}

	/**
	 * @return the i_CAR_ID
	 */
	public Long getI_CAR_ID() {
		return I_CAR_ID;
	}

	/**
	 * @param i_CAR_ID the i_CAR_ID to set
	 */
	public void setI_CAR_ID(Long i_CAR_ID) {
		I_CAR_ID = i_CAR_ID;
	}

	/**
	 * @return the c_RANGE_NA
	 */
	public String getC_RANGE_NA() {
		return C_RANGE_NA;
	}

	/**
	 * @param c_RANGE_NA the c_RANGE_NA to set
	 */
	public void setC_RANGE_NA(String c_RANGE_NA) {
		C_RANGE_NA = c_RANGE_NA;
	}

	/**
	 * @return the qCWORK_STATUS
	 */
	public Integer getAIRWORK_STATUS() {
		return AirworkStatus;
	}

	/**
	 * @param qCWORK_STATUS the qCWORK_STATUS to set
	 */
	public void setAirworkStatus(Integer airworkStatus) {
		AirworkStatus = airworkStatus;
	}
    
    
}