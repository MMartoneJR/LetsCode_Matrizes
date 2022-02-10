import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
//        Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estão acima
//        da diagonal principal.

        int[][] matriz = new int[3][3];
        int soma = 0;
        Random rndm = new Random();

        for (int i =0; i<3; i++){
            for(int j=0; j<3;j++){
                matriz[i][j] = rndm.nextInt(20);
                System.out.print(matriz[i][j]+"  ");
                if(matriz[i][j] < 10){
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(j>i) {
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("Resultado: "+soma);

    }
}