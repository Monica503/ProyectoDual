package es.vedruna;

public class Positivo {
    //Este metodo cuenta cuantos positivos ha ingresado el usuario por medio de un bucle,
    //El bucle parara hasta que se introduzca un 0
    public static int contarPositivos(int[] numeros) {
        int contador = 0;
        for (int numero : numeros) {
            if (numero == 0) {
                break;
            }
            if (numero > 0) {
                contador++;
            }
        }
        System.out.println("Ingresaste " + contador + " numeros positivos");
        return contador;
    }
}
