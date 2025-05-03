import java.util.Locale;
import java.util.Scanner;

public class about2 {


    public class dados{
        double altura = 0; 
        String nome;
        
    }

    public static void main(String[]args){

        //criando o objeto scanner, semelhante ao scanf

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("A sua altura e: " + altura);
        System.out.println("O seu nome é: " + nome);

        scanner.close();

    }
}