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

    public Ips findByBplcCno(String bplcCno) {
        return ipsRepository.findByBplcCno(bplcCno);
    }

    public Ips findByBplcCnoAndTmpCno(String bplcCno, String tmpCno) {
        return ipsRepository.findByBplcCnoAndTmpCno(bplcCno,tmpCno);
    }
}
