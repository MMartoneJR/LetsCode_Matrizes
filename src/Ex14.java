import java.util.Random;

public class Ex14 {
    public static void main(String[] args) {
//        Faça um programa para gerar automaticamente números entre 0 e 99 de uma cartela de
//        bingo. Sabendo que cada cartela devera conter 5 linhas de 5 números, gere estes dados
//        de modo a nao ter números repetidos dentro das cartelas. O programa deve exibir na
//        tela a cartela gerada.

        Random rng = new Random();
        int[][] matriz = new int[5][5];
        int[] lista = new int[100];
        int index = 0;

        for (int i =0;i< lista.length;i++){
            lista[i] = i;
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                index = rng.nextInt(100);
                matriz[i][j] = lista[index];
                lista[index] = 404;
                while (matriz[i][j]==404){
                    index = rng.nextInt(100);
                    matriz[i][j] = lista[index];
                    lista[index] = 404;
                }
                System.out.printf(" %2d ",matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}