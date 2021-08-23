package com.vtw.employ.acem.controller;

import com.vtw.employ.acem.AcemMnan;
import com.vtw.employ.acem.service.AcemMnanService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employ24/api/acem")
public class AcemMnanController {
    private final AcemMnanService service;

    public AcemMnanController(AcemMnanService service) {
        this.service = service;
    }

    @GetMapping("/mnan/{bcno}")
    public AcemMnan getPathVariable(@PathVariable String bcno){
        return service.get(bcno);
    }

    @GetMapping("/mnan")
    public AcemMnan getRequestParam(@RequestParam String bcno) {
        return service.get(bcno);
    }

    @PostMapping("/mnan")
    public AcemMnan getRequestBody(@RequestBody AcemMnan acemMnan){
        return service.get(acemMnan.getBcno());
    }
}
