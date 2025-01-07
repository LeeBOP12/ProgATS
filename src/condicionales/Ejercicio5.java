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
public class Ejercicio5 {
    /*
    Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
    -Si trabaja 40 horas o menos se le paga 16 USD por hora
    -Si trabaja mas de 40 horas se le paga 16 USD por cada una de las primeras 40 horas y 20 USD por cada hora extra.
     */
    public static void main(String[] args) {
        float salarioS;
        int horas;
        horas = Integer.parseInt(JOptionPane.showInputDialog("=== SUELDO DE TRABAJADOR ==="
                + "\nHoras Trabajadas: "));

        if (horas <= 40) {
            salarioS = 16 * horas;
        } else {
            salarioS = (16 * 40) + ((horas - 40) * 20);
        }
        JOptionPane.showMessageDialog(null, "SALARIO FINAL: "+salarioS);
    }
}
