/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polancogonzalez_20250825;

/**
 *
 * @author Dell
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] edades = new int[10];
        int suma = 0;
        int pares = 0;
        int impares = 0;

        // Ingreso de datos
        System.out.println("Ingrese 10 edades:");
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = sc.nextInt();
            suma += edades[i];

            if (edades[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("Cantidad de registros ingresados: " + edades.length);
        System.out.println("Promedio de edades: " + (suma / (double) edades.length));
        System.out.println("Cantidad de edades pares: " + pares);
        System.out.println("Cantidad de edades impares: " + impares);
    }
}
