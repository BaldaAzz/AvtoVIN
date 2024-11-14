package com.home.AvtoVIN.repositories;

import com.home.AvtoVIN.models.ManufactureCountry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureCountryRepository extends JpaRepository<ManufactureCountry, Character> {
}
