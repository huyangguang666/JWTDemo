package com.demo.dailycost.repository;

import com.demo.dailycost.domain.CostType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostTypeRepository extends JpaRepository<CostType, String> {
}
