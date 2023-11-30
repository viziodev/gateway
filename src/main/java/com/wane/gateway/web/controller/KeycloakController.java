package com.wane.gateway.web.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.security.Principal;
@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class KeycloakController {
    @GetMapping
    public void getUser(Principal principal) {
        System.out.println(principal.getName());
    }

}
