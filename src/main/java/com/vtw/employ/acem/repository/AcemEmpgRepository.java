package com.vtw.employ.acem.repository;

import com.vtw.employ.acem.AcemEmpg;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AcemEmpgRepository extends JpaRepository<AcemEmpg, Long> {
    Optional<AcemEmpg> findByBcno(String bcno);

}
