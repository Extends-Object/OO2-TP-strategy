package ejercicio1;

public abstract class ServicioEnvio {

    protected String origen;
    protected ServicioDistancia servicioDistancia;

    public ServicioEnvio(String origen, ServicioDistancia servicioDistancia) {
        this.origen = origen;
        this.servicioDistancia = servicioDistancia;
    }

    public abstract double calcularCostoEnvio(String destino, double peso);
}
