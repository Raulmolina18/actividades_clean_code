public class CalcularHipotenusa {
    //Ejercicio para calcular la hipotenusa de un triángulo rectángulo a partir de la longitud de sus otros lados  o catetos
    public static void main(String[] args) {
        double longitud = 3;
        double lados = 4;
        double hipotenusa = Math.sqrt((longitud * longitud) + (lados * lados));
        System.out.println("Hipotenusa: " + hipotenusa);
    }
}

//He Cambiado las variables porque no se entendian 
//Y tambien el nombre de la clase para identificar el archivo mejor