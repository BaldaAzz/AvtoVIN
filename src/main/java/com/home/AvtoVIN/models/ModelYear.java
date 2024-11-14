package com.home.AvtoVIN.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ModelYear {

    @Id
    private Character characterYear;
    private Integer year;

    public ModelYear() {
    }

    public ModelYear(Character characterYear, Integer year) {
        this.characterYear = characterYear;
        this.year = year;
    }

    public Character getCharacterYear() {
        return characterYear;
    }

    public void setCharacterYear(Character characterYear) {
        this.characterYear = characterYear;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
