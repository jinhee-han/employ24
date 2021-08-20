package com.vtw.employ.openAPI.service;

import com.vtw.employ.openAPI.Bplc;
import com.vtw.employ.openAPI.repository.BplcRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BplcService {

    private final BplcRepository repository;

    public BplcService(BplcRepository repository) {
        this.repository = repository;
    }

    public Bplc get(String bplcCno) {
        return repository.findByBplcCno(bplcCno).orElseGet(Bplc::new);
    }
}
