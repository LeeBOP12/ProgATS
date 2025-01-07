/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ciclos_bucles;

import java.util.Scanner;

/**
 *
 * @author Lee Brandon
 */
public class Ejercicio18 {
    /*
    Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro. Solo existen tres productos con precios:
    -0.6 USD / litro
    -3 USD / Litro
    -1.25 USD / Litro
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int codigo, cantLitros, opcion, litrosAr1 = 0, facturaM600=0;
        float precioLitro, facturaT = 0, importeF;
        
        System.out.println("===== FACTURAS DE FERTILIZANTES ====");
        for (int i = 0; i < 5; i++) {
            System.out.print("Factura "+(i+1)+"\nCodigo: ");
            codigo = Integer.parseInt(leer.nextLine());
            System.out.print("Cantidad de litros: ");
            cantLitros = Integer.parseInt(leer.nextLine());
            System.out.print("Precio por litro:\n- 0.6 USD\n- 3 USD\n- 1.25 USD\nIndique una opcion: ");
            opcion = Integer.parseInt(leer.nextLine());
            switch (opcion) {
                case 1 -> precioLitro= 0.6f;
                case 2 -> precioLitro = 3f;
                case 3 -> precioLitro = 1.25f;
                default -> {
                    System.out.println("< OPCION INVALIDA >");
                    return;
                }
            }
            importeF = (float) cantLitros*precioLitro;
            facturaT+= importeF;
            if (codigo==1) {
                litrosAr1+= cantLitros;
            }
            if (importeF>600) {
                facturaM600++;
            }
        }
        System.out.println("\n===== RESUMEN DE FACTURAS ====");
        System.out.println("Facturacion total: "+facturaT);
        System.out.println("Litros de articulo 1: "+litrosAr1);
        System.out.println("Facturas mayores a 600: "+facturaM600);
        leer.close();
    }
}
