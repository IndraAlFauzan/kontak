package com.example.kontak.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import  com.example.kontak.model.kontakRepo;
import  com.example.kontak.model.kontak;

@CrossOrigin
@RestController
@RequestMapping("/kontak")
public class kontakController {

    @Autowired
    private kontakRepo kontakRepo;

    @GetMapping
    @ResponseBody
    public List<kontak> getAllKontak() {
        return kontakRepo.findAll();
    }

    


    
}
