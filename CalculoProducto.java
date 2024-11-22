public class CalculoProducto {
    //Ejercicio para calcular el precio total de la compra dado el precio de los productos y los descuentos e impuestos.
    public static void main(String[] args) {
        double[] precioProducto = {100.0, 50.0, 25.0}; // precios de productos
        double impuesto = 0.08; // impuestos
        double descuento = 0.1;  // descuento
        double Total = 0;

        for (double precio : precioProducto) {
            Total += precio * (1 + impuesto) * (1 - descuento);
        }

        System.out.println("Total: " + Total);
    }
}

//He Cambiado las variables porque no se entendian 
//Y tambien el nombre de la clase