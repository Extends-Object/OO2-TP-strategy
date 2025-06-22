package ejercicio3;

public abstract class CalculadorPrecio {

    protected double impuestos;
    protected double descuentos;
    protected boolean envioGratis;


    public CalculadorPrecio() {
        this.impuestos = 0;
        this.descuentos = 0;
        this.envioGratis = false;
    }

    public double calcularPrecio(double precioBase){
        establecerBases(precioBase);
        double total = precioBase * (1 + impuestos) * (1 - descuentos);
        if(envioGratis){
            total -= 10;
        }
        return total;
    }

    public abstract void establecerBases(double precioBase);
}
