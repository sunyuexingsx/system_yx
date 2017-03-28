package com.hengaiw.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @description：部门
 * @author：zhixuan.wang
 * @date：2015/10/1 14:51
 */
public class Organization implements Serializable {

    private static final long serialVersionUID = 1282186495210887307L;

    private Long id;

    private String name;

    

    @JsonProperty("iconCls")
    private String icon;

    private Long pid;

    private String res;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Date createdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getSeq() {
        return res;
    }

    public void setSeq(String res) {
        this.res = res;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", pid=" + pid +
                ", res=" + res +
                ", createdate=" + createdate +
                '}';
    }
}