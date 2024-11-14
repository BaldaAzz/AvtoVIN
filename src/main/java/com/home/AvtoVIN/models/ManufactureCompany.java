package com.home.AvtoVIN.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ManufactureCompany {

    @Id
    private Character characterCompany;
    private String Company;

    public ManufactureCompany() {
    }

    public ManufactureCompany(Character characterCompany, String company) {
        this.characterCompany = characterCompany;
        Company = company;
    }

    public Character getCharacterCompany() {
        return characterCompany;
    }

    public void setCharacterCompany(Character characterCompany) {
        this.characterCompany = characterCompany;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }
}
