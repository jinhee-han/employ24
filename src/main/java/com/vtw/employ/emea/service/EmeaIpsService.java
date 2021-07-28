package com.vtw.employ.emea.service;

import com.vtw.employ.emea.EmeaIps;
import com.vtw.employ.emea.repository.EmeaIpsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeaIpsService {
    private final EmeaIpsRepository repository;

    public EmeaIpsService(EmeaIpsRepository repository) {
        this.repository = repository;
    }

    public List<EmeaIps> list() {
        return repository.findAll();
    }

    public List<EmeaIps> get(String bcno) {
        return repository.findByBcno(bcno);
    }
}
