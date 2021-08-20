package com.vtw.employ.openAPI.controller;

import com.vtw.employ.openAPI.Bplc;
import com.vtw.employ.openAPI.service.BplcService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employ24/api")
public class BplcController {

    private final BplcService service;

    public BplcController(BplcService service) {
        this.service = service;
    }

    @GetMapping("/bplc/{bplcCno}")
    public Bplc getPathVariable(@PathVariable String bplcCno){
        return service.get(bplcCno);
    }

    @GetMapping("/bplc")
    public Bplc getRequestParam(@RequestParam String bplcCno){
        return service.get(bplcCno);
    }

    @PostMapping("/bplc")
    public Bplc getRequestBody(@RequestBody Bplc bplc){
        return service.get(bplc.getBplcCno());
    }
}
