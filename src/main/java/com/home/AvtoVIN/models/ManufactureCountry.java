package com.home.AvtoVIN.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ManufactureCountry {

    @Id
    private Character characterCountry;
    private String Country;

    public ManufactureCountry() {
    }

    public ManufactureCountry(String country, Character characterCountry) {
        Country = country;
        this.characterCountry = characterCountry;
    }

    public Character getCharacterCountry() {
        return characterCountry;
    }

    public void setCharacterCountry(Character characterCountry) {
        this.characterCountry = characterCountry;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }
}
