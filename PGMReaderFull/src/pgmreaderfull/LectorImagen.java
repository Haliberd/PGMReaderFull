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
public class LectorImagen {
    
    public int picWidth = 0;
    public int picHeight = 0;
    public int maxvalue = 0;
    
    public LectorImagen(){
        
    }
    
    int[][] devolverImagen() throws FileNotFoundException, IOException{
        String filePath = "triangulo_ruido.pgm";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Scanner scan = new Scanner(fileInputStream);
        // Discard the magic number
        scan.nextLine();
        // Discard the comment line
        scan.nextLine();
        // Read pic width, height and max value
        this.picWidth = scan.nextInt();
        this.picHeight = scan.nextInt();
        this.maxvalue = scan.nextInt();

        fileInputStream.close();

         // Now parse the file as binary data
         fileInputStream = new FileInputStream(filePath);
         DataInputStream dis = new DataInputStream(fileInputStream);

         // look for 4 lines (i.e.: the header) and discard them
         int numnewlines = 4;
         while (numnewlines > 0) {
             char c;
             do {
                 c = (char)(dis.readUnsignedByte());
             } while (c != '\n');
             numnewlines--;
         }

         // read the image data
         int[][] data2D = new int[picHeight][picWidth];
         
         for (int row = 0; row < picHeight; row++) {
             for (int col = 0; col < picWidth; col++) {
                 data2D[row][col] = dis.readUnsignedByte();
                 
             }
             
         }
         return data2D;
    }
}
