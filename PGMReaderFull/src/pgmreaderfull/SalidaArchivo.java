/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmreaderfull;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Maximo Hernandez
 */
public class SalidaArchivo {
    
    public int picWidth;
    public int picHeight;
    public int maxvalue;
    String nombre;
    
    public SalidaArchivo(int picWidth, int picHeight, int maxvalue, String nombre){
        this.picWidth = picWidth;
        this.picHeight = picHeight;
        this.maxvalue = maxvalue;
        this.nombre = nombre;
    }
    
    public void EscribirAArchivo(int[][] imagenMatriz) throws FileNotFoundException, IOException{
        DataOutputStream writeFile = new DataOutputStream(new FileOutputStream(nombre + ".pgm")); 
        // Write the .pgm header (P5, 800 600, 250) 
        writeFile.write("P5\n".getBytes());
        writeFile.write("#Este archivo fue creado por yo, Maximo Hernandez\n".getBytes());
        writeFile.write((picWidth + " " + picHeight + "\n").getBytes());
        writeFile.write((maxvalue + "\n").getBytes());
        for(int i = 0; i<picHeight; i++){
            for(int e = 0; e < picWidth; e++)
                writeFile.write(imagenMatriz[i][e]);
        }
    }
    
    
}
