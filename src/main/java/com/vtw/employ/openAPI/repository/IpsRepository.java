package com.vtw.employ.openAPI.repository;

import com.vtw.employ.openAPI.Ips;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IpsRepository extends JpaRepository<Ips,Long> {

    List<Ips> findByBplcCno(String bplcCno);

    Optional<Ips> findByBplcCnoAndTmpCnoAndReqstYm(String bplcCno, String tmpCno, String reqstYm);

}
