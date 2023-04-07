package com.example.patrones;

import com.example.patrones.FactoryMethod.FabricaProducto;
import com.example.patrones.FactoryMethod.Producto;
import com.example.patrones.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        FabricaProducto fabrica = new FabricaProducto();

        Producto productoA = fabrica.crearProducto("Computadora", "Comp-01", 50, 12000.90, "A");
        Producto productoB = fabrica.crearProducto("Computadora", "Comp-01", 50, 12000.90, "B");
        productoB.imprimirTipoProducto();
        productoA.imprimirTipoProducto();

        //Producto productoNoExist = fabrica.crearProducto("Computadora", "Comp-01", 50, 12000.90, "C");

        Singleton singleton1 = Singleton.obtenerInstancia();
        Singleton singleton2 = Singleton.obtenerInstancia();
        Singleton singleton3 = Singleton.obtenerInstancia();
        Singleton singleton4 = Singleton.obtenerInstancia();

        System.out.println(singleton1 == singleton2);
        System.out.println(singleton3 == singleton4);
    }
}
