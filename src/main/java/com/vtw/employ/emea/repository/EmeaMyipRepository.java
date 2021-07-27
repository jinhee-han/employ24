package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaMyip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmeaMyipRepository extends JpaRepository<EmeaMyip, Long> {
    List<EmeaMyip> findByBcno(String bcno);
}
