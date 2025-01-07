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
public class Ejercicio7 {

    /*
    Pedir 3 numeros y mostrarlos ordenados de mayor a menor
     */
    public static void main(String[] args) {
        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("=== ORDENAR NUMEROS DE MAYOR A MENOR ==="
                + "\nA: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("B:"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("C:"));

        if ((n1 > n2) && (n2 > n3)) {
            JOptionPane.showMessageDialog(null,"Orden: " + n1 + "-" + n2 + "-" + n3);
        } else if (n1 > n3 && n3 > n2) {
            JOptionPane.showMessageDialog(null,"Orden: " + n1 + "-" + n3 + "-" + n2);
        } else if (n2 > n1 && n1 > n3) {
            JOptionPane.showMessageDialog(null,"Orden: " + n2 + "-" + n1 + "-" + n3);
        } else if (n2 > n3 && n3 > n1) {
            JOptionPane.showMessageDialog(null,"Orden: " + n2 + "-" + n3 + "-" + n1);
        } else if (n3 > n1 && n1 > n2) {
            JOptionPane.showMessageDialog(null,"Orden: " + n3 + "-" + n1 + "-" + n2);
        } else {
            JOptionPane.showMessageDialog(null,"Orden: " + n3 + "-" + n2 + "-" + n1);
        }
    }
}
