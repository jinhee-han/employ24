package com.vtw.employ.openAPI.controller;

import com.vtw.employ.openAPI.Ips;
import com.vtw.employ.openAPI.service.IpsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employ24/api")
public class IpsController {

    private final IpsService service;

    public IpsController(IpsService service) {
        this.service = service;
    }

    @GetMapping("/ips/{bplcCno}")
    public List<Ips> getPathVariable(@PathVariable String bplcCno){
        return service.list(bplcCno);
    }

    @GetMapping("/ips")
    public Ips getRequestParam(@RequestParam String bplcCno,@RequestParam String tmpCno, @RequestParam String reqstYm){
        return service.get(bplcCno,tmpCno,reqstYm);
    }

    @PostMapping("/ips")
    public Ips getRequestBody(@RequestBody Ips ips){
        return service.get(ips.getBplcCno(),ips.getTmpCno(),ips.getReqstYm());
    }

}
