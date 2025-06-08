package ejercicio3;

public class CalculadorOtro extends CalculadorPrecio {


    public CalculadorOtro() {
        //super(0.15, 0, false);
        this.impuestos = 0.15;
    }

    @Override
    public void establecerBases(double precioBase) {
        descuento(precioBase);
        envioGratis(precioBase);
    }

    private void descuento(double precioBase){
        if (precioBase > 50) {
            descuentos = 0.05;
        }
    }

    private void envioGratis(double precioBase) {
        if (precioBase > 200) {
            envioGratis = true;
        }
    }
}
