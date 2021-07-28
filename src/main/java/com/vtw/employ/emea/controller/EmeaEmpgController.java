package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaEmpg;
import com.vtw.employ.emea.service.EmeaEmpgService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employ24/api/emea")
public class EmeaEmpgController {
    private final EmeaEmpgService service;

    public EmeaEmpgController(EmeaEmpgService service) {
        this.service = service;
    }

    @RequestMapping("/empg")
    public List<EmeaEmpg> list(){
        return service.list();
    }

    @RequestMapping("/empg/{bcno}")
    public List<EmeaEmpg> get(@PathVariable String bcno){
        return service.get(bcno);
    }
}
