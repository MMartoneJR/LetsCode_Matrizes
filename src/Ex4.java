package Matrizes;

import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
//        Leia uma matriz 4 x 4, imprima a matriz e retorne a localização (linha e a coluna)
//        do maior valor.

        Random rndm = new Random();
        int[][] matriz = new int[4][4];
        int maiorValor = 0, posLinha = 0, posColuna = 0;



        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rndm.nextInt(20);
                if(matriz[i][j] > maiorValor){
                    maiorValor = matriz[i][j];
                    posLinha = i;
                    posColuna = j;
                }
                System.out.print(matriz[i][j]+"  ");
                if(matriz[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("Maior valor: "+maiorValor);
        System.out.println("Linha: "+(posLinha+1));
        System.out.println("Coluna: "+(posColuna+1));
    }
}
