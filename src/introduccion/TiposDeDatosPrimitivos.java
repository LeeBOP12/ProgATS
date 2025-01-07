/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package introduccion;

/**
 *
 * @author Lee Brandon
 */
public class TiposDeDatosPrimitivos {
    //LOS DATOS NO PRIMITIVOS NO PERMITEN REALIZAR METODOS AL PONER "." 
    public static void main(String[] args) {
        //byte = 8 bits
        byte enterop = -128;
        //short = 16 bits
        short enterom = 12345;
        //int = 32 bits
        int entero = 12345678;
        //long = 64 bits
        long largo = 12834567899999999l;
        //float = 32 bits
        float decimal = 14.25f;
        //double = 64 bits
        double real = 4788.8888;
        //char = 19 bits
        char caracter = 'A';
        //boolean = 1 bit
        boolean verdadero = true;
        System.out.println("====== TIPO DE DATOS PRIMITIVOS =====");
        System.out.println("Numero Byte: "+enterop);
        System.out.println("Numero Short: "+enterom);
        System.out.println("Numero Int: "+entero);
        System.out.println("Numero Long: "+largo);
        System.out.println("Numero Float: "+decimal);
        System.out.println("Numero Double: "+real);
        System.out.println("Caracter: "+caracter);
        System.out.println("Booleano: "+verdadero);
    }
}
