package ejercicio1;

import java.util.Map;

public class ColectivosSur extends ServicioEnvio {

    private static final Map<String, Double> costosDestino = Map.of(
            "Capital Federal", 1000.0,
            "Gran Buenos Aires", 1500.0,
            "Otro", 3000.0
    );

    public ColectivosSur(String origen, ServicioDistancia servicioDistancia) {
        super(origen, servicioDistancia);
    }

    @Override
    public double calcularCostoEnvio(String destino, double peso) {
        double precio = costosDestino.get(destino);
        return precio + adicionalPorPeso(peso);
    }

    private double adicionalPorPeso(double peso) {
        if (peso > 30) return 2000;
        if (peso > 5) return 500;
        return 0;
    }
}
