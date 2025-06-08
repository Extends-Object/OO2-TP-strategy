package ejercicio2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        var formatoCorto = new FormatoCorto();
        var formatoLargo = new FormatoLargo();

        var p1 = new Persona(LocalDate.of(1994, 4, 19), formatoCorto);
        var p2 = new Persona(LocalDate.of(1994, 4, 19), formatoLargo);

        System.out.printf("Fecha nacimiento p1: " + p1.fechaNacimiento() + "\n");
        System.out.printf("Fecha nacimiento p2: " + p2.fechaNacimiento() + "\n");
    }
}
