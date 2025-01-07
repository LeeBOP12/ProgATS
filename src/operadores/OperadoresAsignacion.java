/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

/**
 *
 * @author Lee Brandon
 */
public class OperadoresAsignacion {
    //Usamos el +=, -=, *= o el %= y cambiar el valor del numero o operarlo
    //Al incrementar uno por uno usamos ++ y si restamos --;
    
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Numero Inicial: "+num);
        num+=5;
        System.out.println("Numero Adicionado: "+num);
        num*=2;
        System.out.println("Numero Multiplicado: "+num);
        
        int num2 = 15;
        num2++;
        System.out.println("Segundo Numero aumentado en 1: "+num2);
        
        num = num2++; //Primero se le asigna el valor del numero 2 y luego el incremento
        System.out.println("Primer Numero igual al segundo: "+num);
        System.out.println("Segundo numero aumentado: "+num2);
    }
}
