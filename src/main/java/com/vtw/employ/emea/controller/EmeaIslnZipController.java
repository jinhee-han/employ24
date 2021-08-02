package com.vtw.employ.emea.controller;

import com.vtw.employ.emea.EmeaIslnZip;
import com.vtw.employ.emea.service.EmeaIslnZipService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employ24/api/emea")
public class EmeaIslnZipController {
    private final EmeaIslnZipService service;

    public EmeaIslnZipController(EmeaIslnZipService service) {
        this.service = service;
    }

    @RequestMapping("/isln/zip")
    public List<EmeaIslnZip> list() { return service.list(); }

    @RequestMapping("/isln/zip/{bcno}")
    public List<EmeaIslnZip> get(@PathVariable String bcno) {
        return service.get(bcno);
    }
}
