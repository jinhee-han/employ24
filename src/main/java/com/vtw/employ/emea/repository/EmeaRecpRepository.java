package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaRecp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmeaRecpRepository extends JpaRepository<EmeaRecp, Long> {
    List<EmeaRecp> findByBcno(String bcno);
}
