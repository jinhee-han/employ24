package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaInsb;
import com.vtw.employ.emea.service.EmeaInsbService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employ24/api/emea")
public class EmeaInsbController {
    private final EmeaInsbService service;

    public EmeaInsbController(EmeaInsbService service) {
        this.service = service;
    }

    @RequestMapping("/insb")
    public List<EmeaInsb> list() {
        return service.list();
    }

    @RequestMapping("/insb/{bcno}")
    public List<EmeaInsb> get(@PathVariable String bcno){
        return service.get(bcno);
    }
}
