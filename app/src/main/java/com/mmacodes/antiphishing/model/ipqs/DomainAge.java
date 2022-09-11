package com.mmacodes.antiphishing.model.ipqs;

import java.util.Date;

public class DomainAge {
    private String human;
    private Long timestamp;
    private Date iso;

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Date getIso() {
        return iso;
    }

    public void setIso(Date iso) {
        this.iso = iso;
    }
}
