package com.carapi.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carapi.api.dto.CarDTO;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @PostMapping
    public void create(@RequestBody CarDTO req) {
        System.out.println("Novo carro adicionado ao banco: " + req.modelo() + " - Ano " + req.anoModelo());
    }
}
