package com.praveen.springsecurityjdbc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeResource {
    @GetMapping("/")
    public String home() {
        return "<h1>Welcome</h1>";
    }

    @GetMapping("/admin")
    public String admin(Principal principal) {
        return "<h1>Welcome Admin</h1> <br> "+"<h5>"+ principal + "</h5>";
    }

    @GetMapping("/user")
    public String user(Principal principal) {
        return "<h1>Welcome User</h1> <br> "+ "<h5>"+ principal + "</h5>";
    }

    @GetMapping("/principal")
    public Principal retrievePrincipal(Principal principal) {
        return principal;
    }
}
