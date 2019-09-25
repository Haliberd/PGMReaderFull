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
public class Secuencial {
    
    public int picWidth;
    public int picHeight;
    public int maxvalue;
    public int[][] matrizO;
    public LectorImagen lectorI;
    private Menu menu = new Menu();
    
    public Secuencial() throws IOException{
        this.lectorI = new LectorImagen();
        this.matrizO = lectorI.devolverImagen();
        this.picHeight = lectorI.picHeight;
        this.picWidth = lectorI.picWidth;
        this.maxvalue = lectorI.maxvalue;
    }
    
    public void iniciarSecuencia() throws IOException{
        int opcion = menu.menuOpciones();
        switch(opcion){
            case 1:
                this.matrizO = lectorI.devolverImagen();
                double startTime31D = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_1D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_1D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                double endTime31D = System.currentTimeMillis() - startTime31D;
                double seconds31D = endTime31D/1000.0; 
                System.out.print("Duracion dilatacion (segundos): "+ seconds31D+"\n");
                this.matrizO = lectorI.devolverImagen();
                double startTime31E = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_1E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_1E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                double endTime31E = System.currentTimeMillis() - startTime31E;
                double seconds31E = endTime31E/1000.0; 
                System.out.print("Duracion erosion (segundos): "+ seconds31E+"\n");
                break;
            case 2:
                this.matrizO = lectorI.devolverImagen();
                double startTime321D = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_2_1D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_2_1D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                double endTime321D = System.currentTimeMillis() - startTime321D;
                double seconds321D = endTime321D/1000.0; 
                System.out.print("Duracion dilatacion (segundos): "+ seconds321D+"\n");
                
                this.matrizO = lectorI.devolverImagen();
                double startTime321E = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_2_1E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_2_1E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                double endTime321E = System.currentTimeMillis() - startTime321E;
                double seconds321E = endTime321E/1000.0; 
                System.out.print("Duracion erosion (segundos): "+ seconds321E+"\n");
                break;
            case 3:
                this.matrizO = lectorI.devolverImagen();
                double startTime031D = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                double endTime031D = System.currentTimeMillis() - startTime031D;
                double seconds031D = endTime031D/1000.0; 
                System.out.print("Duracion dilatacion (segundos): "+ seconds031D+"\n");
                this.matrizO = lectorI.devolverImagen();
                double startTime031E = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                double endTime031E = System.currentTimeMillis() - startTime031E;
                double seconds031E = endTime031E/1000.0; 
                System.out.print("Duracion erosion (segundos): "+ seconds031E+"\n");
                break;
            case 4:
                this.matrizO = lectorI.devolverImagen();
                double startTime032D = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_2D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_2D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                double endTime032D = System.currentTimeMillis() - startTime032D;
                double seconds032D = endTime032D/1000.0; 
                System.out.print("Duracion dilatacion (segundos): "+ seconds032D+"\n");
                this.matrizO = lectorI.devolverImagen();
                double startTime032E = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_2E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_2E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                double endTime032E = System.currentTimeMillis() - startTime032E;
                double seconds032E = endTime032E/1000.0; 
                System.out.print("Duracion erosion (segundos): "+ seconds032E+"\n");
                break;
            case 5:
                this.matrizO = lectorI.devolverImagen();
                double startTime0232D = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_2_3_2_0D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_2_3_2_0D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                double endTime0232D = System.currentTimeMillis() - startTime0232D;
                double seconds0232D = endTime0232D/1000.0; 
                System.out.print("Duracion dilatacion (segundos): "+ seconds0232D+"\n");
                this.matrizO = lectorI.devolverImagen();
                double startTime0232E = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_2_3_2_0E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_2_3_2_0E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                double endTime0232E = System.currentTimeMillis() - startTime0232E;
                double seconds0232E = endTime0232E/1000.0; 
                System.out.print("Duracion erosion (segundos): "+ seconds0232E+"\n");
                break;
            case 6:
                this.matrizO = lectorI.devolverImagen();
                double startTime031DE = System.currentTimeMillis();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1D((2*i)+1);
                    //System.out.println("E");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenDE").EscribirAArchivo(matrizO);
                double endTime031DE = System.currentTimeMillis() - startTime031DE;
                double seconds031DE = endTime031DE/1000.0; 
                System.out.print("Duracion erosion (segundos): "+ seconds031DE+"\n");
                break;
            case 7:
                double startTime031ED = System.currentTimeMillis();
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1E((2*i)+1);
                    //System.out.println("R");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1D((2*i)+1);
                    //System.out.println("E");
                }
                
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenED").EscribirAArchivo(matrizO);
                double endTime031ED = System.currentTimeMillis() - startTime031ED;
                double seconds031ED = endTime031ED/1000.0; 
                System.out.print("Duracion erosion (segundos): "+ seconds031ED+"\n");
                break;
        }
    }
    
    
    //Vuelve las casillas mas blancas estilo 3-1
    public void escribir3_1D(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = maxvalue;
            int k[] = new int[2];
            k[0] = matrizO[fila][i];
            if((i+1)==picWidth)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila][i+1];
            for(int n : k){
                if(n<min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 3-2-1 (estructura en forma de L pero invertida)
    public void escribir3_2_1D(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = maxvalue;
            int k[] = new int[3];
            k[0] = matrizO[fila][i];
            if((i+1)==picWidth)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila][i+1];
            if((fila+1) == picHeight)
                k[2] = matrizO[fila][i];
            else
                k[2] = matrizO[fila+1][i];
            for(int n : k){
                if(n<min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 0-3-1 (estructura que si parece una L)
    public void escribir0_3_1D(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = maxvalue;
            int k[] = new int[3];
            k[0] = matrizO[fila][i];
            if((i+1)==picWidth)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila][i+1];
            if((fila-1) == -1)
                k[2] = matrizO[fila][i];
            else
                k[2] = matrizO[fila-1][i];
            for(int n : k){
                if(n<min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 0-3-2 (estructura que se asemeja a una I)
    public void escribir0_3_2D(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = maxvalue;
            int k[] = new int[3];
            k[0] = matrizO[fila][i];
            if((fila-1)==-1)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila-1][i];
            if((fila+1) == picHeight)
                k[2] = matrizO[fila][i];
            else
                k[2] = matrizO[fila+1][i];
            for(int n : k){
                if(n<min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 0-2-3-2-0 (estructura que se asemeja a una X)
    public void escribir0_2_3_2_0D(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = maxvalue;
            int k[] = new int[5];
            k[0] = matrizO[fila][i];
            if((fila-1)==-1)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila-1][i];
            if((fila+1) == picHeight)
                k[2] = matrizO[fila][i];
            else
                k[2] = matrizO[fila+1][i];
            if((i-1)==-1)
                k[3] = matrizO[fila][i];
            else
                k[3] = matrizO[fila][i-1];
            if((i+1)==picWidth)
                k[4] = matrizO[fila][i];
            else
                k[4] = matrizO[fila][i+1];
            for(int n : k){
                if(n<min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 3-1
    public void escribir3_1E(int fila){
        for(int i = 0; i < picWidth; i++){
            int max = 0;
            int k[] = new int[2];
            k[0] = matrizO[fila][i];
            if((i+1)==picWidth)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila][i+1];
            for(int n : k){
                if(n>max)
                    max = n;
            }
            matrizO[fila][i] = max;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 3-2-1 (estructura en forma de L pero invertida)
    public void escribir3_2_1E(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = 0;
            int k[] = new int[3];
            k[0] = matrizO[fila][i];
            if((i+1)==picWidth)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila][i+1];
            if((fila+1) == picHeight)
                k[2] = matrizO[fila][i];
            else
                k[2] = matrizO[fila+1][i];
            for(int n : k){
                if(n>min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 0-3-1 (estructura que si parece una L)
    public void escribir0_3_1E(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = 0;
            int k[] = new int[3];
            k[0] = matrizO[fila][i];
            if((i+1)==picWidth)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila][i+1];
            if((fila-1) == -1)
                k[2] = matrizO[fila][i];
            else
                k[2] = matrizO[fila-1][i];
            for(int n : k){
                if(n>min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 0-3-2 (estructura que se asemeja a una I)
    public void escribir0_3_2E(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = 0;
            int k[] = new int[3];
            k[0] = matrizO[fila][i];
            if((fila-1)==-1)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila-1][i];
            if((fila+1) == picHeight)
                k[2] = matrizO[fila][i];
            else
                k[2] = matrizO[fila+1][i];
            for(int n : k){
                if(n>min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
    //Vuelve las casillas mas blancas estilo 0-2-3-2-0 (estructura que se asemeja a una X)
    public void escribir0_2_3_2_0E(int fila){
        for(int i = 0; i < picWidth; i++){
            int min = 0;
            int k[] = new int[5];
            k[0] = matrizO[fila][i];
            if((fila-1)==-1)
                k[1] = matrizO[fila][i];
            else
                k[1] = matrizO[fila-1][i];
            if((fila+1) == picHeight)
                k[2] = matrizO[fila][i];
            else
                k[2] = matrizO[fila+1][i];
            if((i-1)==-1)
                k[3] = matrizO[fila][i];
            else
                k[3] = matrizO[fila][i-1];
            if((i+1)==picWidth)
                k[4] = matrizO[fila][i];
            else
                k[4] = matrizO[fila][i+1];
            for(int n : k){
                if(n>min)
                    min = n;
            }
            matrizO[fila][i] = min;
        }
    }
    
}
