package com.cesi.controller;

import com.cesi.entity.Devis;
import com.cesi.repository.DevisRepository;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller du Devis
 */
@RestController
public class DevisController {

    @Autowired
    private DevisRepository devisRepository;

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

    @RequestMapping(value = "/api/getDevisDetails", method = RequestMethod.GET)
    public Devis getDevisDetails(){
        Devis devis = devisRepository.findById(devisId);
        return devis;
    }

    @RequestMapping(value = "/api/saveDevisDetails", method = RequestMethod.POST)
    public void saveDevisDetails(@RequestBody Devis devis){
        devisRepository.save(devis);
    }
}
