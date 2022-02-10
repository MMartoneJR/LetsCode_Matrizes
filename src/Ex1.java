import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
//        Leia uma matriz 4x4, conte e escreva quantos valores maiores que 10 ela possui.

        Random rndm = new Random();
        int[][] matriz = new int[4][4];
        int count = 0;

        for(int i = 0; i < 4; i++){
            for (int j = 0; j<4; j++){
                matriz[i][j] = rndm.nextInt(30);
                System.out.print("  "+matriz[i][j]);
                if(matriz[i][j] < 10){
                    System.out.print(" ");
                }
                if (matriz[i][j] > 10){
                    count ++;
                }
            }
            System.out.println("");
        }
        System.out.println("Total de valores maiores que 10: "+count);
    }
}
