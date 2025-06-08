package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoCorto implements Formateador{

    @Override
    public String formatear(LocalDate fecha) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("d-MM-yyyy");
        return fecha.format(formato);
    }
}
