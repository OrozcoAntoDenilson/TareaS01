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
public class Ejercicio01 {
    public static void main(String[] args) {
        int nota;
        String mencion="";
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese la nota del alumno");
        nota = lector.nextInt();
        
        mencion=switch(nota){
            case 0,1,2,3,4,5,6,7,8,9,10,11,12->"deficiente";
            case 13,14,15->"regular";
            case 16,17,18->"bueno";
            case 19,20->"excelente";
            default->"";
        
        };
        System.out.println("usted tuvo la mencion: " +mencion.toUpperCase());
    }
}
