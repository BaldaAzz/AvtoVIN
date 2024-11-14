package com.home.AvtoVIN.repositories;

import com.home.AvtoVIN.models.ManufactureCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufactureCompanyRepository extends JpaRepository<ManufactureCompany, Character> {
}
