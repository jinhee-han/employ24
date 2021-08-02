package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaInsb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmeaInsbRepository extends JpaRepository<EmeaInsb, Long> {
    List<EmeaInsb> findByBcno(String bcno);
}
