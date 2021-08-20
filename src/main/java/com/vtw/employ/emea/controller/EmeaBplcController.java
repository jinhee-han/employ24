package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaBplc;
import com.vtw.employ.emea.service.EmeaBplcService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employ24/api/emea")
public class EmeaBplcController {

    private final EmeaBplcService service;

    public EmeaBplcController(EmeaBplcService service) {
        this.service = service;
    }

    /*@GetMapping("/bplc")
    public List<EmeaBplc> list(){
        return service.list();
    }*/

    @GetMapping("/bplc/{bcno}")
    public EmeaBplc getPathVariable(@PathVariable String bcno){
        return service.get(bcno);
    }

    @GetMapping("/bplc")
    public EmeaBplc getRequestParam(@RequestParam String bcno) {
        return service.get(bcno);
    }
}
