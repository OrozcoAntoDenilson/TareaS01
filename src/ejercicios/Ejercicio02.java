/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Ejercicio02 {

    public static void main(String[] args) {
        double dolar, euro, soles, valor, valorF = 0;
        String convertir;
        Scanner lector = new Scanner(System.in);

        System.out.println("convertir:");
        System.out.println("1.soles a dolar");
        System.out.println("2.soles a euro");
        System.out.println("3.ninguno");
        convertir = lector.nextLine();

        System.out.println("ingrese su valor");
        valor = lector.nextDouble();
        switch (convertir) {
            case "1":
                valorF = (valor / 3.82);
                break;
            case "2":
                valorF = (valor / 4.17);
                break;
            default:
                System.out.println("intente denuevo");

        }
        System.out.println("su valor es: " + valorF);

    }
}
