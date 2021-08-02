package com.vtw.employ.emea.service;

import com.vtw.employ.emea.EmeaInsb;
import com.vtw.employ.emea.repository.EmeaInsbRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeaInsbService {
    private final EmeaInsbRepository repository;

    public EmeaInsbService(EmeaInsbRepository repository) {
        this.repository = repository;
    }

    public List<EmeaInsb> list() {
        return repository.findAll();
    }

    public List<EmeaInsb> get(String bcno) {
        return repository.findByBcno(bcno);
    }
}
