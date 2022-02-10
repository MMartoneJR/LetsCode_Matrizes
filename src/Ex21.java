import java.util.Random;
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
//        Faça um programa que leia duas matrizes 2x2 com valores reais. Ofereça ao usuario
//        um menu de opções:
//          (a) somar as duas matrizes
//          (b) subtrair a primeira matriz da segunda
//          (c) adicionar uma constante as duas matrizes
//          (d) imprimir as matrizes
//        Nas duas primeiras opções uma terceira matriz 2x2 deve ser criada. Na terceira opção
//        o valor da constante deve ser lido e o resultado da adição da constante deve ser
//        armazenado na propria matriz.

        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizC = new int[2][2];
        int constante = 0;
        int opc = 0;


        System.out.println("Matriz A:");
        for (int i=0 ; i<2 ; i++){
            for (int j=0 ; j<2 ;j++){
                matrizA[i][j] = random.nextInt(20);
                System.out.printf(" %2d ", matrizA[i][j]);
            }
            System.out.println(" ");

        }
        System.out.println("Matriz B:");
        for (int i=0 ; i<2 ; i++){
            for (int j=0 ; j<2 ;j++){
                matrizB[i][j] = random.nextInt(20);
                System.out.printf(" %2d ", matrizB[i][j]);
            }
            System.out.println(" ");

        }
        System.out.println("\n Selecione uma opção: ");
        System.out.println("1 - Somar as matrizes");
        System.out.println("2 - Subtrair a Matriz A pela Matriz B");
        System.out.println("3 - adicionar uma constante as 2 matrizes");
        System.out.println("4 - imprimir os valores das matrizes");
        opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.println("\nSoma das matrizes:");
                for (int i=0 ; i<2 ; i++){
                    for (int j=0 ; j<2 ;j++){
                        matrizC[i][j] = matrizA[i][j]+matrizB[i][j];
                        System.out.printf(" %2d ", matrizC[i][j]);
                    }
                    System.out.println(" ");
                }
            break;

            case 2:
                System.out.println("\n subtração das matrizes:");
                for (int i=0 ; i<2 ; i++){
                    for (int j=0 ; j<2 ;j++){
                        matrizC[i][j] = matrizA[i][j]-matrizB[i][j];
                        System.out.printf(" %2d ", matrizC[i][j]);
                    }
                    System.out.println(" ");
                }
                break;

            case 3:
                System.out.print("\nInsira o valor da constante: ");
                constante = sc.nextInt();

                System.out.println("Matriz A + constante:");
                for (int i=0 ; i<2 ; i++){
                    for (int j=0 ; j<2 ;j++){
                        matrizA[i][j] += constante;
                        System.out.printf(" %2d ", matrizA[i][j]);
                    }
                    System.out.println(" ");
                }
                System.out.println("Matriz B + constante:");
                for (int i=0 ; i<2 ; i++){
                    for (int j=0 ; j<2 ;j++){
                        matrizB[i][j] += constante;
                        System.out.printf(" %2d ", matrizB[i][j]);
                    }
                    System.out.println(" ");
                }
            case 4:
                System.out.println("Matriz A:");
                for (int i=0 ; i<2 ; i++){
                    for (int j=0 ; j<2 ;j++){
                        System.out.printf(" %2d ", matrizA[i][j]);
                    }
                    System.out.println(" ");
                }
                System.out.println("Matriz B:");
                for (int i=0 ; i<2 ; i++){
                    for (int j=0 ; j<2 ;j++){
                        System.out.printf(" %2d ", matrizB[i][j]);
                    }
                    System.out.println(" ");
                }
        }
    }
}
