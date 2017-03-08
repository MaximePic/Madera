package com.cesi.repository;

import com.cesi.entity.Commercial;
import org.springframework.data.repository.CrudRepository;


public interface CommercialRepository extends CrudRepository<Commercial, Long> {
    Commercial findByNom(String prenom);
    Commercial findByLogin(String login);
}
