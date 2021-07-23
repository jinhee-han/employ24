package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaBplc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmeaBplcRepository extends JpaRepository<EmeaBplc, Long> {

    List<EmeaBplc> findByBcno(String bcno);
}
