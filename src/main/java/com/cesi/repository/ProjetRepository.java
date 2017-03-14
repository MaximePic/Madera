package com.cesi.repository;

import com.cesi.entity.Projet;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProjetRepository extends CrudRepository<Projet, Long> {
    @Query("SELECT p.nom , p.dateCreation, p.commercialId, p.clientId, p.id  FROM Projet p where p.commercialId = :id")
    List<Projet> findByCommercialId(@Param("id")Long id);
}
