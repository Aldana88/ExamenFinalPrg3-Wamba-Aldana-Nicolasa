package com.example.app.model;

public class SocioRegular extends Socio {
    public SocioRegular(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public double aplicaBeneficio(double monto) {
        return monto; // Sin descuento
    }
}