package com.example.patrones.FactoryMethod;

public class FabricaProducto {
    public Producto crearProducto (String nombre, String codigo, int cantidad, double precio, String tipoProducto){

        switch (tipoProducto){
            case "A":
                return new ProductoA(nombre, codigo, cantidad, precio, tipoProducto);
            case "B":
                return new ProductoB(nombre, codigo, cantidad, precio, tipoProducto);
            default:
                throw new RuntimeException("Tipo de Producto Invalido");
        }

    }
}
