import java.util.*;

public class Ex25 {
    public static void main(String[] args) {
//        Faç̧a um programa para determinar a próxima jogada em um Jogo da Velha. Assumir que
//        o tabuleiro e representado por uma matriz de 3 x 3, onde cada posição representa uma
//        das casas do tabuleiro. A matriz pode conter os seguintes valores -1, 0, 1 representando
//        respectivamente uma casa contendo uma peça minha (-1), uma casa vazia do tabuleiro
//        (0), e uma casa contendo uma peça do meu oponente (1).

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] tabuleiro = new int[3][3];
        int posX=0, posY=0;
        int checarVencedor = 0;

        System.out.println("Jogo da Velha");
        printTabuleiro(tabuleiro);
        System.out.println();

        while (true){
            while(true) {
                System.out.println("Sua vez:");
                System.out.print("Escolha uma linha: ");
                while (true) {
                    posX = sc.nextInt();
                    if (posX > 3 || posX < 0) {
                        System.out.println("Opção invalida, tente novamente");
                    } else {
                        break;
                    }
                }
                System.out.print("Escolha uma coluna: ");
                while (true) {
                    posY = sc.nextInt();
                    if (posY > 3 || posY < 0) {
                        System.out.println("Opção invalida, tente novamente");
                    } else {
                        break;
                    }
                }
                if (tabuleiro[posX - 1][posY - 1] != 0) {
                    System.out.println("Casa ocupada, escolha novamente");
                } else {
                    tabuleiro[posX - 1][posY - 1] = -1;
                    printTabuleiro(tabuleiro);
                    posX = 0;
                    posY = 0;
                    break;
                }
            }

            checarVencedor = vencedor(tabuleiro);
            if (checarVencedor == -1){
                System.out.println("Você venceu!");
                break;
            }
            else if(checarVencedor == 404){
                System.out.println("Empate!");
                break;
            }
            else {

                System.out.println("\nJogada do computador: ");

                while (true) {
                    posX = random.nextInt(3);
                    posY = random.nextInt(3);
                    if (tabuleiro[posX][posY] != 0) {
                        posX = random.nextInt(3);
                        posY = random.nextInt(3);
                    } else {
                        tabuleiro[posX][posY] = 1;
                        System.out.print("Linha escolhida: " + (posX + 1));
                        System.out.print("\nColuna escolhida: " + (posY + 1));
                        System.out.println(" ");
                        printTabuleiro(tabuleiro);
                        System.out.println();
                        posX = 0;
                        posY = 0;
                        break;
                    }
                }
            }

            checarVencedor = vencedor(tabuleiro);
            if (checarVencedor == 1){
                System.out.println("Você perdeu!");
                break;
            }
            else if(checarVencedor == 404){
                System.out.println("Empate!");
                break;
            }
        }
    }

    public static void printTabuleiro(int[][] tabuleiro){
        for (int i=0 ; i<3 ; i++){
            for (int j=0 ; j<3 ; j++){
                System.out.print("|");
                System.out.printf("%2d ",tabuleiro[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
    }

    public static int vencedor(int[][] tabuleiro){
        //Linha
        for (int i=0 ; i<3; i++){
            if ((tabuleiro[i][0]==tabuleiro[i][1]) && (tabuleiro[i][0]==tabuleiro[i][2]) && tabuleiro[i][0]!=0){
                return tabuleiro[i][0];
            }
        }
        //Coluna
        for (int i=0 ; i<3; i++){
            if ((tabuleiro[0][i]==tabuleiro[1][i]) && (tabuleiro[0][i]==tabuleiro[2][i]) && tabuleiro[0][i]!=0){
                return tabuleiro[0][i];
            }
        }
        //Diagonal1
        if ((tabuleiro[0][0]==tabuleiro[1][1]) && (tabuleiro[0][0]==tabuleiro[2][2]) && tabuleiro[0][0]!=0){
             return tabuleiro[0][0];
        }
        //Diagonal2
        if ((tabuleiro[0][2]==tabuleiro[1][1]) && (tabuleiro[0][2]==tabuleiro[2][0]) && tabuleiro[0][2]!=0){
            return tabuleiro[0][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == 0) {
                    return 0;
                }
            }
        }
        return 404;
    }
}