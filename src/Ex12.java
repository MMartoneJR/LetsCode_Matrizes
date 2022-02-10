package Matrizes;

import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class Ex12 {
    public static void main(String[] args) {
//        Leia uma matriz de 3 x 3 elementos. Calcule e imprima a sua transposta.

        Random random = new Random();
        int [][] matriz = new int[3][3];
        int [][] matrizTrnasp = new int[3][3];

        System.out.println("Matriz base:");

        for (int i=0; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                matriz[i][j] = random.nextInt(20);
                System.out.print(matriz[i][j] +" ");
                if(matriz[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("Matriz transposta");
        for (int i=0; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                matrizTrnasp[i][j] = matriz[j][i];
                System.out.print(matrizTrnasp[i][j] +" ");
                if(matrizTrnasp[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
