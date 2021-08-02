package com.vtw.employ.emea.service;

import com.vtw.employ.emea.EmeaMnan;
import com.vtw.employ.emea.repository.EmeaMnanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeaMnanService {
    private final EmeaMnanRepository repository;

    public EmeaMnanService(EmeaMnanRepository repository) {
        this.repository = repository;
    }

    public List<EmeaMnan> list() {
        return repository.findAll();
    }

    public List<EmeaMnan> get(String bcno) {
        return repository.findByBcno(bcno);
    }
}
