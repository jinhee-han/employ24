package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaMnan;
import com.vtw.employ.emea.service.EmeaMnanService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employ24/api/emea")
public class EmeaMnanController {
    private final EmeaMnanService service;

    public EmeaMnanController(EmeaMnanService service) {
        this.service = service;
    }

    @RequestMapping("/mnan")
    public List<EmeaMnan> list(){
        return service.list();
    }

    @RequestMapping("/mnan/{bcno}")
    public List<EmeaMnan> get(@PathVariable String bcno){
        return service.get(bcno);
    }
}
