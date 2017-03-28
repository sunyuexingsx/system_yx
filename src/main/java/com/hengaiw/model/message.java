package com.hengaiw.model;

import java.io.Serializable;

public class message implements Serializable {
    private Integer messageId;

    private Integer fromMemberId;

    private String toOrgId;

    private String toMemberId;

    private String messageTitle;

    private String messageBody;

    private String messageTime;

    private String messageUpdateTime;

    private Boolean messageOpen;

    private Boolean messageState;

    private Boolean messageType;

    private String readMemberId;

    private String delMemberId;

    private Boolean messageIsmore;

    private String fromMemberName;

    private String toMemberName;

    private static final long serialVersionUID = 1L;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getFromMemberId() {
        return fromMemberId;
    }

    public void setFromMemberId(Integer fromMemberId) {
        this.fromMemberId = fromMemberId;
    }

    public String getToOrgId() {
        return toOrgId;
    }

    public void setToOrgId(String toOrgId) {
        this.toOrgId = toOrgId == null ? null : toOrgId.trim();
    }

    public String getToMemberId() {
        return toMemberId;
    }

    public void setToMemberId(String toMemberId) {
        this.toMemberId = toMemberId == null ? null : toMemberId.trim();
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle == null ? null : messageTitle.trim();
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody == null ? null : messageBody.trim();
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime == null ? null : messageTime.trim();
    }

    public String getMessageUpdateTime() {
        return messageUpdateTime;
    }

    public void setMessageUpdateTime(String messageUpdateTime) {
        this.messageUpdateTime = messageUpdateTime == null ? null : messageUpdateTime.trim();
    }

    public Boolean getMessageOpen() {
        return messageOpen;
    }

    public void setMessageOpen(Boolean messageOpen) {
        this.messageOpen = messageOpen;
    }

    public Boolean getMessageState() {
        return messageState;
    }

    public void setMessageState(Boolean messageState) {
        this.messageState = messageState;
    }

    public Boolean getMessageType() {
        return messageType;
    }

    public void setMessageType(Boolean messageType) {
        this.messageType = messageType;
    }

    public String getReadMemberId() {
        return readMemberId;
    }

    public void setReadMemberId(String readMemberId) {
        this.readMemberId = readMemberId == null ? null : readMemberId.trim();
    }

    public String getDelMemberId() {
        return delMemberId;
    }

    public void setDelMemberId(String delMemberId) {
        this.delMemberId = delMemberId == null ? null : delMemberId.trim();
    }

    public Boolean getMessageIsmore() {
        return messageIsmore;
    }

    public void setMessageIsmore(Boolean messageIsmore) {
        this.messageIsmore = messageIsmore;
    }

    public String getFromMemberName() {
        return fromMemberName;
    }

    public void setFromMemberName(String fromMemberName) {
        this.fromMemberName = fromMemberName == null ? null : fromMemberName.trim();
    }

    public String getToMemberName() {
        return toMemberName;
    }

    public void setToMemberName(String toMemberName) {
        this.toMemberName = toMemberName == null ? null : toMemberName.trim();
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
        message other = (message) that;
        return (this.getMessageId() == null ? other.getMessageId() == null : this.getMessageId().equals(other.getMessageId()))
            && (this.getFromMemberId() == null ? other.getFromMemberId() == null : this.getFromMemberId().equals(other.getFromMemberId()))
            && (this.getToOrgId() == null ? other.getToOrgId() == null : this.getToOrgId().equals(other.getToOrgId()))
            && (this.getToMemberId() == null ? other.getToMemberId() == null : this.getToMemberId().equals(other.getToMemberId()))
            && (this.getMessageTitle() == null ? other.getMessageTitle() == null : this.getMessageTitle().equals(other.getMessageTitle()))
            && (this.getMessageBody() == null ? other.getMessageBody() == null : this.getMessageBody().equals(other.getMessageBody()))
            && (this.getMessageTime() == null ? other.getMessageTime() == null : this.getMessageTime().equals(other.getMessageTime()))
            && (this.getMessageUpdateTime() == null ? other.getMessageUpdateTime() == null : this.getMessageUpdateTime().equals(other.getMessageUpdateTime()))
            && (this.getMessageOpen() == null ? other.getMessageOpen() == null : this.getMessageOpen().equals(other.getMessageOpen()))
            && (this.getMessageState() == null ? other.getMessageState() == null : this.getMessageState().equals(other.getMessageState()))
            && (this.getMessageType() == null ? other.getMessageType() == null : this.getMessageType().equals(other.getMessageType()))
            && (this.getReadMemberId() == null ? other.getReadMemberId() == null : this.getReadMemberId().equals(other.getReadMemberId()))
            && (this.getDelMemberId() == null ? other.getDelMemberId() == null : this.getDelMemberId().equals(other.getDelMemberId()))
            && (this.getMessageIsmore() == null ? other.getMessageIsmore() == null : this.getMessageIsmore().equals(other.getMessageIsmore()))
            && (this.getFromMemberName() == null ? other.getFromMemberName() == null : this.getFromMemberName().equals(other.getFromMemberName()))
            && (this.getToMemberName() == null ? other.getToMemberName() == null : this.getToMemberName().equals(other.getToMemberName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        result = prime * result + ((getFromMemberId() == null) ? 0 : getFromMemberId().hashCode());
        result = prime * result + ((getToOrgId() == null) ? 0 : getToOrgId().hashCode());
        result = prime * result + ((getToMemberId() == null) ? 0 : getToMemberId().hashCode());
        result = prime * result + ((getMessageTitle() == null) ? 0 : getMessageTitle().hashCode());
        result = prime * result + ((getMessageBody() == null) ? 0 : getMessageBody().hashCode());
        result = prime * result + ((getMessageTime() == null) ? 0 : getMessageTime().hashCode());
        result = prime * result + ((getMessageUpdateTime() == null) ? 0 : getMessageUpdateTime().hashCode());
        result = prime * result + ((getMessageOpen() == null) ? 0 : getMessageOpen().hashCode());
        result = prime * result + ((getMessageState() == null) ? 0 : getMessageState().hashCode());
        result = prime * result + ((getMessageType() == null) ? 0 : getMessageType().hashCode());
        result = prime * result + ((getReadMemberId() == null) ? 0 : getReadMemberId().hashCode());
        result = prime * result + ((getDelMemberId() == null) ? 0 : getDelMemberId().hashCode());
        result = prime * result + ((getMessageIsmore() == null) ? 0 : getMessageIsmore().hashCode());
        result = prime * result + ((getFromMemberName() == null) ? 0 : getFromMemberName().hashCode());
        result = prime * result + ((getToMemberName() == null) ? 0 : getToMemberName().hashCode());
        return result;
    }
}