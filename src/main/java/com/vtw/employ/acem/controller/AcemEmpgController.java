package com.vtw.employ.acem.controller;

import com.vtw.employ.acem.AcemEmpg;
import com.vtw.employ.acem.service.AcemEmpgService;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employ24/api/acem")
public class AcemEmpgController {
    private final AcemEmpgService service;

    public AcemEmpgController(AcemEmpgService service) {
        this.service = service;
    }

    @GetMapping("/empg/{bcno}")
    public AcemEmpg getPathVariable(@PathVariable String bcno){
        return service.get(bcno);
    }

    @GetMapping("/empg")
    public AcemEmpg getRequestParam(@RequestParam String bcno) {
        return service.get(bcno);
    }

    @PostMapping("/empg")
    public AcemEmpg getRequestBody(@RequestBody AcemEmpg acemEmpg){
        return service.get(acemEmpg.getBcno());
    }
}
