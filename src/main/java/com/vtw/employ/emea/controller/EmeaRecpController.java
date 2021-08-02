package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaRecp;
import com.vtw.employ.emea.service.EmeaRecpService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employ24/api/emea")
public class EmeaRecpController {
    private final EmeaRecpService service;

    public EmeaRecpController(EmeaRecpService service) {
        this.service = service;
    }

    @RequestMapping("/recp")
    public List<EmeaRecp> list(){
        return service.list();
    }

    @RequestMapping("/recp/{bcno}")
    public List<EmeaRecp> get(@PathVariable String bcno){
        return service.get(bcno);
    }
}
