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
         
        
        //System.out.printf("Width: %3d, Height: %3d, MaxValue: %3d\n", picWidth, picHeight, maxvalue);
        MonitorDeImagen monitor = new MonitorDeImagen(devolverImagen(), picWidth, picHeight, maxvalue);
        MonitorDeImagen monitor1 = new MonitorDeImagen(devolverImagen(), picWidth, picHeight, maxvalue);
        Thread[] thr = new Thread[(picHeight/2)];
        for(int i = 0; i < (picHeight/2); i++){
            thr[i] = new Thread( new EscritorFila(2*i, monitor, 1) );
            thr[i].start();
        }
        for(Thread t : thr)
            t.join();
        thr = new Thread[(picHeight/2)];
        for(int i = 0; i < (picHeight/2); i++){
            thr[i] = new Thread( new EscritorFila((2*i)+1, monitor, 1 ));
            thr[i].start();
        }
        for(Thread t : thr)
            t.join();
        thr = new Thread[(picHeight/2)];
        for(int i = 0; i < (picHeight/2); i++){
            thr[i] = new Thread( new EscritorFila(2*i, monitor1, 2) );
            thr[i].start();
        }
        for(Thread t : thr)
            t.join();
        thr = new Thread[(picHeight/2)];
        for(int i = 0; i < (picHeight/2); i++){
            thr[i] = new Thread( new EscritorFila((2*i)+1, monitor1, 2 ));
            thr[i].start();
        }
        for(Thread t : thr)
            t.join();
        int[][] imagenN = monitor.matrizO;
        int[][] imagenN1 = monitor1.matrizO;
        SalidaArchivo sa = new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenD");
        SalidaArchivo sa1 = new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenE");
        sa.EscribirAArchivo(imagenN);
        sa1.EscribirAArchivo(imagenN1);
    }
    
    
    
    static int[][] devolverImagen() throws FileNotFoundException, IOException{
        String filePath = "imgNueva.pgm";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Scanner scan = new Scanner(fileInputStream);
        // Discard the magic number
        scan.nextLine();
        // Discard the comment line
        scan.nextLine();
        // Read pic width, height and max value
        picWidth = scan.nextInt();
        picHeight = scan.nextInt();
        maxvalue = scan.nextInt();

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
