package com.example.demo.controllers;

import com.example.demo.models.Book;
import com.example.demo.models.Kompis;
import com.example.demo.repositories.BookRepository;
import com.example.demo.repositories.KompisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Sileshi Haile Woldemariame
 * Date: 2021-04-16
 * Time: 13:34
 * Project:demolivebackend
 * Copyright: MIT
 */
@RestController
@RequestMapping(path = "/kompis")
public class KompisController {
    @Autowired
    private KompisRepository kompisRepository;
    @GetMapping(path = "/add")
    public @ResponseBody String addKompis(@RequestParam String name, @RequestParam String telefonNumber){
        Kompis k = new Kompis();
        k.setName(name);
        k.setTelefonNumber(telefonNumber);

        kompisRepository.save(k);
        return " Komps was saved";

    }
}
