package com.example.ManyToMany.Controller;

import com.example.ManyToMany.Domain.Country;
import com.example.ManyToMany.Persistence.CountryRepository;
import com.example.ManyToMany.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/countryAndLanguages")
public class Controller {
@Autowired
private ServiceClass service;

    @Autowired
    private CountryRepository countryRepository;
     @GetMapping
    public Set<Country> displayAllCountries(){
        return service.displayAllCountries();

    }
}
