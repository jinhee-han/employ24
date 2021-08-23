package com.vtw.employ.acem.service;

import com.vtw.employ.acem.AcemBplc;
import com.vtw.employ.acem.repository.AcemBplcRepository;
import org.springframework.stereotype.Service;

@Service
public class AcemBplcService {
    private final AcemBplcRepository repository;

    public AcemBplcService(AcemBplcRepository repository) {
        this.repository = repository;
    }

    public AcemBplc get(String bcno) {
        return repository.findByBcno(bcno).orElseGet(AcemBplc::new);
    }
}
