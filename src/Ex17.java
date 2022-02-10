package Matrizes;

import java.util.Random;

public class Ex17 {
    public static void main(String[] args) {
//        Leia uma matriz 10 x 3 com as notas de 10 alunos em 3 provas. Em seguida, escreva
//        o numero de alunos cuja pior nota foi na prova 1, o número de alunos cuja pior nota foi
//        na prova 2, e o numero de alunos cuja pior nota foi na prova 3. Em caso de empate
//        das piores notas de um aluno, o critério de desempate  é arbitrário, mas o aluno deve ser
//        contabilizado apenas uma vez.

        Random random = new Random();
        int totalAlunos = 10, totalProvas = 3;
        int[][] notasAlunos = new int[totalAlunos][totalProvas];
        int prova1 = 0, prova2 = 0,prova3 = 0;
        int temp =0, pos=0;


        System.out.println("Resultado das provas: ");
        for (int i=0 ; i< totalAlunos;i++) {
            System.out.println("Aluno "+(i+1)+": ");
            for (int j=0 ; j<totalProvas; j++){
                notasAlunos[i][j] = random.nextInt(10);
                System.out.print("Nota "+(j+1)+": "+notasAlunos[i][j]);
                if(j<totalProvas-1){
                    System.out.print(" - ");
                }
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i=0 ; i< totalAlunos;i++) {
            temp = notasAlunos[i][0];
            for (int j=0 ; j<totalProvas; j++){
                if (notasAlunos[i][j] < temp){
                    temp = notasAlunos[i][j];
                    pos = j;
                }
            }
            if (pos == 0){
                prova1++;
            }
            else if (pos == 1){
                prova2++;
            }
            else {
                prova3++;
            }
            System.out.println("Menor nota do aluno "+(i+1)+": "+temp+" - pos "+(pos+1));
        }
        System.out.println(" ");
        System.out.println("Total com menor nota na prova 1: "+prova1);
        System.out.println("Total com menor nota na prova 2: "+prova2);
        System.out.println("Total com menor nota na prova 3: "+prova3);
    }
}
