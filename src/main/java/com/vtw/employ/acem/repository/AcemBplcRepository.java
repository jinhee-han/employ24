package com.vtw.employ.acem.repository;

import com.vtw.employ.acem.AcemBplc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AcemBplcRepository extends JpaRepository<AcemBplc, Long> {
    Optional<AcemBplc> findByBcno(String bcno);
}
