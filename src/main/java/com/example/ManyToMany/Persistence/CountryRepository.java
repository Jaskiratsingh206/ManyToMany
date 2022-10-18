package com.example.ManyToMany.Persistence;

import com.example.ManyToMany.Domain.Country;

import java.util.Set;

public interface CountryRepository extends ModelRepository<Country>{
    Set<Country> findAll();
}
