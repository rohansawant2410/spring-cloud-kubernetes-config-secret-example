package com.techprimers.kubernetes.springcloudkubernetesconfigexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/welcome")
@RestController
@RefreshScope
public class WelcomeController {

    @Value("${message}")
    private String message;

    @Value("${role}")
    private String role;

    @Value("${dbpass}")
    private String dbpass;

    @Value("${kfpass}")
    private String kfpass;

    @GetMapping
    public String welcome() {
        System.out.println(message+"-"+role);
        return message+"-"+role+"-"+kfpass+"-"+dbpass;
    }
}
