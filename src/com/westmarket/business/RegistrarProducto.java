package com.westmarket.business;

import java.util.Scanner;
import java.util.ArrayList;

public class RegistrarProducto {

    Scanner scanner = new Scanner(System.in);

    public Producto registrarProducto(ArrayList<Producto> productos) {

        Producto nuevoProducto = new Producto();
        
        String cierre = "Ha sobrepasado la cantidad máxima de intentos. ¡Adiós!";

        // Validación para el código de producto
        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.println("Ingrese el código del producto: ");
            if (scanner.hasNextInt()) {
                int codigo = scanner.nextInt();
                scanner.nextLine(); 
                nuevoProducto.setCodigo(codigo);
                break;
            } else {
                System.out.println("Debe ingresar un código de producto.");
                scanner.next();
            }   
            if (intentos == 2) {
                System.out.println(cierre);
                return null; 
            }   
        }

        // Validación para la descripción
        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.println("Ingrese la descripción del producto: ");
            String descripcion = scanner.nextLine();  
            if (!descripcion.trim().isEmpty()) { 
                nuevoProducto.setDescripcion(descripcion); 
                break;
            } else {
                System.out.println("Debe ingresar una descripción del producto.");
            }
            if (intentos == 2) {
                System.out.println(cierre);
                return null;
            }
        }   

        // Validación para el precio 
        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.println("Ingrese el precio del producto: ");
            if (scanner.hasNextInt()) {
                int precio = scanner.nextInt();
                if (precio >= 0) {
                    nuevoProducto.setPrecio(precio);
                    break;
                } else {
                    System.out.println("El precio debe ser mayor o igual a 0.");
                }
            } else {
                System.out.println("Debe ingresar un número válido para el precio del producto.");
                scanner.next();
            }
            if (intentos == 2) {
                System.out.println(cierre);
                return null; 
            }
        }

        // Validación para el stock 
        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.println("Ingrese el stock del producto: ");
            if (scanner.hasNextInt()) {
                int stock = scanner.nextInt();
                if (stock >= 0) {
                    nuevoProducto.setStock(stock);
                    break;
                } else {
                    System.out.println("El stock debe ser mayor o igual a 0.");
                }
            } else {
                System.out.println("Debe ingresar un número válido para el stock del producto.");
                scanner.next();
            }
            if (intentos == 2) {
                System.out.println(cierre);
                return null; 
            }
        }
        
        // Validación para la categoría
        for (int intentos = 0; intentos < 3; intentos++) {
            System.out.println("1. Bebidas");
            System.out.println("2. Congelados");
            System.out.println("3. Lácteos");
            System.out.println("4. Aseo");
            System.out.println("Ingrese el número de la categoría del producto: ");
            if (scanner.hasNextInt()) {
                int categoria = scanner.nextInt();
                scanner.nextLine();
                if (categoria >= 1 && categoria <= 4) {
                    nuevoProducto.setCategoria(categoria);
                    break;
                } else {
                    System.out.println("Debe ingresar un número entre 1 y 4.");
                }
            } else {
                System.out.println("Debe ingresar un número para la categoría del producto.");
                scanner.next();
            }
            if (intentos == 2) {
                System.out.println(cierre);
                return null; 
            }
        }

        return nuevoProducto;
    }
}
