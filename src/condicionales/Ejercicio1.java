/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio1 {
    /*
    Hacer un programa que lea un numero entero y muestre si el numero es múltiplo e 10
    */
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("ESCRIBA UN NUMERO: "));
        
        if (numero%10==0) {
            JOptionPane.showMessageDialog(null, "\n< EL NUMERO "+numero+" ES MULTIPLICO DE 10 >");
        } else {
            JOptionPane.showMessageDialog(null, "\n< EL NUMERO "+numero+" NO ES MULTIPLICO DE 10 >");
        }
    }
}
