package com.example.app.service;

import com.example.app.dto.PrestamoRequestDTO;
import org.springframework.stereotype.Service;

@Service
public class PrestamoService {

    public String procesarPrestamo(PrestamoRequestDTO request) {
        // Lógica de préstamo
        return "Préstamo procesado exitosamente para el usuario ID: " + request.getUsuarioId();
    }
}