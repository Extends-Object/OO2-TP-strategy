package ejercicio3;

public class Main {
    public static void main(String[] args) {

        var libro = new Producto(30, new CalculadorLibro());
        var medicina = new Producto(330, new CalculadorMedicina());
        var alimento = new Producto(130, new CalculadorAlimento());
        var otro = new Producto(130, new CalculadorOtro());

//        var p1 = new Producto(TipoProducto.LIBRO, 30);
//        var p2 = new Producto(TipoProducto.MEDICINA, 330);
//        var p3 = new Producto(TipoProducto.ALIMENTO, 130);
//        var p4 = new Producto(TipoProducto.OTRO, 130);

        System.out.println(libro.precioFinal());
        System.out.println(medicina.precioFinal());
        System.out.println(alimento.precioFinal());
        System.out.println(otro.precioFinal());
    }
}
