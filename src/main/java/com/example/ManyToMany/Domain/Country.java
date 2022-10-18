package com.example.ManyToMany.Domain;

import org.hibernate.annotations.GenerationTime;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false, name = "id")
    private Long countryId;

    Country() {
        super();
    }

    public Country(String name, Set<Language> languageSet) {
        this.languageSet = languageSet;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    @Column
    private String name;

    @ManyToMany
    @JoinTable(name = "country_languages",
            joinColumns = @JoinColumn(name = "country_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id"))
    Set<Language> languageSet = new HashSet<>();

    public void setLanguageSet(Set<Language> languageSet) {
        this.languageSet = languageSet;
    }

    public Set<Language> getLanguageSet() {
        return languageSet;
    }
}
