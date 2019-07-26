package main;

import entidades.empleados.Salario;

import javax.swing.*;

import java.text.DecimalFormat;

import static entidades.Mensaje.*;

public class Main {


    public static void main(String[] args)
    {

        DecimalFormat formateo = new DecimalFormat("#,###,##0.00");



        Salario salario = new Salario();

        String horas = JOptionPane.showInputDialog(null,MENSAJE_PETICION_HORAS.getMensaje());

        String valor = JOptionPane.showInputDialog(null,MENSAJE_PETICION_VALOR_HORA.getMensaje());


        salario.setHorasTrabajadas(Double.parseDouble(horas));
        salario.setValorHora(Double.parseDouble(valor));

        //  double valorConvertir = Double.parseDouble(valor);

        JOptionPane.showMessageDialog(null,MENSAJE_SALARIO_PAGAR.getMensaje()+formateo.format(salario.calcularSalario()) );



    }


}
