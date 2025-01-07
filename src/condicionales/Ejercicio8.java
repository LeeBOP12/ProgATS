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
public class Ejercicio8 {

    /*
    Pedir un numero entre 0 y 99 999 y decir cuantas cifras tiene
     */
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("=== CIFRAS DE UN NUMERO ==="));

        if (numero > 0 && numero < 100000) {
            if (numero < 10) {
                JOptionPane.showMessageDialog(null, "El numero tiene 1 cifra");
            } else if (numero < 100) {
                JOptionPane.showMessageDialog(null, "El numero tiene 2 cifras");
            } else if (numero < 1000) {
                JOptionPane.showMessageDialog(null, "El numero tiene 3 cifras");
            } else if (numero < 10000) {
                JOptionPane.showMessageDialog(null, "El numero tiene 4 cifras");
            } else {
                JOptionPane.showMessageDialog(null, "El numero tiene 5 cifra");
            }
        } else {
            JOptionPane.showMessageDialog(null, "< NO ESTA DENTRO DEL RANGO DE [0 - 99 999]");
        }
    }
}
