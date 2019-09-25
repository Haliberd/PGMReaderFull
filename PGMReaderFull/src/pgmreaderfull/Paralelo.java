/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmreaderfull;

import java.io.IOException;

/**
 *
 * @author Maximo Hernandez
 */
public class Paralelo {
    
    public int picWidth;
    public int picHeight;
    public int maxvalue;
    public int[][] matrizO;
    public LectorImagen lectorI;
    private Menu menu = new Menu();
    
    public Paralelo() throws IOException{
        this.lectorI = new LectorImagen();
        this.matrizO = lectorI.devolverImagen();
        this.picHeight = lectorI.picHeight;
        this.picWidth = lectorI.picWidth;
        this.maxvalue = lectorI.maxvalue;
    }
    
    public void ejecutar() throws IOException, InterruptedException{
        //System.out.printf("Width: %3d, Height: %3d, MaxValue: %3d\n", picWidth, picHeight, maxvalue);
        int opcion = menu.menuOpciones();
        if(opcion != 9){
            if(opcion < 6){
                MonitorDeImagen monitor = new MonitorDeImagen(matrizO, picWidth, picHeight, maxvalue);

                Thread[] thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila(2*i, monitor, opcion) );
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();
                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila((2*i)+1, monitor, opcion ));
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();



                int[][] imagenN = monitor.matrizO;

                SalidaArchivo sa = new SalidaArchivo(picWidth, picHeight, maxvalue, "imagen"+opcion+"D");

                sa.EscribirAArchivo(imagenN);


                monitor.matrizO = lectorI.devolverImagen();
                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila(2*i, monitor, opcion+5) );
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();
                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila((2*i)+1, monitor, opcion+5 ));
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();

                imagenN = monitor.matrizO;

                sa = new SalidaArchivo(picWidth, picHeight, maxvalue, "imagen"+opcion+"E");

                sa.EscribirAArchivo(imagenN);
            }
            else if(opcion == 6){
                MonitorDeImagen monitor = new MonitorDeImagen(matrizO, picWidth, picHeight, maxvalue);

                Thread[] thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila(2*i, monitor, 3) );
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();
                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila((2*i)+1, monitor, 3 ));
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();

                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila(2*i, monitor, 3+5) );
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();
                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila((2*i)+1, monitor, 3+5 ));
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();

                int[][] imagenN = monitor.matrizO;

                SalidaArchivo sa = new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenDE");

                sa.EscribirAArchivo(imagenN);
            }
            else if(opcion == 7){
                MonitorDeImagen monitor = new MonitorDeImagen(matrizO, picWidth, picHeight, maxvalue);

                Thread[] thr = new Thread[(picHeight/2)];

                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila(2*i, monitor, 3+5) );
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();
                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila((2*i)+1, monitor, 3+5 ));
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();


                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila(2*i, monitor, 3) );
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();
                thr = new Thread[(picHeight/2)];
                for(int i = 0; i < (picHeight/2); i++){
                    thr[i] = new Thread( new EscritorFila((2*i)+1, monitor, 3 ));
                    thr[i].start();
                }
                for(Thread t : thr)
                    t.join();

                int[][] imagenN = monitor.matrizO;

                SalidaArchivo sa = new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenED");

                sa.EscribirAArchivo(imagenN);
            }
        
        }
    }
    
}
