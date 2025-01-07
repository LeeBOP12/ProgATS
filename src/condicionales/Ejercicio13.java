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
public class Ejercicio13 {
    /*
    Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
    1.Ingresar opcion a la cuenta
    2.Retirar opcion de la cuenta
    3.Salir
    */
    public static void main (String[] args){
        float dineroI, dineroR, saldoF;
        int opcion;
        final int saldoI = 1000;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                             ==== CAJERO AUTOMATICO ===
                                             1.Ingresar dinero a la cuenta
                                             2.Reitrar dinero de la cuenta
                                             3.Salir
                                             Indique una opcion:
                                             """));
        
        switch (opcion) {
            case 1:
                dineroI = Integer.parseInt(JOptionPane.showInputDialog("Dinero a agregar: "));
                saldoF = saldoI+dineroI;
                JOptionPane.showMessageDialog(null, "Saldo actual: "+saldoF);
                break;
            case 2:
                dineroR = Integer.parseInt(JOptionPane.showInputDialog("Dinero a retirar:"));
                if (dineroR>1000) {
                    JOptionPane.showMessageDialog(null, "< SALDO INSUFICIENTE >");
                } else {
                    saldoF = saldoI - dineroR;
                    JOptionPane.showMessageDialog(null, "Nuevo saldo: "+saldoF);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "< GRACIAS POR SU VISITA >");
                break;
            default:
                JOptionPane.showMessageDialog(null, "< OPCION INVALIDA >");
        }
    }
}
