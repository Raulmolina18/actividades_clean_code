public class ComparacionRadio {
    //Ejercicio para comprobar si el área de dos círculos dados sus radios es igual
    public static void main(String[] args) {
        double radio1 = 3.0;
        double radio = 3.0;
        boolean igual = calcular(radio1, radio);
        if (igual) {
            System.out.println("Igual");
        } else {
            System.out.println("Diferente");
        }
    }

    private static boolean calcular(double area, double base) {
        return Math.PI * area * area == Math.PI * base * base;
    }
}

//HE CAMBIADO EL NOMBRE DE LAS VARIABLES PARA QUE SEA MAS COMODO DE ENTENDER 

//HE CAMBIADO EL NOMBRE DE LA CLASE 
