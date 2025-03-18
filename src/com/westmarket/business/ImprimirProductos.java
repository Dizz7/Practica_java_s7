package com.westmarket.business;

import java.util.ArrayList;

public class ImprimirProductos {

    public void imprimirListadoCompleto(ArrayList<Producto> productos) {
          
        System.out.println("--- Listado de productos ---");

        // For para iterar sobre todos los productos de la lista
        for (Producto producto : productos) {
            producto.imprimirListado(); // Imprimir cada producto con todos sus datos
        }
        
        System.out.println("--- Fin listado de productos ---");
    }
}
