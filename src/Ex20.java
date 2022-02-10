package Matrizes;

import java.util.Random;

public class Ex20 {
    public static void main(String[] args) {
//        Faça programa que leia uma matriz 3 x 6 com valores reais.
//          (a) Imprima a soma de todos os elementos das colunas  ímpares.
//          (b) Imprima a media aritmética dos elementos da segunda e quarta colunas.
//          (c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
//          (d) Imprima a matriz modificada.

        Random random = new Random();
        int[][] matriz = new int[3][6];
        int[] somaCol1e2 = new int[3];
        int somaColImpar = 0;
        double media2e4Col = 0;

        System.out.println("Matriz original:");

        for (int i=0; i<matriz.length ; i++){
            for (int j=0; j<6 ; j++){
                matriz[i][j] = random.nextInt(50);
                System.out.print(matriz[i][j]+"  ");
                if (matriz[i][j]<10){
                    System.out.print(" ");
                }
                if (j%2==0){
                    somaColImpar+=matriz[i][j];
                }
                if ((j==1) || (j==3)){
                    media2e4Col+=matriz[i][j];
                }
                if (j==0 || j==1){
                  somaCol1e2[i] += matriz[i][j];
                }

            }
            System.out.println(" ");
        }
        media2e4Col/=6;

        System.out.println("\nSoma das colunas impares: " + somaColImpar);

        System.out.printf("\nMedia aritimética dos valores da 2a e 4a colunas: %.2f\n", media2e4Col);

        System.out.println("\nSoma das colunas 1 e 2:");
        for (int i= 0; i<3 ; i++){
            System.out.println(somaCol1e2[i]);
        }

        System.out.println(" ");

        System.out.println("Matriz alterada: ");
        for (int i=0; i<matriz.length ; i++){
            for (int j=0; j<6 ; j++) {
                if (j==5){
                    matriz[i][j] = somaCol1e2[i];
                }
                System.out.print(matriz[i][j]+"  ");
                if (matriz[i][j]<10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
