package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaBplc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmeaBplcRepository extends JpaRepository<EmeaBplc, Long> {
    Optional<EmeaBplc> findByBcno(String bcno);
}
