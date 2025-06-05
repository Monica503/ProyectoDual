package es.vedruna;

import java.util.Scanner;

import static es.vedruna.Positivo.contarPositivos;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[100]; // Asumimos que el usuario no ingresará más de 100 números
        int numero;
        int i = 0;

        // Pedimos números hasta que el usuario ingrese 0
        do {
            System.out.print("Introduce un numero: ");
            numero = scan.nextInt();
            numeros[i] = numero;
            i++;
        } while (numero != 0 && i < numeros.length);
        Positivo.contarPositivos(numeros);
    }
}