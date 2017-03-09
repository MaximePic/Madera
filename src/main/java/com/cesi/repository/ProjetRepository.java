package com.cesi.repository;

import com.cesi.entity.Projet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProjetRepository extends CrudRepository<Projet, Long> {
    List<Projet> findByCommercialId(Long id);
}
