package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaMnan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmeaMnanRepository extends JpaRepository<EmeaMnan, Long> {
    List<EmeaMnan> findByBcno(String bcno);
}
