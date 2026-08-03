package com.example.app.controller;

import com.example.app.dto.PrestamoRequestDTO;
import com.example.app.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @PostMapping("/prestar")
    public ResponseEntity<String> realizarPrestamo(@RequestBody PrestamoRequestDTO request) {
        String resultado = prestamoService.procesarPrestamo(request);
        return ResponseEntity.ok(resultado);
    }
}