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
public class Ejercicio17 {
    /*
    Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas. En cada factura figura:
    -El código del articulo
    -Cantidad vendida en litros
    -Precio por litro
    Se pide 5 facturas introducidas: facturación total, cantidad en litros vendidos del articulo 1 y cuantas facturas se emitieron 
    de mas de 600 USD
    */
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        String codigo;
        int litros, litrosAr1=0, conte600=0;
        float precioLitros, sumaFacturae=0, importeFactura=0;
        
        System.out.println("==== FACTURA DESINFECTANTES ====");
        for (int i = 1; i < 6; i++) {
            System.out.print("FACTURA "+i+"\nCodigo Articulo: ");
            codigo = leer.nextLine();
            System.out.print("Cantidad de litros: ");
            litros = Integer.parseInt(leer.nextLine());
            System.out.print("Precio por litro: ");
            precioLitros = Float.parseFloat(leer.nextLine());
            
            importeFactura = (float) precioLitros*litros;
            sumaFacturae+= importeFactura;
            
            if (codigo.equals("1")) {
               litrosAr1+=litros;
            }
            if (importeFactura>600) {
                conte600++;
            }
        }
        System.out.println("\n==== RESUMEN DE FACTURAS ====");
        System.out.println("Facturacion total: "+sumaFacturae);
        System.out.println("Cantidad de litros del Art. 1: "+litrosAr1);
        System.out.println("Facturas mayores a 600 USD: "+conte600);
    }
}
