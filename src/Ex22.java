package Matrizes;

import java.util.Random;

public class Ex22 {
    public static void main(String[] args) {
//        Faça um programa que leia duas matrizes A e B de tamanho 3 x 3 e calcule C = A ∗ B.

        Random random = new Random();
        int[][] matrizA = new int[3][3], matrizB = new int[3][3],matrizC = new int[3][3];

        System.out.println("Matriz A: ");

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
                matrizB[i][j] = random.nextInt(10);
                System.out.print(matrizB[i][j]+"  ");
                if (matrizB[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("\nMatriz C: ");

        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ;j++){
                matrizC[i][j] = matrizA[i][j]*matrizB[i][j];
                System.out.print(matrizC[i][j]+"  ");
                if (matrizC[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
