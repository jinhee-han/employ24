package com.vtw.employ.openAPI.controller;


import com.vtw.employ.openAPI.Ips;
import com.vtw.employ.openAPI.service.IpsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/employ24/api")
public class IpsController {
    @Autowired
    private IpsService ipsService;

    @GetMapping("/ips")
    public List<Ips> getAllBpcl(){
        return ipsService.findAll();
    }

    @GetMapping("/ips/{bplcCno}")
    public List<Ips> getIps(@PathVariable String bplcCno){
        return ipsService.findByBplcCno(bplcCno);
    }
}
