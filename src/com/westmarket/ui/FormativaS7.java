package com.westmarket.ui;

import com.westmarket.business.EliminarProducto;
import com.westmarket.business.ImprimirProductos;
import com.westmarket.business.Producto;
import com.westmarket.business.RegistrarProducto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Actividad Formativa S7
 * Grupo 3 
 * DANIEL CARLOS ALARCON POBLETE
 * ALEXANDRA GISSELE ASSLER LOPEZ 
 * ANDREA BELEN FARIAS SILVA 
 */
public class FormativaS7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>(); // Lista para almacenar los productos
        RegistrarProducto registrar = new RegistrarProducto();  // Instancia de RegistrarProducto
        ImprimirProductos imprimir = new ImprimirProductos();  // Instancia de ImprimirProductos
        EliminarProducto eliminar = new EliminarProducto();  // Instancia de EliminarProducto
        
        System.out.println("Bienvenido a West Market.");
        boolean continuar = true;

        while (continuar) {
            System.out.println("--- West Market ---");
            System.out.println("Menu: ");
            System.out.println("1. Registrar Producto");
            System.out.println("2. Imprimir Productos");
            System.out.println("3. Eliminar Producto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            System.out.println("");

            switch (opcion) {
                case 1:
                    // Registrar Producto
                    Producto nuevoProducto = registrar.registrarProducto(productos);
                    if (nuevoProducto != null) {
                        productos.add(nuevoProducto);
                        System.out.println("Producto registrado exitosamente.");
                        System.out.println("");
                    }
                    break;

                case 2:
                    // Imprimir Productos
                    imprimir.imprimirListadoCompleto(productos);
                    System.out.println("");
                    break;

                case 3:
                    // Eliminar Producto
                    eliminar.eliminarProducto(productos);
                    System.out.println("");
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Ha salido del sistema");
                    System.out.println("¡Gracias por usar el programa de West Market!");
                    break;

                default:
                    System.out.println("La opción no es válida, por favor intente nuevamente.");
                    System.out.println("");
                    break;
            }
        }

        scanner.close();
    }
}
