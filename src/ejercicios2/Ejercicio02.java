/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        int numero, decena, unidad;
        String UR, DR;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el numero a convertir en romanos(1-50)");
        numero = lector.nextInt();

        unidad = (numero % 10);
        decena = (numero / 10);
        
        switch (numero) {
            case 1:
                unidad = (numero % 10);
                System.out.println("I");
            case 2:
                unidad = (numero % 10);
                System.out.println("II");
            case 3:
                unidad = (numero % 10);
                System.out.println("III");
            case 4:
                unidad = (numero % 10);
                System.out.println("IV");
            case 5:
                unidad = (numero % 10);
                System.out.println("V");
            case 6:
                unidad = (numero % 10);
                System.out.println("VI");
            case 7:
                unidad = (numero % 10);
                System.out.println("VII");
            case 8:
                unidad = (numero % 10);
                System.out.println("VIII");
            case 9:
                unidad = (numero % 10);
                System.out.println("IX");

        }
        switch (numero) {
            case 10:
                decena = (numero / 10);
                System.out.println("X");
            case 20:
                decena = (numero / 10);
                System.out.println("XX");
            case 30:
                decena = (numero / 10);
                System.out.println("XXX");
            case 40:
                decena = (numero / 10);
                System.out.println("XL");
            case 50:
                decena = (numero / 10);
                System.out.println("L");

        }

    }
}
