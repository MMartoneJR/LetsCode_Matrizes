import java.util.Objects;
import java.util.Random;

public class Ex15 {
    public static void main(String[] args) {
//        Leia uma matriz 5 x 10 que se refere respostas de 10 questões de múltipla escolha,
//        referentes a 5 alunos. Leia também um vetor de 10 posições contendo o gabarito de
//        respostas que podem ser a, b, c ou d. Seu programa devera comparar as respostas
//        de cada candidato com o gabarito e emitir um vetor denominado resultado, contendo a
//        pontuação correspondente a cada aluno.

        Random respostasAlunos = new Random();
        String[] gabarito = {"b","a","c","b","d","a","a","a","b","d"};
        String[] opcoes = {"a","b","c","d"};
        String[][] provas = new String[5][10];
        String[][] correcao = new String[5][10];

        for (int i=0 ; i<5 ; i++){
            System.out.println("Respostas do aluno "+(i+1)+": ");
            for (int j=0 ; j< 10 ; j++){
                provas[i][j]= opcoes[respostasAlunos.nextInt(4)];
                System.out.print(provas[i][j]+" ");
                if (Objects.equals(provas[i][j], gabarito[j])){
                    correcao[i][j] ="Correto";
                }
                else{
                    correcao[i][j] ="incorreto";
                }
            }
            System.out.println(" ");
        }

        System.out.println("\nGabarito: ");
        for (String s : gabarito) {
            System.out.print(s + " ");
        }

        System.out.println("\n\nCorreção:");
        for (int i=0 ; i<5 ; i++){
            System.out.println("Correção do aluno"+(i+1)+": ");
            for (int j=0 ; j< 10 ; j++){
                System.out.print(correcao[i][j]+" | ");
            }
            System.out.println(" ");
        }

    }
}
