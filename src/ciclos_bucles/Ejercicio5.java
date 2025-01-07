package ciclos_bucles;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lee Brandon
 */
public class Ejercicio5 {

    /*
    Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre 0-100 y luego ir pidiendo números 
    indicando "es mayor", o "es menor", según sea mayor o menor con respecto a N. El proceso se termina cuando el usuario acierta 
    y mostrar el numero de intentos.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, aleatorio, con = 0;

        aleatorio = (int) (Math.random() * 100) + 1;
        System.out.println("=== ADIVINA EL NUMERO ===");
        do {
            System.out.print("Ingrese Nunero: ");
            num = Integer.parseInt(leer.nextLine());
            con++;
            if (num < aleatorio) {
                System.out.println("< ES MAYOR >");
            } else if (num > aleatorio) {
                System.out.println("< ES MENOR >");
            } else {
                System.out.println("\n< ADIVINASTE :D, # INTENTOS: " + con + " >");

            }
        } while (num != aleatorio);
    }
}
