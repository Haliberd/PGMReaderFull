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
    
    public Secuencial() throws IOException{
        this.lectorI = new LectorImagen();
        this.matrizO = lectorI.devolverImagen();
        this.picHeight = lectorI.picHeight;
        this.picWidth = lectorI.picWidth;
        this.maxvalue = lectorI.maxvalue;
    }
    
    public void iniciarSecuencia() throws IOException{
        int opcion = 1;
        switch(opcion){
            case 1:
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_1D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_1D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_1E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_1E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                break;
            case 2:
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_2_1D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_2_1D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_2_1E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir3_2_1E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                break;
            case 3:
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_1E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                break;
            case 4:
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_2D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_2D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_2E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_3_2E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
                break;
            case 5:
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_2_3_2_0D(2*i);
                    //System.out.println("F");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_2_3_2_0D((2*i)+1);
                    //System.out.println("E");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"D").EscribirAArchivo(matrizO);
                this.matrizO = lectorI.devolverImagen();
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_2_3_2_0E(2*i);
                    //System.out.println("A");
                }
                for(int i = 0; i<(picHeight/2); i++){
                    escribir0_2_3_2_0E((2*i)+1);
                    //System.out.println("R");
                }
                new SalidaArchivo(picWidth, picHeight, maxvalue, "imagenOpcion"+opcion+"E").EscribirAArchivo(matrizO);
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
