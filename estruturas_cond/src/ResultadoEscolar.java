
import java.util.Scanner;
public class ResultadoEscolar {
    
    public class nota {
    double nota = 0;
        
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in); //criando objeto que para leitura
        
        System.out.println("Digite sua nota");
        double nota = scanner.nextDouble();
        
        if(nota >= 7){
            System.out.println("Arpovado");
        }
        else{
            System.out.println("Reprovado");

        }
        scanner.close();
    }
    
}
