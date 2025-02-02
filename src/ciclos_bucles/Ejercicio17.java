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
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String codigo;
        int cantiadL, facturasM600=0;
        float precioL, facturaT=0, importeF, litrosAr1=0;

        System.out.println("==== FACTURA DESINFECTANTES ====");
        for (int i = 0; i < 5; i++) {
            System.out.print("FACTURA "+(i+1)+"\nCodigo: ");
            codigo = leer.nextLine();
            System.out.print("Cantidad de litros: ");
            cantiadL = Integer.parseInt(leer.nextLine());
            System.out.print("Precio por litro: ");
            precioL = Float.parseFloat(leer.nextLine());
            
            importeF = (float) cantiadL*precioL;
            facturaT+= importeF;
            
            if (codigo.equals("1")) {
                litrosAr1+= cantiadL;
            }
            if (importeF>600) {
                facturasM600++;
            }
        }
        System.out.println("\n==== RESUMEN DE FACTURAS ====");
        System.out.println("Facturacion total: "+facturaT);
        System.out.println("Litros vendidos en articulo 1: "+litrosAr1);
        System.out.println("Facturas mayores a 600: "+facturasM600);
    }
}
