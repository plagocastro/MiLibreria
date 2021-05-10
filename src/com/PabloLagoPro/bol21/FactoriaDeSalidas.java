package com.PabloLagoPro.bol21;

public class FactoriaDeSalidas {
    public static final int CONSOLA = 1;
    public static final int VENTANA = 2;

    public static InterfaceMetodosComunes getProducto(int tipo, String mensaje) {
        switch (tipo) {
            // tipo consola
            case CONSOLA:
                return new Consola(mensaje);
            // tipo ventana
            case VENTANA:
                return new Ventana(mensaje);
            default:
                return null;
        }
    }
}