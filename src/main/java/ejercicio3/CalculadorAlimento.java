package ejercicio3;

public class CalculadorAlimento extends CalculadorPrecio {

    public CalculadorAlimento() {
        //super(0.05, 0, false);
        this.impuestos = 0.05;
    }

    @Override
    public void establecerBases(double precioBase) {
        descuento(precioBase);
        envioGratis(precioBase);
    }

    private void descuento(double precioBase){
        if (precioBase > 100) {
            descuentos = 0.15;
        }
    }

    private void envioGratis(double precioBase) {
        if (precioBase > 200) {
            envioGratis = true;
        }
    }
}
