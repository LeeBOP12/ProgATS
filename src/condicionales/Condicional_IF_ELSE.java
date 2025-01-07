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
public class Condicional_IF_ELSE {
    /*
    CONDICIONALES : 
    "||" --> o, && = y 
    ">"  --> mayor
    "<"  --> menor
    ">=" --> mayor igual
    "<=" --> menor igual
    "==" --> igual 
    "!=" --> diferente
    
    if (condicion){
     Instruccion1
    } else {
     Instruccion2
    }
    *Si se cumple o no la condicion se hace una o la contra (else)
    */
    
    public static void main(String[] args) {
      int condicion, num = 10;
      
      condicion = Integer.parseInt(JOptionPane.showInputDialog("=== NUMERO IGUAL A 5 =="
              + "\nNumero: "));
      if (condicion==5 || condicion==-5){
          JOptionPane.showMessageDialog(null, "\n< EL NUMERO ES IGUAL A ± 5 >"); //Instruccion 1
      }else{
          JOptionPane.showMessageDialog(null, "\n< EL NUMERO NO ES 5 >"); //Instruccion 2
      }
    }
}
