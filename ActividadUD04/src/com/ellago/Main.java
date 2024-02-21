/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ellago;

/**
 * Clase principal que contiene el método main para demostrar el funcionamiento de la cuenta bancaria.
 */

//Clase principal Main
public class Main {

	
	 /**
     * Método principal de la aplicación.
     * 
     * @param args Argumentos de la línea de comandos (no utilizado en este caso).
     */
	 // Método principal de la aplicación
    public static void main(String[] args) {
    	
    	//Cambio del nombre de la variable miCuenta por cuenta1
    	CCuenta Cuenta1; // Cambié "Cuenta1" por "cuenta1" para seguir las convenciones de nombres
        double saldoActual;

        // Crear una instancia de CCuenta con valores iniciales
        Cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        // Obtener y mostrar el saldo actual
        saldoActual = Cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);
        
        // Llamar al método operativa_cuenta para realizar operaciones en la cuenta
        operativa_cuenta(Cuenta1, 0);
    }

    
    /**
     * Realiza operaciones en la cuenta bancaria, como retiros e ingresos.
     * 
     * @param cuenta    La cuenta bancaria en la que se realizarán las operaciones.
     * @param cantidad  La cantidad a retirar o ingresar en la cuenta (debe ser tipo float).
     */
  //Declaracion metodo "operativa_cuenta" que engloba las sentencias de la clase Main
    // Agregar un nuevo parámetro "cantidad" al método, que representa la cantidad a operar (tipo float)
    private static void operativa_cuenta(CCuenta cuenta, float cantidad) {
        // Encapsulación de los atributos utilizando los métodos proporcionados por la clase CCuenta
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




