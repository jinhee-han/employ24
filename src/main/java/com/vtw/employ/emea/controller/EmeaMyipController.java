package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaMyip;
import com.vtw.employ.emea.service.EmeaMyipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employ24/api/emea")
public class EmeaMyipController {

    private final EmeaMyipService service;

    public EmeaMyipController(EmeaMyipService service) {
        this.service = service;
    }

    @GetMapping("/myip")
    public List<EmeaMyip> list() {
        return service.list();
    }

    @GetMapping("/myip/{bcno}")
    public List<EmeaMyip> get(@PathVariable String bcno){
        return service.get(bcno);
    }
}
