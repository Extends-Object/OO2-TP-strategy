package ejercicio3;

class Producto {

    private double precioBase;
    private CalculadorPrecio calculador;

    public Producto(double precio, CalculadorPrecio calculador) {
        //Neesito el tipo si ya tengo el calculador?
        //this.tipo = tipo;
        this.precioBase = precio;
        this.calculador = calculador;
    }

    public double precioFinal() {
        return calculador.calcularPrecio(precioBase);
    }


//      QUE PASA CON EL TIPO? ---> El comportamiento de calculo ya está encapsulado en el calculador y Producto
//                                 no necesita saber de qué tipo es

}
