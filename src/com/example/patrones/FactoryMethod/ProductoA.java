package com.example.patrones.FactoryMethod;

public class ProductoA extends Producto{

    public ProductoA(String nombre, String codigo, int cantidad, double precio, String tipoProducto) {
        super(nombre, codigo, cantidad, precio, tipoProducto);
    }

    @Override
    public void imprimirTipoProducto() {
        System.out.println("Yo soy el producto A");
    }

}
