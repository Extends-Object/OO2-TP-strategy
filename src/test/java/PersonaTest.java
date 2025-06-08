import ejercicio2.FormatoCorto;
import ejercicio2.FormatoLargo;
import ejercicio2.Persona;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaTest {

    private Persona p1;
    private Persona p2;
    FormatoCorto formatoCorto;
    FormatoLargo formatoLargo;
    LocalDate fecha;

    @BeforeEach
    public void setUp() {

        formatoCorto = new FormatoCorto();
        formatoLargo = new FormatoLargo();

        fecha = LocalDate.of(1994, 4, 19);

        p1 = new Persona(fecha, formatoCorto);
        p2 = new Persona(fecha, formatoLargo);
    }

    @Test
    public void formatoCortoTest() {
        assertEquals("19-04-1994", p1.fechaNacimiento());
    }

    @Test
    public void formatoLargoTest() {
        assertEquals("19 de abril de 1994", p2.fechaNacimiento().toLowerCase());
        //toLowerCase por el Locale
    }
}