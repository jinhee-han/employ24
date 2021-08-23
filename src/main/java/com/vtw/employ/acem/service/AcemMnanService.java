package com.vtw.employ.acem.service;

import com.vtw.employ.acem.AcemMnan;
import com.vtw.employ.acem.repository.AcemMnanRepository;
import org.springframework.stereotype.Service;

@Service
public class AcemMnanService {
    private final AcemMnanRepository repository;

    public AcemMnanService(AcemMnanRepository repository) {
        this.repository = repository;
    }

    public AcemMnan get(String bcno) {
        return repository.findByBcno(bcno).orElseGet(AcemMnan::new);
    }
}
