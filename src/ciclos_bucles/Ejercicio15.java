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
public class Ejercicio15 {
    /*
    Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18
    años y la cantidad de alumnos que miden mas de 1.75
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int edad, sumaEdad=0, mayores18=0, mayores175=0;
        float estatura, sumaEstatura=0, mediaE=0, mediaT=0;
        
        System.out.println("==== EDADES Y ALTURAS ====");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+".Digite edad: ");
            edad = Integer.parseInt(leer.nextLine());
            System.out.print((i+1)+".Digite estatura: ");
            estatura = Float.parseFloat(leer.nextLine());
            
            sumaEdad+=edad;
            sumaEstatura+=estatura;
            
            if (edad>18) {
                mayores18++;
            }
            if (estatura>1.75) {
                mayores175++;
            }
        }
        mediaE = (float) sumaEdad/5;
        mediaT = (float) sumaEstatura/5;
        
        System.out.println("\n==== DATOS RESUMIDOS ====");
        System.out.println("Edad media: "+mediaE);
        System.out.println("Estatura media: "+mediaT);
        System.out.println("Alumnos mayores a 18: "+mayores18);
        System.out.println("Alumnos mayores a 1.75 cm: "+mayores175);
        leer.close();
    }
}
