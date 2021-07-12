package com.vtw.employ.openAPI.service;


import com.vtw.employ.openAPI.Ips;
import com.vtw.employ.openAPI.repository.IpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IpsService {
    @Autowired
    private IpsRepository ipsRepository;


    public List<Ips> findAll() {
        return ipsRepository.findAll();
    }

    public List<Ips> findByBplcCno(String bplcCno) {
        return ipsRepository.findByBplcCno(bplcCno);
    }
}
