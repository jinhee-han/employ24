package com.vtw.employ.emea.repository;

import com.vtw.employ.emea.EmeaIslnZip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmeaIslnZipRepository extends JpaRepository<EmeaIslnZip, Long> {


    List<EmeaIslnZip> findByBcno(String bcno);
}
