package com.example.patrones.Singleton;

public class Singleton {
    private static Singleton instancia;
    private Singleton() {}

    public static Singleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
