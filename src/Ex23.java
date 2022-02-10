package Matrizes;

import java.util.Random;

public class Ex23 {
    public static void main(String[] args) {
//        Faça um programa que leia uma matriz A de tamanho 3 x 3 e calcule B = A2

        Random random = new Random();
        int[][] matrizA = new int[3][3],matrizB = new int[3][3];

        System.out.println("\nMatriz A: ");

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ;j++){
                matrizA[i][j] = random.nextInt(10);
                System.out.print(matrizA[i][j]+"  ");
                if (matrizA[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("\nMatriz B: ");

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ;j++){
                matrizB[i][j] = matrizA[i][j]*matrizA[i][j];
                System.out.print(matrizB[i][j]+"  ");
                if (matrizB[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
