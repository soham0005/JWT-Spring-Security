package com.jwtsecurity.dto;

public class RefreshToken {

    private String token;

    public RefreshToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
