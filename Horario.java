public class Horario {
    //Ejercicio para validar la hora dada
    public static void main(String[] args) {
        int hora = 25;
        int minutos = 61;

        if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59) {
            System.out.println("Hora valida");
        } else {
            System.out.println("Hora invalida");
        }
    }
}
//he ordenado el if y else que estaban al reves 
//Y tambien el nombre de la clase para identificar el archivo mejor