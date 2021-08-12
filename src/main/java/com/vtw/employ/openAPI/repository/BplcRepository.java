package com.vtw.employ.openAPI.repository;

import com.vtw.employ.openAPI.Bplc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BplcRepository extends JpaRepository<Bplc,Long> {

    Optional<Bplc> findByBplcCno(String bplcCno);

    //Bplc findByBplcCno(String bplcCno);
}
