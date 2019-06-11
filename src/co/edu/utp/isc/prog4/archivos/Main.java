/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.archivos;

/**
 *
 * @author utp
 */
public class Main {
    public static void main(String[] args) {
        probarPunto1();
    }

    private static void probarPunto1() {
        co.edu.utp.isc.prog4.archivos.controlador.punto1.Escribir e = new co.edu.utp.isc.prog4.archivos.controlador.punto1.Escribir();
        e.guardarDatos();
        
        co.edu.utp.isc.prog4.archivos.controlador.punto1.Leer l = new co.edu.utp.isc.prog4.archivos.controlador.punto1.Leer();
        l.leerDatos();
    }
}
