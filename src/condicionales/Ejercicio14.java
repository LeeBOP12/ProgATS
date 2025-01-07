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
public class Ejercicio14 {
    /*
    Hacer un programa que pase de kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.
    */
    public static void main (String[] args){
        float kilogramo, conversion;
        int opcion;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              ==== CONVERSION DE KILOGRAMOS ===
                                                              1.Convertir a hecogramo (hg)
                                                              2.Convertir a decagramo (dag)
                                                              3.Convertir a gramo (g)
                                                              4.Convertir a decigramo (dg)
                                                              5.Convertir a centigramo (cg)
                                                              6.Convertir a miligramo (mg)
                                                              7.Salir
                                                              """));
        switch (opcion) {
            case 1:
                kilogramo = Float.parseFloat(JOptionPane.showInputDialog("""
                                                                         --- CONVERTIR A HECTOGRAMOS ---
                                                                         Ingrese kilogramos:
                                                                         """));
                conversion = kilogramo*10;
                JOptionPane.showMessageDialog(null, "Cantidad de hectogramos: "+conversion+" hg");
                break;
            case 2:
            kilogramo = Float.parseFloat(JOptionPane.showInputDialog("""
                                                                         --- CONVERTIR A DECAGRAMOS ---
                                                                         Ingrese kilogramos:
                                                                         """));
                conversion = kilogramo*100;
                JOptionPane.showMessageDialog(null, "Cantidad de decagramos: "+conversion+" hg");
                break;
            case 3:
                kilogramo = Float.parseFloat(JOptionPane.showInputDialog("""
                                                                         --- CONVERTIR A GRAMO ---
                                                                         Ingrese kilogramos:
                                                                         """));
                conversion = kilogramo*1000;
                JOptionPane.showMessageDialog(null, "Cantidad de gramos: "+conversion+" g");
                break;
            case 4:
                kilogramo = Float.parseFloat(JOptionPane.showInputDialog("""
                                                                         --- CONVERTIR A DECIGRAMO ---
                                                                         Ingrese kilogramos:
                                                                         """));
                conversion = kilogramo*10000;
                JOptionPane.showMessageDialog(null, "Cantidad de decigramos: "+conversion+" dg");
                break;
            case 5:
                kilogramo = Float.parseFloat(JOptionPane.showInputDialog("""
                                                                         --- CONVERTIR A CENTIGRAMO ---
                                                                         Ingrese kilogramos:
                                                                         """));
                conversion = kilogramo*100000;
                JOptionPane.showMessageDialog(null, "Cantidad de centigramo: "+conversion+" cg");
                break;
            case 6:
                kilogramo = Float.parseFloat(JOptionPane.showInputDialog("""
                                                                         --- CONVERTIR A MILIGRAMO ---
                                                                         Ingrese kilogramos:
                                                                         """));
                conversion = (float) kilogramo*1000000;
                
                JOptionPane.showMessageDialog(null, "Cantidad de miligramos: "+conversion+" mg");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "< GRACIAS POR SU VISITA >");
            default:
                JOptionPane.showMessageDialog(null, "< OPCION INVALIDA >");
        }
        
    }
}
