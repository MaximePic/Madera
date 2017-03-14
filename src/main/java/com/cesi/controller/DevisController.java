package com.cesi.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller du Devis
 */
@RestController
public class DevisController {

    private Long devisId;

    /**
     * Redirection sur la page de détail de devis (devis.html)
     * @param id
     * @return
     */
    @RequestMapping(value = "/devis/{id}", method = RequestMethod.GET)
    public ModelAndView showDevis(@PathVariable("id") Long id){
        devisId = id;
        ModelAndView mav = new ModelAndView("devis");
        return mav;
    }
}
