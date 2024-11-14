package com.home.AvtoVIN.repositories;

import com.home.AvtoVIN.models.ModelYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelYearRepository extends JpaRepository<ModelYear, Character> {
}
