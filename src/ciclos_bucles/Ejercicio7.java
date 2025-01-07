/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio7 {

    /*
    Pedir números hasta que se introduzca uno negativo y calcular la media
     */
    public static void main(String[] args) {
        int num, cont = 0, suma = 0;
        float media;

        num = Integer.parseInt(JOptionPane.showInputDialog("""
                                    ==== MEDIA DE NUMEROS POSI ====
                                    Digite Numero: 
                                    """));

        while (num >= 0) {
            
            suma += num;
            cont++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        if (cont == 0) {
            JOptionPane.showMessageDialog(null, "< NO SE INGRESARON NUMEROS POSITIVOS >");
        } else {
            media =(float) suma / cont;
            JOptionPane.showMessageDialog(null, "< MEDIA DE NUMEROS INGRESADOS : " + media + " >");
        }

    }
}
