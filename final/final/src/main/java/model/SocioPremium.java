package com.example.app.model;
public class SocioPremium extends Socio {
    public SocioPremium(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public double aplicaBeneficio(double monto) {
        return monto * 0.5; // 50% de descuento
    }
}