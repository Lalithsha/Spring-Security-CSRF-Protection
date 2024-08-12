package com.example.csrfdemov2.controller;

//package com.example.csrfdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;

@RestController
public class HomeController {

    @Autowired
    private CsrfTokenRepository csrfTokenRepository;

    @GetMapping("/")
    public String home() {
        return "Welcome to CSRF Demo";
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(CsrfToken token) {
        return token;
    }

    /*@PostMapping("/protected-action")
    public String protectedAction() {
        return "Action performed successfully!";
    }*/


    @PostMapping("/validate-csrf-token")
    public ResponseEntity<String> validateCsrfToken(HttpServletRequest request) {
        CsrfToken csrfToken = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
        if (csrfToken != null) {
            return ResponseEntity.ok("CSRF token is valid");
        } else {
            return ResponseEntity.badRequest().body("Invalid CSRF token");
        }
    }

}
