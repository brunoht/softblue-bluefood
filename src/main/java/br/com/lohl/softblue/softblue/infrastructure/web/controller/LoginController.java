package br.com.lohl.softblue.softblue.infrastructure.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    
    @GetMapping(path = {"/login", "/"})
    public String login() {
        return "login";
    }
}
