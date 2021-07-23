package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaBplc;
import com.vtw.employ.emea.service.EmeaBplcService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employ24/api/emea")
public class EmeaBplcController {

    private final EmeaBplcService service;

    public EmeaBplcController(EmeaBplcService service) {
        this.service = service;
    }

    @GetMapping("/bplc")
    public List<EmeaBplc> list(){
        return service.list();
    }

    @GetMapping("/bplc/{bcno}")
    public List<EmeaBplc> get(@PathVariable String bcno){
        return service.get(bcno);
    }
}
