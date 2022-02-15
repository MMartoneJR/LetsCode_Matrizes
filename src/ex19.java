import java.util.Random;

public class ex19 {
    public static void main(String[] args) {
//        Faç̧a um programa que leia uma matriz de 5 linhas e 4 colunas contendo as seguintes
//        informações sobre alunos de uma disciplina, sendo todas as informações do tipo inteiro:
//          • Primeira coluna: numero de matrícula (use um inteiro)
//          • Segunda coluna: media das provas
//          • Terceira coluna: media dos trabalhos
//          • Quarta coluna: nota final
//         Elabore um programa que:
//          (a) Leia as tres primeiras informações de cada aluno
//          (b) Calcule a nota final como sendo a soma da media das provas e da média dos
//              trabalhos
//          (c) Imprima a matrícula do aluno que obteve a maior nota final (assuma que só existe
//              uma maior nota)
//          (d) Imprima a media aritmética das notas finais

        Random random = new Random();
        int totalAlunos = 5, totalAtributos = 4;
        int[][] notasAlunos = new int[totalAlunos][totalAtributos];
        int melhorAluno =0, temp=0;
        double mediaGeral = 0;

        for (int i=0 ; i<totalAlunos ; i++){
            System.out.println("Aluno "+(i+1)+": ");
            for (int j=0 ; j < totalAtributos ; j++){
                if (j==0){
                    notasAlunos[i][j] = random.nextInt(1000);
                    System.out.println("Matrícula do aluno: "+notasAlunos[i][j]);
                }
                else if (j==1){
                    notasAlunos[i][j] = random.nextInt(10);
                    System.out.println("Média das provas: "+notasAlunos[i][j]);
                }
                else if (j==2){
                    notasAlunos[i][j] = random.nextInt(10);
                    System.out.println("Média dos trabalhos: "+notasAlunos[i][j]);
                }
                else{
                    notasAlunos[i][j] = (notasAlunos[i][j-1] + notasAlunos[i][j-2]);
                    System.out.println("Média geral: "+notasAlunos[i][j]);
                    mediaGeral += notasAlunos[i][j];
                }
            }
            System.out.println(" ");
        }

        for (int i=0 ; i<totalAlunos ; i++){
            //temp = notasAlunos[i][0];
            if (notasAlunos[i][3] > temp){
               temp = notasAlunos[i][3];
               melhorAluno = notasAlunos[i][0];
            }

        }
        System.out.println("Matrícula do aluno com maior nota final: "+melhorAluno);
        mediaGeral /= totalAlunos;
        System.out.printf("Media geral das notas finais: %.2f", mediaGeral);


    }
}
