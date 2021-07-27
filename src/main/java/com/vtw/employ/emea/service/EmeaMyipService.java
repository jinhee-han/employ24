package com.vtw.employ.emea.service;

import com.vtw.employ.emea.EmeaMyip;
import com.vtw.employ.emea.repository.EmeaMyipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeaMyipService {

    private final EmeaMyipRepository repository;

    public EmeaMyipService(EmeaMyipRepository repository) {
        this.repository = repository;
    }

    public List<EmeaMyip> list() {
        return repository.findAll();
    }

    public List<EmeaMyip> get(String bcno) {
        return repository.findByBcno(bcno);
    }
}
