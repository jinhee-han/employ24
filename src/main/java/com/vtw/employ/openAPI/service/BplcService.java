package com.vtw.employ.openAPI.service;

import com.vtw.employ.openAPI.Bplc;
import com.vtw.employ.openAPI.repository.BplcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BplcService {
    @Autowired
    private BplcRepository bplcRepository;


    public List<Bplc> findAll() {
        return bplcRepository.findAll();
    }

    public Bplc findByBplcCno(String bplcCno) {
        return bplcRepository.findByBplcCno(bplcCno).orElseGet(Bplc::new);
    }
}
