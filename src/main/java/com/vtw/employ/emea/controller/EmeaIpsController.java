package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaIps;
import com.vtw.employ.emea.service.EmeaIpsService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employ24/api/emea")
public class EmeaIpsController {
    private final EmeaIpsService service;

    public EmeaIpsController(EmeaIpsService service) {
        this.service = service;
    }

    @RequestMapping("/ips")
    public List<EmeaIps> list(){
        return service.list();
    }

    @RequestMapping("/ips/{bcno}")
    public List<EmeaIps> get(@PathVariable String bcno){
        return service.get(bcno);
    }
}
