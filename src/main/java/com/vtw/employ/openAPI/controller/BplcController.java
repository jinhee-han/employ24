package com.vtw.employ.openAPI.controller;

import com.vtw.employ.openAPI.Bplc;
import com.vtw.employ.openAPI.service.BplcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employ24/api")
public class BplcController {
    @Autowired
    private BplcService bplcService;

    /*@GetMapping("/bplc")
    public List<Bplc> getAllBpcl(){
        return bplcService.findAll();
    }*/

    @GetMapping("/bplc/{bplcCno}")
    public Bplc getBpcl(@PathVariable String bplcCno){
        return bplcService.findByBplcCno(bplcCno);
    }
     /*@GetMapping("/bplc")
    public Bplc getBpcl(@RequestParam String bplcCno){
        return bplcService.findByBplcCno(bplcCno);
    }*/
}
