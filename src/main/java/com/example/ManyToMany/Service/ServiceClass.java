package com.example.ManyToMany.Service;

import com.example.ManyToMany.Domain.Country;
import com.example.ManyToMany.Persistence.CountryRepository;
import com.example.ManyToMany.Persistence.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ServiceClass {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private LanguageRepository languageRepository;

    public Set<Country> displayAllCountries(){
        return (Set<Country>) countryRepository.findAll();
    }
}
