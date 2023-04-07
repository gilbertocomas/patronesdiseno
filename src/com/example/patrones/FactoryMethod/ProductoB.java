package com.example.patrones.FactoryMethod;

public class ProductoB extends Producto{


    public ProductoB(String nombre, String codigo, int cantidad, double precio, String tipoProducto) {
        super(nombre, codigo, cantidad, precio, tipoProducto);
    }

    @Override
    public void imprimirTipoProducto() {
        System.out.println("Yo soy el producto B");
    }
}
