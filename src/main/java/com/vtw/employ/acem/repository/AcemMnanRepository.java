package com.vtw.employ.acem.repository;

import com.vtw.employ.acem.AcemMnan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AcemMnanRepository extends JpaRepository<AcemMnan, Long> {
    Optional<AcemMnan> findByBcno(String bcno);
}
