package com.one.bo;

import com.one.domain.DevUser;

public class DevUserBo extends DevUser {
    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
}
