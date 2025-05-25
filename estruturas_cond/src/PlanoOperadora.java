import java.util.Scanner;
public class PlanoOperadora {
    public static class Dados {
    String PlanoEscolhido;
    String basic = "100 minutos de ligação";
    String midia = "100 minutos de ligação + Whats e internet gratis"; 
    String turbo = "100 minutos de ligação + Whats e internet gratis = 5G e Youtube";
    
        
    }

    public static void main (String[]args){
    Dados dados = new Dados(); 
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Qual plano desejado?");
    dados.PlanoEscolhido = scanner.next();
    scanner.close();           //toLowerCase converte todas as variaveis para minusculo para q o switch entenda 
    switch(dados.PlanoEscolhido.toLowerCase()){
        case "basic": {
            System.out.println("Beneficios: " + dados.basic);
            break;

        }
        case "midia": {
            System.out.println("Beneficios: " + dados.midia);
            break;
        }
        case "turbo": {
            System.out.println("Beneficios: " + dados.turbo);
        }
        default:
        System.out.println("Indefinido");

        scanner.close();
    }


    }
    
}