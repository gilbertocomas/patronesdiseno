package com.example.patrones.FactoryMethod;

public abstract class Producto {
    private String nombre;
    private String codigo;
    private int cantidad;
    private double precio;
    private String tipoProducto;

    public Producto(String nombre, String codigo, int cantidad, double precio, String tipoProducto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.tipoProducto = tipoProducto;
    }

    public abstract void imprimirTipoProducto();

}
