package com.westmarket.business;

public class Producto {

    private int codigo;
    private String descripcion;
    private int precio;
    private int stock;
    private int categoria;  

    public Producto(int codigo, String descripcion, int precio, int stock, int categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public Producto() {
    }

   
    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    // Método para imprimir el listado completo del producto con todos sus detalles
    public void imprimirListado() {
        String categoriaStr = "";
        switch (categoria) {
            case 1:
                categoriaStr = "Bebidas (Cod: 1)";
                break;
            case 2:
                categoriaStr = "Congelados (Cod: 2)";
                break;
            case 3:
                categoriaStr = "Lácteos (Cod: 3)";
                break;
            case 4:
                categoriaStr = "Aseo (Cod: 4)";
                break;
        }

        System.out.println("Código: " + codigo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Categoría: " + categoriaStr);
        System.out.println("Stock: " + stock);
        System.out.println("--------------------------------------------");
    }

    // Método para imprimir solo el código y la descripción del producto
    public void imprimirListadoSimple() {
        System.out.println("Código: " + codigo + " | Descripción: " + descripcion);
    }
}
