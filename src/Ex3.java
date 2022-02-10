public class Ex3 {
    public static void main(String[] args) {
//Faça um programa que preenche uma matriz 4 x 4 com o produto do valor da linha e da
//coluna de cada elemento. Em seguida, imprima na tela a matriz.

        int[][] matriz = new int[4][4];

        for (int i=0; i<4;i++){
            for (int j=0; j<4;j++){
                matriz[i][j] = i*j;
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }
    }
}
