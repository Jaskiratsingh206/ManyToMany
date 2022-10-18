package com.example.ManyToMany.Domain;

import com.example.ManyToMany.Persistence.LanguageRepository;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long languageId;

    public Long getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Long languageId) {
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    private String name;

    Language(){
        super();
    }
    public Language(Long languageId, String name) {
        this.languageId = languageId;
        this.name = name;
    }


    public Language(String name) {
        this.name = name;
    }

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    Set<Country> countrySet = new HashSet<>();

    public void setCountrySet(Set<Country> countrySet) {
        this.countrySet = countrySet;
    }
}
