package com.vtw.employ.acem.service;

import com.vtw.employ.acem.AcemBplc;
import com.vtw.employ.acem.AcemEmpg;
import com.vtw.employ.acem.repository.AcemEmpgRepository;
import com.vtw.employ.emea.EmeaEmpg;
import com.vtw.employ.emea.repository.EmeaEmpgRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcemEmpgService {
    private final AcemEmpgRepository repository;

    public AcemEmpgService(AcemEmpgRepository repository) {
        this.repository = repository;
    }

    public AcemEmpg get(String bcno) {
        return repository.findByBcno(bcno).orElseGet(AcemEmpg::new);
    }
}
