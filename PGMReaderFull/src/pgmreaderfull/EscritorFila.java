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
        if(opcion == 1)
            monitor.escribir3_2_1D(nFila);
        if (opcion == 2)
            monitor.escribir3_2_1E(nFila);
        System.out.println(nFila);
    }
    
}
 