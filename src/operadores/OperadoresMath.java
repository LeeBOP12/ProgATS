/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class OperadoresMath {
    /*
    TODOS LOS MATHS SE USAN DECLARANDO UNA VARIABLE DOUBLE, SI QUEREMOS CONVERTIRLO A OTRO NUMERO USAMOS "(TD)"
    Math.sqrt : Sacar raiz cuadrada
    Math.pow : Elevar un numero
    Math.round : Redondear un numero
    Math.random : Numero random (multiplicar por multiplo de 10)
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        float num1,base, exponente,num2, raiz, potenciacion, random;
        int redondeo, max;
        System.out.println("=== OPERACIONES AVANZADAS ===");
        System.out.print("Raiz de un numero: ");
        num1 = Float.parseFloat(leer.nextLine());
        System.out.print("Base: ");
        base = Float.parseFloat(leer.nextLine());
        System.out.print("Exponente: ");
        exponente = Float.parseFloat(leer.nextLine());
        System.out.print("Redondear Numero: ");
        num2 = Float.parseFloat(leer.nextLine());
        
        
        raiz = (float) Math.sqrt(num1); //Convertimos a float y sacamos raiz
        potenciacion = (float) Math.pow(base, exponente); //Base y exponente
        redondeo = Math.round(num2); //redondeamos
        random = (int) (Math.random()*10)+1; //numero random del 1-10
        
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Raiz: "+raiz);
        System.out.println("Potenciacion: "+potenciacion);
        System.out.println("Redondeo: "+redondeo);
        System.out.println("# Random: "+random);
    }
}
