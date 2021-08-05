package com.vtw.employ.openAPI.repository;

import com.vtw.employ.openAPI.Bplc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BplcRepository extends JpaRepository<Bplc,Long> {

    Bplc findByBplcCno(String bplcCno);
}
