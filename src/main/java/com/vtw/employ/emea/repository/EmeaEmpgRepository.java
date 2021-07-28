package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaEmpg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmeaEmpgRepository extends JpaRepository<EmeaEmpg, Long> {
    List<EmeaEmpg> findByBcno(String bcno);
}
