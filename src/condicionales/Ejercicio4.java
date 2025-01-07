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
public class Ejercicio4 {
    /*
    En MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los 300 USD 
    ¿Cuál será la cantidad que pagara una persona por su compra?
    */
    public static void main(String[] args) {
        float compra, pagoF;
        
        compra = Float.parseFloat(JOptionPane.showInputDialog("=== BIENVENIDO A MEGAPLAZA ==="
                + "\nCompra Total: "));
        
        if (compra>300) {
            pagoF = compra*0.8f; //Si supera los 300 se hace el descuento
        } else {
            pagoF = compra;
        }
        JOptionPane.showMessageDialog(null, "PAGO FINAL: "+pagoF);
    }
}
