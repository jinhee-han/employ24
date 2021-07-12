package com.vtw.employ.openAPI.controller;

import com.vtw.employ.openAPI.Bplc;
import com.vtw.employ.openAPI.service.BplcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employ24/api")
public class BplcController {
    @Autowired
    private BplcService bplcService;

    @GetMapping("/")
    public String jenkins(){
        return "jenkins";
    }
    @GetMapping("/bplc")
    public List<Bplc> getAllBpcl(){
        return bplcService.findAll();
    }

    @GetMapping("/bplc/{bplcCno}")
    public List<Bplc> getBpcl(@PathVariable String bplcCno){
        return bplcService.findByBplcCno(bplcCno);
    }
}
