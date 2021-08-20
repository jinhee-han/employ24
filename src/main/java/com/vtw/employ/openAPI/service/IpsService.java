package com.vtw.employ.openAPI.service;


import com.vtw.employ.openAPI.Ips;
import com.vtw.employ.openAPI.repository.IpsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IpsService {

    private final IpsRepository repository;

    public IpsService(IpsRepository repository) {
        this.repository = repository;
    }

    public List<Ips> findAll() {
        return repository.findAll();
    }

    public List<Ips> list(String bplcCno) {
        return repository.findByBplcCno(bplcCno);
    }

    public Ips get(String bplcCno, String tmpCno, String reqstYm) {
        return repository.findByBplcCnoAndTmpCnoAndReqstYm(bplcCno,tmpCno,reqstYm).orElseGet(Ips::new);
    }
}
