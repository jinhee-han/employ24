package com.vtw.employ.emea.service;

import com.vtw.employ.emea.EmeaEmpg;

import com.vtw.employ.emea.repository.EmeaEmpgRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmeaEmpgService {
    private final EmeaEmpgRepository repository;

    public EmeaEmpgService(EmeaEmpgRepository repository) {
        this.repository = repository;
    }

    public List<EmeaEmpg> list() {
        return repository.findAll();
    }

    public List<EmeaEmpg> get(String bcno) {
        return repository.findByBcno(bcno);
    }
}
