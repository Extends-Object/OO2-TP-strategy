package ejercicio1;

public class Main {
    public static void main(String[] args) {

        Carrito carrito =  new Carrito();

        carrito.agregarProducto(new Producto("Memoria RAM", 1000, 0.600));  //peso en kg
        carrito.agregarProducto(new Producto("Disco SSD", 500, 1.000));  //peso en kg
        carrito.agregarProducto(new Producto("Monitor", 2500, 3.500));  //peso en kg

        ServicioEnvio servicioEnvio = new ColectivosSur("La Plata",
                new ServicioDistanciaClass("http://distancia.ar?orgen=capital&destino=xxx"));

        Factura factura = new Factura(carrito, servicioEnvio, "Capital Federal");

        System.out.printf("El costo final es: " + factura.calcularTotal());
    }
}
