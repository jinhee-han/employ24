package com.vtw.employ.acem.controller;

import com.vtw.employ.acem.AcemBplc;
import com.vtw.employ.acem.service.AcemBplcService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employ24/api/acem")
public class AcemBplcController {
    private final AcemBplcService service;

    public AcemBplcController(AcemBplcService service) {
        this.service = service;
    }

    @GetMapping("/bplc/{bcno}")
    public AcemBplc getPathVariable(@PathVariable String bcno){
        return service.get(bcno);
    }

    @GetMapping("/bplc")
    public AcemBplc getRequestParam(@RequestParam String bcno) {
        return service.get(bcno);
    }

    @PostMapping("/bplc")
    public AcemBplc getRequestBody(@RequestBody AcemBplc acemBplc){
        return service.get(acemBplc.getBcno());
    }
}
