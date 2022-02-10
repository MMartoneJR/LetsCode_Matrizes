public class Ex7 {
    public static void main(String[] args) {
//Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma:
//        A[i][j] = 2i + 7j − 2 se i < j;
//        A[i][j] = 3i² − 1 se i = j;
//        A[i][j] = 4i³ − 5j² + 1 se i > j.
        int[][] matriz = new int[10][10];

        for (int i=0; i <10;i++){
            for (int j=0;j<10;j++){
                if (i<j){
                    matriz[i][j] = 2*i+7*j-2;
                }
                else if (i==j){
                    matriz[i][j] = (int) (3*Math.pow(i,2)-1);
                }
                else{
                    matriz[i][j] = (int) (4*Math.pow(i,3)-5*Math.pow(j,2)+1);
                }
                System.out.printf(" %5d ",matriz[i][j]);
            }
            System.out.println(" ");
        }

    }
}
