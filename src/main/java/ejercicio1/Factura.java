package ejercicio1;

public class Factura {

    private Carrito carrito;
    private ServicioEnvio servicioEnvio;
    private String destino;

    public Factura(Carrito carrito, ServicioEnvio servicioEnvio, String destino) {
        this.carrito = carrito;
        this.servicioEnvio = servicioEnvio;
        this.destino = destino;
    }

    public double calcularTotal(){

        double costoProductos = carrito.calcularCostoProductos();
        System.out.printf("Costo productos: " + costoProductos + "\n");
        double pesoProductos = carrito.calcularPesoProductos();
        System.out.printf("Peso total: " + pesoProductos + "\n");
        double costoEnvio = servicioEnvio.calcularCostoEnvio(destino, pesoProductos);
        System.out.printf("Envio: " + costoEnvio + "\n");

        return costoProductos + costoEnvio;
    }
}
