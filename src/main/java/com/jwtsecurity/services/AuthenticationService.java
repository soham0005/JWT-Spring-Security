package com.jwtsecurity.services;

import com.jwtsecurity.dto.JwtAuthenticationResponse;
import com.jwtsecurity.dto.RefreshTokenRequest;
import com.jwtsecurity.dto.SigninRequest;
import com.jwtsecurity.model.User;
import org.springframework.stereotype.Service;


public interface AuthenticationService {

    User signup(User userReq);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}