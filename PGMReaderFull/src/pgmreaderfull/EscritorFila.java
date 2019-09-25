/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmreaderfull;

/**
 *
 * @author Maximo Hernandez
 */
public class EscritorFila implements Runnable{
    
    int nFila;
    MonitorDeImagen monitor;
    int opcion;
    
    public EscritorFila(int nFila, MonitorDeImagen monitor, int opcion){
        this.nFila = nFila;
        this.monitor = monitor;
        this.opcion = opcion;
    }
    
    @Override
    public void run() {
        switch(opcion){
            case (1):
                monitor.escribir3_1D(nFila);
                break;
            case (2):
                monitor.escribir3_2_1D(nFila);
                break;
            case (3):
                monitor.escribir0_3_1D(nFila);
                break;
            case (4):
                monitor.escribir0_3_2D(nFila);
                break;
            case (5):
                monitor.escribir0_2_3_2_0D(nFila);
                break;
            case (6):
                monitor.escribir3_1E(nFila);
                break;
            case (7):
                monitor.escribir3_2_1E(nFila);
                break;
            case (8):
                monitor.escribir0_3_1E(nFila);
                break;
            case (9):
                monitor.escribir0_3_2E(nFila);
                break;  
            case (10):
                monitor.escribir0_2_3_2_0E(nFila);
                break;
        }
        System.out.println(nFila);
    }
    
}
 