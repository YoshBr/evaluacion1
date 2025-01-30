/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg3.practica.evaluada;

import javax.swing.JOptionPane;

/**
 *
 * @author bryan
 */
public class Semana3PracticaEvaluada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Una empresa necesita determinar el monto total que debe pagar a la caja costarricense del seguro social (CCSS). 
        //Para esto se requiere un programa que calcule dicho monto basado en el salario para un empleado especifico. 
        //El programa debe solicitar el salario individual y calcular el monto total a pagar aplicando los siguiente rubros:
        //1-seguro de enfermedad y maternidad (SEM) al 9.25% del salario.
        //2-Invalidez, vejez y muerte (IVM) al 5.08% del salario
        //Por ejemplo si el salario de un empleado es de 300.000
        //300000 x 0.0925 = 27.750(monto de sem)
        //300000 x 0.0508= 15.240(monto de IVM)
        //En consecuencia, la empresa debera pagar a la CCSS un total de 42990
        // Resultado esperado para el programa:
        //La empresa debera a la ccss el mono de """" por concepto de SEM y IVM
            double salario =0.0;
            double sem =0.0;
            double ivm =0.0;
            double total =0.0;

        // Solicitamos el salario al empleado
        String salarioTexto = JOptionPane.showInputDialog("Ingrese el salario del empleado:");
        salario = Double.parseDouble(salarioTexto); // Convertir double

        // Calculamos el SEM e IVM
        sem = salario * 0.0925; // 9.25% del salario (Seguro de enfermedad y maternidad)
        ivm = salario * 0.0508; // 5.08% del salario (Seguro invalidez, vejez y muerte)

        // Calculamos el total a pagar
        total = sem + ivm;

        // Mostramos el resultado 
        JOptionPane.showMessageDialog(null, "La empresa debera pagar a la CCSS el monto de ₡" + total
                + "\n Desglose de estos:"
                + "\n Al sem un total de: ₡" + sem
                + "\n Al ivm un total de: ₡" + ivm);
    }
}
