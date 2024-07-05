package com.mrlonis.example.controller;

import com.mrlonis.example.exception.NotAuthenticatedException;
import java.util.Collections;
import java.util.Map;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        if (principal == null) {
            throw new NotAuthenticatedException();
        }
        return Collections.singletonMap("name", principal.getAttribute("name"));
    }
}
