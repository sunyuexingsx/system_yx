package com.hengaiw.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：用户
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
public class User implements Serializable {

    private static final long serialVersionUID = 6700813629656881143L;

    private Long id;

    private String loginname;

    private String name;

    private String password;

    private String cardNo;
    
    private Integer usertype;

    private Integer status;

    private Integer organizationId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdate;

    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
    public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", loginname='" + loginname + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", cardNo=" + cardNo +
                
                ", status=" + status +
                ", organizationId=" + organizationId +
                ", createdate=" + createdate +
                ", phone='" + phone + '\'' +
                '}';
    }

	/**
	 * @return the usertype
	 */
	public Integer getUsertype() {
		return usertype;
	}

	/**
	 * @param usertype the usertype to set
	 */
	public void setUsertype(Integer usertype) {
		this.usertype = usertype;
	}

	
}