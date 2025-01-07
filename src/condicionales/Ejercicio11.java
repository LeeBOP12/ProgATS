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
public class Ejercicio11 {
    /*
    Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas 
    básicas (suma, resta, producto y división) con valores numéricos enteros. El usuario debe especificar la operación con el primer 
    carácter del primer parámetro de la linea de comandos: 'S' o 's' para la suma, 'R' o 'r' para la resta, 'P', 'p', 'M' o 'm' para el 
    producto y el 'D' o 'd' para la división.
    */
    public static void main(String[] args) {
        float n1, n2, suma, resta, multi, division;
        char operacion;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("=== CALCULADORA BASICA ==="
                + "\nNumero 1:"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Numero 2:"));
        
        operacion = JOptionPane.showInputDialog("""
                                                INDIQUE OPERACION:
                                                -Suma
                                                -Resta
                                                -Multiplicacion
                                                -Division
                                                """).charAt(0);     
        switch (operacion) {
            case 's','S' -> {
                suma = n1 + n2;
                JOptionPane.showMessageDialog(null, "Resultado de operacion: "+suma);
            }
            case 'R','r' -> {
                resta = n1 - n2;
                JOptionPane.showMessageDialog(null, "Resultado de operacion: "+resta);
            }
            case 'M','m','p','P' -> {
                multi = n1*n2;
                JOptionPane.showMessageDialog(null, "Resultado de operacion: "+multi);
            }
            case 'D','d' -> {
                division = n1/n2;
                JOptionPane.showMessageDialog(null, "Resultado de operacion: "+division);
            }
            default -> JOptionPane.showMessageDialog(null, "< OPERACION INVALIDA >");
        }
    }
}
