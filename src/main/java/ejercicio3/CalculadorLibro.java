package ejercicio3;

public class CalculadorLibro extends CalculadorPrecio {

    public CalculadorLibro() {
        //super(0.1, 0.1, false);
        this.impuestos = 0.1;
        this.descuentos = 0.1;
    }

    @Override
    public void establecerBases(double precioBase) {
        envioGratis(precioBase);
    }

    private void envioGratis(double precio) {
        if (precio > 100){
            envioGratis = true;
        }
    }
}
