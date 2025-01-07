/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio2 {
    /*
    Pedir dos números y decir cual es el mayor o si son iguales
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float n1, n2;

        n1 = Float.parseFloat(JOptionPane.showInputDialog("=== NUMERO MAYOR O IGUALES ==="
                + "\nPrimer Numero: "));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Segundo Numero: "));
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "< EL NUMERO " + n1 + " ES MAYOR QUE " + n2 + " >");
        } else if (n1 < n2) {
            JOptionPane.showMessageDialog(null, "< EL NUMERO " + n2 + " ES MAYOR QUE " + n1 + " >");
        } else {
            JOptionPane.showMessageDialog(null, "< EL NUMERO " + n1 + " Y " + n2 + " SON IGUALES >");
        }
        leer.close();
    }
}
