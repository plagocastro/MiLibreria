package com.PabloLagoPro.bol21;

import java.util.Scanner;


public class InConsola implements InterfaceMetodosComunes{

    @Override
    public void visualizar(String mensaje) {

    }

    @Override
    public void introducirDatos() {
        System.out.println("Por favor, introduzca datos\n");
        Scanner sc = new Scanner(System.in);
        String entrada="";
        entrada=sc.nextLine();

    }
}