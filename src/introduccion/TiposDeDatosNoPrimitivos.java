/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

/**
 *
 * @author Lee Brandon
 */
public class TiposDeDatosNoPrimitivos {
    //Permite almacenar y realizar metodos al poner "."
    public static void main(String[] args){
        //Integer
        Integer numero = 12345;
        //Double
        Double decimal = 15.50;
        //String
        String cadena = "Avion";
        //Float, Character, etc.
        System.out.println("=== DATOS NO PRIMITIVOS ===");
        System.out.println("Integer: "+numero);
        System.out.println("Double: "+decimal);
        System.out.println("Cadena I: "+cadena);
        //Al poner "." se abren metodos
        System.out.println("Cadena II: "+cadena.charAt(0));
    }
}
