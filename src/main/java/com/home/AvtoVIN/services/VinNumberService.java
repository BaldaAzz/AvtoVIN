package com.home.AvtoVIN.services;

import com.home.AvtoVIN.models.ManufactureCountry;
import com.home.AvtoVIN.models.VinNumber;
import com.home.AvtoVIN.repositories.ManufactureCompanyRepository;
import com.home.AvtoVIN.repositories.ManufactureCountryRepository;
import com.home.AvtoVIN.repositories.ModelYearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VinNumberService {

    @Autowired
    private ManufactureCompanyRepository manufactureCompanyRepository;
    @Autowired
    private ManufactureCountryRepository manufactureCountryRepository;
    @Autowired
    private ModelYearRepository modelYearRepository;

    public VinNumber getVinNumber(String vinStr) {
        char[] vinCharsArray = vinStr.toCharArray();

        VinNumber vinNumber = new VinNumber();

        vinNumber.setCountry(manufactureCountryRepository.findById(vinCharsArray[0]).get().getCountry());
        vinNumber.setCompany(manufactureCompanyRepository.findById(vinCharsArray[1]).get().getCompany());
        vinNumber.setYear(modelYearRepository.findById(vinCharsArray[9]).get().getYear());

        return  vinNumber;
    }
}
