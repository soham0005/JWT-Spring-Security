package com.jwtsecurity.dto;

import org.springframework.stereotype.Component;

@Component
public class RefreshTokenRequest {
    private String token;

    public RefreshTokenRequest(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public RefreshTokenRequest() {
    }

    public void setToken(String token) {
        this.token = token;
    }
}
