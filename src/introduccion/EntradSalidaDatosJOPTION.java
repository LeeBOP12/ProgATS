/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class EntradSalidaDatosJOPTION {
    
    public static void main (String[] args){
        int entero;
        float decimal;
        String cadena;
        Character caracter;
        
        entero = Integer.parseInt(JOptionPane.showInputDialog("==== INGRESE VALORES ====\nIngrese Entero: "));
        decimal = Float.parseFloat(JOptionPane.showInputDialog("Numero decimal: "));
        cadena = JOptionPane.showInputDialog("Cadena: ");
        caracter = JOptionPane.showInputDialog("Cadena: ").charAt(0);
        
        JOptionPane.showMessageDialog(null, "=== VALORES INGRESADOS ===="
                + "\nEntero: "+entero
                + "\nDecimal: "+decimal
                + "\nCadena: "+cadena
                + "\nCaracter: "+caracter);
    }
}
