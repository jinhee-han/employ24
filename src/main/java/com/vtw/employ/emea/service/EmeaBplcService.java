package com.vtw.employ.emea.service;

import com.vtw.employ.emea.EmeaBplc;
import com.vtw.employ.emea.repository.EmeaBplcRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmeaBplcService {

    private final EmeaBplcRepository repository;

    public EmeaBplcService(EmeaBplcRepository repository) {
        this.repository = repository;
    }

    public List<EmeaBplc> list() {
        return repository.findAll();
    }

    public EmeaBplc get(String bcno) {
        return repository.findByBcno(bcno).orElseGet(EmeaBplc::new);
    }
}
