public class Ex2 {
    public static void main(String[] args) {
//        Declare uma matriz 5 x 5. Preencha com 1 a diagonal principal e com 0 os demais
//        elementos. Escreva ao final a matriz obtida.
        int[][] matriz = new int[5][5];
        //int val = 0;

        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (i==j){
                    matriz[i][j]=1;
                }
                else{
                    matriz[i][j]=0;
                }
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("");
        }

    }
}
