package com.cesi;

import com.cesi.entity.Commercial;
import com.cesi.repository.CommercialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseLoader implements CommandLineRunner {

    private final CommercialRepository repository;

    @Autowired
    public DatabaseLoader(CommercialRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Commercial("Frodo", "Baggins", "ring bearer"));
    }
}