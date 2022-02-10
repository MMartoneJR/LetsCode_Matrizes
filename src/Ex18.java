package Matrizes;

import java.util.Arrays;
import java.util.Random;

public class Ex18 {
    public static void main(String[] args) {
//        Faça um programa que permita ao usuário entrar com uma matriz de 3 x 3 números inteiros.
//        Em seguida, gere um array unidimensional pela soma dos números de cada coluna da matriz
//        e mostrar na tela esse array. Por exemplo, a matriz:
//        5 -8 10
//        1 2 15
//        25 10 7
//        Vai gerar um vetor, onde cada posição é a soma das colunas da matriz. A primeira
//        posição será 5 + 1 + 25, e assim por diante:
//        31 4 3

        Random random = new Random();
        int total = 3;
        int[][] matriz = new int[total][total];
        int[] array = new int[total];

        System.out.println("Matriz:");

        for (int i=0;i<total;i++){
            for (int j=0;j<total;j++){
                matriz[i][j] = random.nextInt(50);
                System.out.print(matriz[i][j]+"  ");
                if(matriz[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        System.out.println("Soma das colunas da Matriz:");
        for (int i=0 ; i<total ; i++){
            for (int j=0 ; j<total ; j++){
                array[i] += matriz[j][i];
            }
            System.out.print(array[i]+" ");
        }


    }
}
