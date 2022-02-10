import java.util.Random;

public class Ex11 {
    public static void main(String[] args) {
//        Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos
//         que estão na diagonal secundaria.

        int[][] matriz = new int[3][3];
        Random rndm = new Random();
        int soma = 0;

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matriz[i][j] = rndm.nextInt(10);
                if ((i+j) == (3-1)){
                    soma +=matriz[i][j];
                }
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("Soma da diagonal secundária: "+soma);
    }
}
