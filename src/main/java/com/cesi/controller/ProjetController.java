package com.cesi.controller;

import com.cesi.entity.Devis;
import com.cesi.repository.DevisRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Controller du Projet
 */
@RestController
public class ProjetController {

    @Autowired
    private DevisRepository devisRepository;

    private Long projetId;

    /**
     * Redirection sur la page de détail de projet (projet.html)
     * @param id
     * @param httpServletRequest
     * @return
     */
    @RequestMapping(value = "/projet/{id}", method = RequestMethod.GET)
    public ModelAndView showProject(@PathVariable ("id") Long id, HttpServletRequest httpServletRequest){
        projetId = id;
        ModelAndView mav = new ModelAndView("projet");
        return mav;
    }

    @RequestMapping(value = "/api/getDevisList", method = RequestMethod.GET)
    public List<Devis> getDevisList(){
        List<Devis> devisList = devisRepository.findByProjetId(projetId);
        return devisList;
    }

}
