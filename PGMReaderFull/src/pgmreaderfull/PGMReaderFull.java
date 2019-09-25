/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmreaderfull;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Maximo Hernandez
 */
public class PGMReaderFull {
    
    public static int picWidth = 0;
    public static int picHeight = 0;
    public static int maxvalue = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, InterruptedException {
         
        Paralelo paralelo = new Paralelo();
        paralelo.ejecutar();
        
    }
    
    
    
    
    
}
