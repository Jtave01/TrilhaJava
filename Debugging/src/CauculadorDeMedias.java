import java.util.Scanner;
public class CauculadorDeMedias {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String [ ] alunos = {"camila", "Lucas", "Bruna", "felipe", "pedro"};
        int media = cauculaMediaDaTurma(alunos, scan);
        System.out.printf("A media da turma e %d", media);

    }
    public static int cauculaMediaDaTurma (String[] alunos, Scanner scanner){
        int soma = 0;
        for(String aluno: alunos){
            System.out.printf("nota do aluno %s " , aluno);
            int nota = scanner.nextInt();
            soma += nota;

        }
     return soma / alunos.length;
    }
}

//Debugando esse codigo achamos um erro, pois as variaveis sao int, porem para uma divisão nao exata e nescessario que elas sejam double