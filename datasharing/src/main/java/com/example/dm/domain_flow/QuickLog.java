package com.example.dm.domain_flow;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * Created by yuan zhao  on 08/10/2015.
 */

@Entity
@Table(name = "Quick_Log")

public class QuickLog extends BaseDomain {



    private LocalDateTime beginDateTime;
    private LocalDateTime endDateTime;
    private String no;

            ;
    private long duration;
    private Long idLong;

    @Column( columnDefinition = "text(1000)")
    private String content;
    @Column( columnDefinition = "text(3000)")
    private String reqContent;
    private String accessKey;
    private String clientId;
    private String status;
    private String errorContent;
    private String requestURI;
    private String remoteAddr;


    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public LocalDateTime getBeginDateTime() {
        return beginDateTime;
    }

    public void setBeginDateTime(LocalDateTime beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getIdLong() {
        return idLong;
    }

    public void setIdLong(Long idLong) {
        this.idLong = idLong;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setErrorContent(String errorContent) {

        this.errorContent = errorContent;
    }

    public String getErrorContent() {
        return errorContent;
    }

    public void setRequestURI(String requestURI) {
        this.requestURI = requestURI;
    }

    public String getRequestURI() {
        return requestURI;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }
}
