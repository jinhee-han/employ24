package com.vtw.employ.openAPI.repository;

import com.vtw.employ.openAPI.Ips;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IpsRepository extends JpaRepository<Ips,Long> {

    Ips findByBplcCno(String bplcCno);

    Ips findByBplcCnoAndTmpCno(String bplcCno, String tmpCno);
}
