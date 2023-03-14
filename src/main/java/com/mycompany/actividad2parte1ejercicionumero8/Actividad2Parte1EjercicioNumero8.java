/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2parte1ejercicionumero8;

import java.util.Scanner;
public class Actividad2Parte1EjercicioNumero8 {

    public static void main(String[] args) {
        int VALCOMP;
        double VALPAG,PDES;
        String COLOR;
        Scanner input = new Scanner(System.in);
        System.out.println("precio de la prenda");
        VALCOMP = input.nextInt();input.nextLine();
        System.out.println("color de la bola");
        COLOR = input.nextLine();
        if(COLOR.equalsIgnoreCase("blanco")){
            PDES = 0;
        }
        else if (COLOR.equalsIgnoreCase("verde")){
           PDES = 10; 
        }
        else if (COLOR.equalsIgnoreCase("amarillo")){
            PDES = 25;
        }
        else if (COLOR.equalsIgnoreCase("azul")){
            PDES = 50;
        }
        else{
            PDES = 100;
        }
        VALPAG = VALCOMP-(PDES*VALCOMP/100);
        System.out.println("el cliente debe pagar: $"+VALPAG);
    }
}
