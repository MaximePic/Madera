package com.cesi.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(ModelMap model) {
        String name = getUserConnected(model);
        return "index";
    }


    /**
     * Méthode permettant de récupérer l'utilisateur connecté
     * @param model
     * @return
     */
    private String getUserConnected(ModelMap model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        model.addAttribute("userConnected", name);
        System.out.println("user connected: " + name);
        return name;
    }

}