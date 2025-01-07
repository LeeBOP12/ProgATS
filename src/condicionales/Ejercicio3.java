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
public class Ejercicio3 {
    /*
    Hacer un programa que lea un carácter por teclado y compruebe si es una letra mayuscula
    */
    public static void main(String[] args) {
        char caracter;
        
        caracter = JOptionPane.showInputDialog("DIGITE UN CARACTER:").charAt(0);
        if (Character.isUpperCase(caracter)) {
            JOptionPane.showMessageDialog(null, "\n< EL CARACTER ESTA EN MAYUSCULA >");
        } else {
            JOptionPane.showMessageDialog(null, "\n< EL CARACTER NO ESTA EN MAYUSCULA >");
        }
    }
}
