package com.example.books.controller;

import com.example.books.response.ApiResponse;
import com.example.books.response.LoginResponse;
import com.example.books.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")  // 設定路徑為 api/auth
public class AuthController {

    AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // modify exception later
    // verify firebase Token and login or create user then login
    @PostMapping("/googleoauth")
    public ResponseEntity<ApiResponse<LoginResponse>> googleOAuth(@RequestBody String firebaseToken) {
        try {
            LoginResponse loginResponse = authService.googleOAuth(firebaseToken);

            return ResponseEntity.ok(ApiResponse.success(200, "Login Successfully !", loginResponse));
        } catch (Exception e) {
            System.out.println(e);
        }


        return null;
    }

}
