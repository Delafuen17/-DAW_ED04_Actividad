/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ellago;

public class Main {

    public static void main(String[] args) {
        CCuenta Cuenta1;
        double saldoActual;

        Cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        operativa_cuenta(Cuenta1, 0);
    }

   
    private static void operativa_cuenta(CCuenta cuenta, float cantidad) {
    	
        try {
            cuenta.retirar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
