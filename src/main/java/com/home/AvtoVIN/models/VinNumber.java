package com.home.AvtoVIN.models;

public class VinNumber {

    private String country;
    private String company;
    private Integer year;

    public VinNumber() {
    }

    public VinNumber(String country, String company, Integer year) {
        this.country = country;
        this.company = company;
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
