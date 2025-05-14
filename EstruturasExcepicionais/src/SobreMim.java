import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
public static class Dados {
    String nome;
    int idade;
    double altura;
    String sobrenome;

    
}

    public static void main(String[] args) {
        //try = dados esperados 
        try{
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US); //uselocale usando padrão americano 
            Dados dados = new Dados();

            System.out.println("Digite seu nome: ");
            dados.nome = scanner.next();
            System.out.println("Digite seu sobrenome: ");
            dados.sobrenome = scanner.next();
            System.out.println("Digite sua idade: ");
            dados.idade = scanner.nextInt(); 
            System.out.println("Digite sua altura: "); 
            dados.altura = scanner.nextDouble(); 

            scanner.close();

            System.out.println("Ola me chamo " + dados.nome.toUpperCase() + " " + dados.sobrenome);
            System.out.println("Tenho " + dados.idade + "anos");
            System.out.println("Tenho " + dados.altura + "metros"); 
        }       
        //captura a exceção de input equivocado de dados, sera exibido X, uma forma mais sutil de apresentar erros para usuarios 
        catch(InputMismatchException e){
         System.out.println("o campo idade e altura precisam ser numericos");
    }
    
  }
}