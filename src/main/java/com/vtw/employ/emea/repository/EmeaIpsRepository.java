package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaIps;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmeaIpsRepository extends JpaRepository<EmeaIps, Long> {
    List<EmeaIps> findByBcno(String bcno);
}
