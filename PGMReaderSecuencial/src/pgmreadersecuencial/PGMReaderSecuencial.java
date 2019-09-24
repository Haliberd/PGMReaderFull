/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmreadersecuencial;

import java.io.IOException;

/**
 *
 * @author Maximo Hernandez
 */
public class PGMReaderSecuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Secuencial secuencial = new Secuencial();
        secuencial.iniciarSecuencia();
    }
    
}
