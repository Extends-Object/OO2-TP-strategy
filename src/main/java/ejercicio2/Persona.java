package ejercicio2;

import java.time.LocalDate;

public class Persona {

    private LocalDate fechaNacimiento;
    private Formateador formateador;

    public Persona(LocalDate fechaNacimiento, Formateador formateador) {
        this.fechaNacimiento = fechaNacimiento;
        this.formateador = formateador;
    }

    public String fechaNacimiento(){
        return this.formateador.formatear(fechaNacimiento);
    }
}
