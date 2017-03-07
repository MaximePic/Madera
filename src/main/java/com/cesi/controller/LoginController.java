package com.cesi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller de la page de login
 */
@Controller
public class LoginController {
    @RequestMapping(value="/login")
    public String login() {
        return "login";
    }
}
