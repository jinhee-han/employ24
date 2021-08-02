package com.vtw.employ.emea.service;

import com.vtw.employ.emea.EmeaRecp;
import com.vtw.employ.emea.repository.EmeaRecpRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeaRecpService {
    private final EmeaRecpRepository repository;

    public EmeaRecpService(EmeaRecpRepository repository) {
        this.repository = repository;
    }

    public List<EmeaRecp> list() {
        return repository.findAll();
    }

    public List<EmeaRecp> get(String bcno) {
        return repository.findByBcno(bcno);
    }
}
