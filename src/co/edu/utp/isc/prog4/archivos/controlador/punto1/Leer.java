/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.archivos.controlador.punto1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utp
 */
public class Leer {

    public void leerDatos() {
        try (DataInputStream bis = new DataInputStream(new FileInputStream("./Punto1.cad"))) {
            int dato;
            while ((dato = bis.readInt()) != -1) {
                System.out.println("" + dato);
                if (bis.available() == 0) {
                    break;
                }
            }
            System.out.println("Termino el metodo");
        } catch (IOException ex) {
            //Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ocurrio una excepcion: " + ex);
        } finally {
            System.out.println("finalizo el metodo");
        }
        System.out.println("Estoy fuera del bloque");
        
        
    }

}
