package com.cesi.controller;

import com.cesi.entity.Commercial;
import com.cesi.entity.Projet;
import com.cesi.repository.CommercialRepository;
import com.cesi.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CommercialRepository commercialRepository;

    @Autowired
    private ProjetRepository projetRepository;

    @RequestMapping(value = "/")
    public String index(ModelMap model) {
        String name = getUserConnected(model);
        System.out.println(getCommercialProjectList(name));
        return "index";
    }


    public List<Projet> getCommercialProjectList(String login){
        Commercial commercial = commercialRepository.findByLogin(login);
        Long id = commercial.getId();
        List<Projet> commercialProjectList = projetRepository.findByCommercialId(id);
        return  commercialProjectList;
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