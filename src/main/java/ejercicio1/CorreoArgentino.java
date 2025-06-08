package ejercicio1;

import java.util.Map;

public class CorreoArgentino extends ServicioEnvio {

    private static final Map<String, Double> costosDestino = Map.of(
            "Capital Federal", 500.0,
            "Otro", 800.0
    );

    public CorreoArgentino(String origen, ServicioDistancia servicioDistancia) {
        super(origen, servicioDistancia);
    }

    @Override
    public double calcularCostoEnvio(String destino, double peso) {
        double precio = costosDestino.get(destino);
        return precio + adicionalPorDistancia(destino);
    }

    private double adicionalPorDistancia(String destino){
        return 5 * servicioDistancia.obtenerDistancia(destino, origen);
    }
}
