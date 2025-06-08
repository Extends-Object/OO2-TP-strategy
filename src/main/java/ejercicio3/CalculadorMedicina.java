package ejercicio3;

public class CalculadorMedicina extends CalculadorPrecio {

    public CalculadorMedicina() {
        //super(0, 0, false);
    }

    @Override
    public void establecerBases(double precioBase) {
        descuento(precioBase);
        envioGratis(precioBase);
    }

    private void descuento(double precioBase){
        if (precioBase > 50) {
            descuentos = 0.1;
        }
    }

    private void envioGratis(double precioBase) {
        if (precioBase > 100) {
            envioGratis = true;
        }
    }
}
