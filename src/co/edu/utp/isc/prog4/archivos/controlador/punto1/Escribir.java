/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.prog4.archivos.controlador.punto1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author utp
 */
public class Escribir {

    public void guardarDatos() {
        // try with resources
        try (DataOutputStream bos = new DataOutputStream(new FileOutputStream("./Punto1.cad"))) {
            for (int i = 1; i <= 150; i++) {
                bos.writeInt(i);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Escribir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
