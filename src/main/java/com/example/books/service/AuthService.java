package com.example.books.service;

import com.example.books.response.LoginResponse;

public interface AuthService {

    LoginResponse googleOAuth (String idToken) throws Exception;
}
