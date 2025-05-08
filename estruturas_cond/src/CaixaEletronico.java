import java.util.Scanner;
public class CaixaEletronico {
    
    public static class Solicitacao {
        double valorSolicitado = 0;
    
        
    }
    public static void main(String[] args){
    double saldo = 25.5;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o valor solicitado ");
    double valorSolicitado = scanner.nextDouble();

            if(valorSolicitado < saldo){
                saldo = saldo -valorSolicitado; //retira o valor solicitado do saldo 
                
                System.out.println("O seu saldo atual depois do saque e um total de: " + saldo);
            }
            else{
                
                System.out.println("Saldo indisponivel");

            }
      
        
    scanner.close();
    }
    
}
