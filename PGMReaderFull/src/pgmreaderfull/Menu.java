/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pgmreaderfull;

import java.util.Scanner;

/**
 *
 * @author Maximo Hernandez
 */
public class Menu {
    
    private Scanner scanner;
    
    public Menu(){
        this.scanner = new Scanner(System.in);
    }
    
    public int menuOpciones(){
        int opcion = 0;
        while(opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5 && opcion != 6 && opcion != 7 && opcion != 9 ){
            System.out.printf("Menu de ejecucion de programa paralelo.\n"
                    + "Ingrese el numero correspondiente a la opcion que desea de ejecutar.\n"
                    + "1) Para ejecutar dilatacion y erosion con la figura 1 (la que parece -).\n"
                    + "2) Para ejecutar dilatacion y erosion con la figura 2 (la que parece L, pero invertida).\n"
                    + "3) Para ejecutar dilatacion y erosion con la figura 3 (la que parece L).\n"
                    + "4) Para ejecutar dilatacion y erosion con la figura 4 (la que parece I).\n"
                    + "5) Para ejecutar dilatacion y erosion con la figura 5 (la que parece X).\n"
                    + "6) Para ejecutar dilatacion y erosion en conjunto sobre imagen (usando la figura de 3)).\n"
                    + "7) Para ejecutar erosion y dilatacion en conjunto sobre imagen (usando la figura de 3)).\n"
                    + "9) Para salir del programa.\n");
            opcion = scanner.nextInt();
        }
        System.out.println(opcion);
        return opcion;
    }
    
}
