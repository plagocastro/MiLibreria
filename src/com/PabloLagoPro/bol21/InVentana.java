package com.PabloLagoPro.bol21;


import javax.swing.*;

public class InVentana implements InterfaceMetodosComunes{
    @Override
    public void visualizar(String mensaje) {

    }

    @Override
    public void introducirDatos() {
        String entrada= JOptionPane.showInputDialog(null,"Por favor, introduzca los datos de entrada");

    }
}