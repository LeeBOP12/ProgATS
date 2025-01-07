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
public class Ejercicio6 {
    /*
    Hacer un programa que tome dos números y diga si ambos son pares o impares
    */
    public static void main(String[] args) {
        float n1, n2;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("==== NUMEROS PARES O NO ===="
                + "\nNumero 1:"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2:"));
        
        if (n1%2==0 && n2%2==0) {
            JOptionPane.showMessageDialog(null, "AMBOS NUMEROS SON PARES");
        } else if (n1%2!=0 && n2%2!=0) {
                JOptionPane.showMessageDialog(null, "AMBOS NUMEROS SON IMPARES");
            } else {
                JOptionPane.showMessageDialog(null, "UN NUMERO ES PAR Y EL OTRO IMPAR");
        }
    }
}
