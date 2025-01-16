/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int puntuacion;
        String mensaje;
        Scanner lector = new Scanner(System.in);

        System.out.println("ingrese puntuacion");
        puntuacion = lector.nextInt();

        switch (puntuacion) {

            case 0, 1, 2, 3, 4:
                mensaje = "descartado";
                break;
            case 5:
                mensaje = "en suspenso";
                break;
            case 6:
                mensaje = "aceptable";
                break;
            case 7, 8:
                mensaje = "notable";
                break;
            case 9, 10:
                mensaje = "sobresaliente";
                break;
            default:
                mensaje = "puntuación invalida";

        }
        System.out.println("tu puntuacion es : " + mensaje.toUpperCase());

    }

}
