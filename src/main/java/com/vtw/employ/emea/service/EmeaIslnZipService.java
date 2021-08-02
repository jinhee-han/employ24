package com.vtw.employ.emea.service;

import com.vtw.employ.emea.EmeaIslnZip;
import com.vtw.employ.emea.repository.EmeaIslnZipRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeaIslnZipService {
    private final EmeaIslnZipRepository repository;

    public EmeaIslnZipService(EmeaIslnZipRepository repository) {
        this.repository = repository;
    }

    public List<EmeaIslnZip> list() {
        return repository.findAll();
    }

    public List<EmeaIslnZip> get(String bcno) {
        return repository.findByBcno(bcno);
    }
}
