package com.one.bo;

import com.one.domain.DevUser;

public class DevUserBo {
    private String sessionId;
    private DevUser devUser;

    public DevUser getDevUser() {
        return devUser;
    }

    public void setDevUser(DevUser devUser) {
        this.devUser = devUser;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
