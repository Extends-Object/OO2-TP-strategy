package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos;
    private double precioTotal;
    private double pesoTotal;

    public Carrito() {
        this.productos = new ArrayList<>();
        this.precioTotal = 0;
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public double calcularCostoProductos(){
        for (Producto p : productos){
            this.precioTotal += p.getPrecio();
        }
        return this.precioTotal;
    }

    public double calcularPesoProductos(){
        for (Producto p : productos){
            this.pesoTotal += p.getPeso();
        }
        return this.pesoTotal;
    }
}
