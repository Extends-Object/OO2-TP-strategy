package ejercicio1;

public class ServicioDistanciaClass implements ServicioDistancia {

    private String url;

    public ServicioDistanciaClass(String url) {
        this.url = url;
    }

    @Override
    public double obtenerDistancia(String destino, String origen) {

        //aca simulo una consulta a un servicio externo
        // url + "?origen=" + origen + "&destino=" + destino
        System.out.println("Consultando distancia en: " + url +
                "?origen=" + origen + "&destino=" + destino);
        //supongamos que la consulta da algo asi...

        return 400;
    }
}
