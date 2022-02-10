import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
//        Leia duas matrizes 4 x 4 e escreva uma terceira com os maiores valores de cada posição
//        das matrizes lidas.

        Random rndm = new Random();
        int[][] matrizA = new int[4][4],matrizB = new int[4][4],matrizC = new int[4][4];

        System.out.println("Matriz A:");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                matrizA[i][j] = rndm.nextInt(50);
                System.out.print(matrizA[i][j]+"  ");
                if(matrizA[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("Matriz B:");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                matrizB[i][j] = rndm.nextInt(50);
                System.out.print(matrizB[i][j]+"  ");
                if(matrizB[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        System.out.println("Matriz C:");
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                matrizC[i][j] = Math.max(matrizA[i][j], matrizB[i][j]);
                System.out.print(matrizC[i][j]+"  ");
                if(matrizC[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
