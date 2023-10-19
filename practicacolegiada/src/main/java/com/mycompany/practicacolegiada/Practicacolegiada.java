/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practicacolegiada;

import javax.swing.JOptionPane;

/**
 *
 * @author sombr
 */
public class Practicacolegiada {

    public static void main(String[] args) {
        int cantEmp = Integer.getInteger(JOptionPane.showInputDialog("introduzca la cantidad de empleados"));
        double salarioInd;
        double totalFinal;
        double totalSFM;
        double totalIVM;
        double abono = 0.0;

        for (int i = 0; i < cantEmp; i++) {
            
            salarioInd = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario deñl empleado numero:" +(i + 1)));
            double tempSem = salarioInd * 0.0925;
            double tempIVM = salarioInd * 0.0508;
            
            abono = tempSEM + tempIVN;
        }
            
         JOptionPane.showMessageDialog( null, "la empresa debera de pagar a la CCSS el monto de ₡" + abono + "por concepto de SEM y IVM");
            

        }

    }
