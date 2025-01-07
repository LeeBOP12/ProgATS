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
public class Ejercicio10 {
    /*
    Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con
    meses de 28, 30 y 31 días. Sin años bisiestos
    28 : Febrero
    30 : Abril, Junio, Setiembre y Noviembre
    31 : Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre
     */
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("""
                                                           === DIA, MES Y AÑO ===
                                                           Digite el dia: """));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));

        if (año > 0) { // Verificar si el año es correcto
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12: // Meses con 31 días
                    if (dia >= 1 && dia <= 31) {
                        JOptionPane.showMessageDialog(null, "< FECHA CORRECTA >");
                    } else {
                        JOptionPane.showMessageDialog(null, "< DIA INCORRECTO >");
                    }
                    break;
                case 4, 6, 9, 11: // Meses con 30 días
                    if (dia >= 1 && dia <= 30) {
                        JOptionPane.showMessageDialog(null, "< FECHA CORRECTA >");
                    } else {
                        JOptionPane.showMessageDialog(null, "< DIA INCORRECTO >");
                    }
                    break;
                case 2: // Febrero con 28 días
                    if (dia >= 1 && dia <= 28) {
                        JOptionPane.showMessageDialog(null, "< FECHA CORRECTA >");
                    } else {
                        JOptionPane.showMessageDialog(null, "< DIA INCORRECTO >");
                    }
                    break;
                default: // Mes inválido
                    JOptionPane.showMessageDialog(null, "< MES INCORRECTO >");
            }
        } else {
            JOptionPane.showMessageDialog(null, "< AÑO INCORRECTO >");
        }
    }
}
