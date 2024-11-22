public class PromedioNumeros {
    //Ejercicio para calcular el promedio de una lista de números dada e imprimirlo por pantalla
        public static void main(String[] args) {
        double[] numeros = {4, 5, 6, 7};
        double sumar = 0;
        for (double numero : numeros) {
            sumar += numero;
        }
        double promedio = sumar / numeros.length;
        System.out.println("Promedio: " + promedio);
    }
}
//He Cambiado las variables porque no se entendian 
//Y tambien el nombre de la clase para identificar el archivo mejor
