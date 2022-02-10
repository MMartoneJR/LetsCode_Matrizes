import java.util.Objects;
import java.util.Random;

public class Ex16 {
    public static void main(String[] args) {
//        Faça um programa para corrigir uma prova com 10 questões de múltipla escolha
//        (a, b, c, d ou e), em uma turma com 3 alunos. Cada questão vale 1 ponto.
//        Leia o gabarito, e para cada aluno leia sua matricula (numero inteiro) e suas respostas.
//        Calcule e escreva: Para cada aluno, escreva sua matrícula, suas respostas, e sua nota.
//        O percentual de aprovação, assumindo média 7.0.

        Random random = new Random();
        String[] gabarito = {"b","a","e","b","d","e","a","a","e","d"};
        String[] opcoes = {"a","b","c","d","e"};
        int totalAlunos = 3;
        int totalQuestoes = 10;
        String[][] provas = new String[totalAlunos][totalQuestoes];
        int[] matriculaAluno = new int[totalAlunos];
        int[] notaAluno = new int[totalAlunos];
        String[][] correcao = new String[totalAlunos][totalQuestoes];
        int totalAprovados = 0;
        double percentualAprovados = 0;

        System.out.println("Respotas: ");

        for (int i=0 ; i<totalAlunos ; i++){
            matriculaAluno[i] = random.nextInt(100);
            System.out.println("Aluno "+(i+1)+", matrícula "+matriculaAluno[i]);
            for (int j=0 ; j< totalQuestoes ; j++){
                provas[i][j]= opcoes[random.nextInt(5)];
                System.out.print(provas[i][j]+" ");
                if (Objects.equals(provas[i][j], gabarito[j])){
                    correcao[i][j] ="Correto";
                    notaAluno[i]+=1;
                }
                else{
                    correcao[i][j] ="incorreto";
                }
                if (notaAluno[i]>=7){
                    totalAprovados++;
                }
            }
            System.out.println(" ");
        }

        percentualAprovados = ((float)totalAprovados/totalAlunos)*100;


        System.out.println("\nGabarito: ");
        for (String s : gabarito) {
            System.out.print(s + " ");
        }

        System.out.println("\n\nCorreção:");
        for (int i=0 ; i<totalAlunos ; i++){
            System.out.println("Aluno "+(i+1)+", matrícula "+matriculaAluno[i]);
            for (int j=0 ; j< totalQuestoes ; j++){
                System.out.print(correcao[i][j]+" | ");

            }
            System.out.println("\nNota: "+notaAluno[i]);
            System.out.println(" ");
        }

        System.out.println("Total de aprovados: "+totalAprovados);
        System.out.printf("Percentual de aprovação %.2f", percentualAprovados);
    }
}
