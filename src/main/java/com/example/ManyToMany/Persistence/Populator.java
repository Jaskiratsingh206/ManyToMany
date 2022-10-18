package com.example.ManyToMany.Persistence;

import com.example.ManyToMany.Domain.Country;
import com.example.ManyToMany.Domain.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public class Populator implements CommandLineRunner {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private LanguageRepository languageRepository;

    @Override
    public void run(String... args) throws Exception {
        var lang1 = languageRepository.save(new Language("English"));
        var lang2 = languageRepository.save(new Language("French"));


        var country1 = countryRepository.save(new Country("France", Set.of(lang1,lang2)));
        countryRepository.save(country1);
    }
    }
