import java.util.Random;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
//        Leia uma matriz 5 x 5. Leia também um valor X. O programa devera fazer uma busca
//        desse valor na matriz e, ao final, escrever a localização (linha e coluna) ou uma
//        mensagem de “nao encontrado”.

        int[][] matriz = new int[5][5];
        int opc = 0, posLinha = 0, posColuna = 0, validador = 0;
        Random rndm = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor a ser buscado: ");
        opc = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rndm.nextInt(50);
                if(matriz[i][j] == opc){
                    posLinha = i;
                    posColuna = j;
                    validador = 1;
                }
                System.out.print(matriz[i][j]+"  ");
                if(matriz[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

        if (validador==1){
            System.out.println("O valor "+opc+" foi encontrado na posição:");
            System.out.println("Linha: "+(posLinha+1));
            System.out.println("Coluna: "+(posColuna+1));
        }
        else{
            System.out.println("Valor não encontrado");
        }

    }
}
