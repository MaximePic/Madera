package com.cesi.controller;

import com.cesi.entity.Commercial;
import com.cesi.entity.Projet;
import com.cesi.repository.CommercialRepository;
import com.cesi.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private CommercialRepository commercialRepository;

    @Autowired
    private ProjetRepository projetRepository;

    private String commercialConnected;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() throws IOException {
        commercialConnected = SecurityContextHolder.getContext().getAuthentication().getName();
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }


    /**
     * Méthode permettant de récupérer la liste des projets su commercial qui se connecte à l'application
     * @return
     */
    @RequestMapping(value = "/api/getCommercialProjectList", method = RequestMethod.GET)
    public List<Projet> getCommercialProjectList(){
        Commercial commercial = commercialRepository.findByLogin(commercialConnected);
        Long id = commercial.getId();
        List<Projet> commercialProjectList = projetRepository.findByCommercialId(id);
        return  commercialProjectList;
    }

    /**
     * Méthode permettant de récupérer l'utilisateur connecté
     * @return
     */
    @RequestMapping(value = "/api/getUserConnected", method = RequestMethod.GET)
    public String getUserConnected(){
        return commercialConnected;
    }
}