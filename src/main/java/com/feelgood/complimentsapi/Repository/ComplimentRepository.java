package com.feelgood.complimentsapi.Repository;

import com.feelgood.complimentsapi.Model.Compliment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplimentRepository extends JpaRepository<Compliment, Long> {
}
