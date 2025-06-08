import ejercicio1.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FacturaTest {

    Carrito carrito1;
    Carrito carrito2;
    Carrito carrito3;
    Carrito carrito4;
    ServicioDistancia servicioDistanciaFake;
    ServicioEnvio envio;
    Factura factura;

    @BeforeEach
    public void setUp() {

        carrito1 = new Carrito();
        carrito2 = new Carrito();
        carrito3 = new Carrito();
        carrito4 = new Carrito();


        carrito1.agregarProducto(new Producto("Mouse", 3000, 2));
        carrito1.agregarProducto(new Producto("Teclado", 5000, 2)); // total 4kg

        carrito2.agregarProducto(new Producto("Monitor", 60000, 10));
        carrito2.agregarProducto(new Producto("Impresora", 80000, 10)); // total 20kg

        carrito3.agregarProducto(new Producto("CPU", 200000, 35)); // peso 35kg

        carrito4.agregarProducto(new Producto("Notebook", 150000, 3));
        carrito4.agregarProducto(new Producto("Tablet", 70000, 1)); // peso total 4kg


        //aca defino la distancia que quiero que se use en el test (interface funcional)
        servicioDistanciaFake = new ServicioDistancia() {
            @Override
            public double obtenerDistancia(String destino, String origen) {
                return 100;
            }
        };
    }


    @Test
    public void colectivoSur_menor5kg_test() {

        envio = new ColectivosSur("Capital Federal", servicioDistanciaFake);
        factura = new Factura(carrito1, envio, "Capital Federal");

        //Sin adicional por peso
        double resultado = 3000 + 5000 + 1000;

        assertEquals(resultado, factura.calcularTotal());
    }

    @Test
    public void colectivoSur_entre5y30Kg_test() {

        envio = new ColectivosSur("Capital Federal", servicioDistanciaFake);
        factura = new Factura(carrito2, envio, "Gran Buenos Aires");

        //Adicional de 500 por peso
        double resultado = 60000 + 80000 + 1500 + 500;

        assertEquals(resultado, factura.calcularTotal());
    }

    @Test
    public void colectivoSur_mayorA30Kg_test() {

        envio = new ColectivosSur("Capital Federal", servicioDistanciaFake);
        factura = new Factura(carrito3, envio, "Otro");

        //Adicional de 2000 por peso
        double resultado = 200000 + 3000 + 2000;

        assertEquals(resultado, factura.calcularTotal());
    }

    @Test
    public void correoArgentino_test() {

        envio = new CorreoArgentino("Capital Federal", servicioDistanciaFake);
        factura = new Factura(carrito4, envio, "Otro");

        //800 base + 500 extra por distancia
        double resultado = 150000 + 70000 + 800 + (5 * 100);

        assertEquals(resultado, factura.calcularTotal());
    }
}