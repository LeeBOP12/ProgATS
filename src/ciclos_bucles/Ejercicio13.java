/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio13 {
    /*
    Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num, sumaP=0, sumaN =0, contP=0, contN=0, contC=0;
        float mediaP, mediaN;
        
        System.out.println("==== MEDIA POSI, NEGATIVOS Y CANT CEROS ====");
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese Numero "+(i+1)+": ");
            num = Integer.parseInt(leer.nextLine());
            
            if (num<0) {
                sumaN+=num;
                contN++;
            } else {
                if (num>0) {
                    sumaP+=num;
                    contP++;
                } else {
                    contC++;
                }
            }
        }
        System.out.println("\n==== RESULTADOS ====");
        if (contP==0) {
            System.out.println("< NO HAY NUMEROS POSITIVOS >");
        } else {
            mediaP = (float) sumaP/contP;
            System.out.println("Media Positivos: "+mediaP);
        }
        if (contN==0) {
            System.out.println("< NO HAY NUMEROS NEGATIVOS >");
        } else {
            mediaN = (float) sumaN/contN;
            System.out.println("Media Negativos: "+mediaN);
        }
        System.out.println("Cant. Ceros: "+contC);
        leer.close();
    }
}
