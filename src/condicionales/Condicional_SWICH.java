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
public class Condicional_SWICH {
    /*
    swich (dato) {
    case 1 : Instruccion1;
             break;
    case 2 : Instruccion1;
             break;
    case 3 : Instruccion1;
             break;
    case 4 : Instruccion1;
             break;
    default : Si no se cumplen los casos
    }
    Mayormente se usan en SUBMENUS o cuando se tratan en OPCIONES
    */
    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO: "));
        
        switch (dato) {
            case 1:
                JOptionPane.showMessageDialog(null, "El numero es 1");
                break; //sale del caso cuando se cumple, obligatorio
            case 2:
                JOptionPane.showMessageDialog(null, "El numero es 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El numero es 3");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El numero es 4");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "El numero es 5");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El numero no esta en el rango de 1-5");
        }
    }
}
