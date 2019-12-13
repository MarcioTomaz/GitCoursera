package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

       Paciente paciente1 = new Paciente(80,1.50);
       Paciente paciente2 = new Paciente(50, 1.70);
       Paciente paciente3 = new Paciente(100,2.0);

       DecimalFormat df = new DecimalFormat("#.00");


       System.out.println("==============Paciente 1 ============= ");
       System.out.println("Valor do IMC: " + df.format(paciente1.calcularIMC()));
       System.out.println("Situação: " + paciente1.diagnostico());


       System.out.println("==============Paciente 2 ============= ");
       System.out.println("Valor do IMC: " + df.format(paciente2.calcularIMC()));
       System.out.println("Situação: " + paciente2.diagnostico());


        System.out.println("==============Paciente 3 ============= ");
        System.out.println("Valor do IMC: " + df.format(paciente3.calcularIMC()));
        System.out.println("Situação: " + paciente3.diagnostico());


    }
}
