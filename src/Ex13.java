package Matrizes;

import java.util.Random;

public class Ex13 {
    public static void main(String[] args) {
//        Gere matriz 4 x 4 com valores no intervalo [1, 20]. Escreva um programa que transforme
//        a matriz gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os
//        elementos acima da diagonal principal. Imprima a matriz original e a matriz transformada.

        int[][] matriz = new int[4][4];
        Random rndm = new Random();

        System.out.println("Matriz original: ");
        for (int i =0; i<4; i++){
            for(int j=0; j<4;j++){
                matriz[i][j] = rndm.nextInt(20);
                System.out.print(matriz[i][j]+"  ");
                if(matriz[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        System.out.println("Matriz alterada: ");
        for (int i =0; i<4; i++){
            for(int j=0; j<4;j++){
                if (i<j){
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j]+"  ");
                if(matriz[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
