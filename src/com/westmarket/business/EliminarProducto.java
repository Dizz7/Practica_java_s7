package com.westmarket.business;

import java.util.ArrayList;
import java.util.Scanner;

public class EliminarProducto {

    private Scanner scanner = new Scanner(System.in);

    public boolean eliminarProducto(ArrayList<Producto> productos) {
        // Muestra el listado simple de los productos registrados (código y descripción)
        for (Producto producto : productos) {
            producto.imprimirListadoSimple(); 
        }

        System.out.println("Ingrese el código del producto que desea eliminar: ");
        
        if (!scanner.hasNextInt()) {
            System.out.println("Debe ingresar un código numérico válido.");
            scanner.next();
            return false;
        }

        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        // For con índice para eliminar el producto
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getCodigo() == codigo) {
                productos.remove(i);
                System.out.println("Producto con código " + codigo + " ha sido eliminado.");
                return true;
            }
        }

        System.out.println("No se encontró un producto con el código ingresado.");
        return false;
    }
}
