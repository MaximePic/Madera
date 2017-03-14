package com.cesi.repository;

import com.cesi.entity.Devis;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by maxime on 14/03/17.
 */
@Repository
public interface DevisRepository extends CrudRepository<Devis, Long>{
    @Query("SELECT d.nom , d.dateCreation, d.etat, d.id FROM Devis d where d.projetId = :id")
    List<Devis> findByProjetId(@Param("id")Long id);
}
