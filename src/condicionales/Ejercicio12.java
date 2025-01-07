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
public class Ejercicio12 {
    /*
    Pedir una nota de 0-20 y mostrarla de la forma: insuficiente, suficiente, bien, notable y sobresaliente.
     */

    public static void main(String[] args) {
        float nota;

        nota = Float.parseFloat(JOptionPane.showInputDialog("""
                                           ==== NOTA DE ESTUDIANTE ===
                                           Ingrese la nota [0-20]:                 
                                           """));
        if (nota < 0 || nota > 20) {
            JOptionPane.showMessageDialog(null, "< NO ES UNA NOTA VALIDA >");
        } else if (nota <= 12) {
            JOptionPane.showMessageDialog(null, "< NOTA INSUFICIENTE >");
        } else if (nota <= 14) {
            JOptionPane.showMessageDialog(null, "< SUFICIENTE >");
        } else if (nota <= 17) {
            JOptionPane.showMessageDialog(null, "< BIEN >");
        } else if (nota <= 18) {
            JOptionPane.showMessageDialog(null, "< NOTABLE >");
        } else {
            JOptionPane.showMessageDialog(null, "< SOBRESALIENTE >");
        }
    }
}
