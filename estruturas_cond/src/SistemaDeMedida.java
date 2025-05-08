import java.util.Scanner;
public class SistemaDeMedida {

    public static class sigla {
    String sigla;
       
    }
    public static void main(String[]args){
    sigla Sigla = new  sigla();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a sigla da roupa: "); 
    Sigla.sigla = scanner.next();
    
    scanner.close();
     
    //estrutura switch case 
    switch(Sigla.sigla){
        case "p":{
            System.out.println("Pequeno");
            break;
        }
        case "m":{
            System.out.println("Medio");
            break;
        }
        case "g":{ 
            System.out.println("Grande");
            break;
        }
        default:
        System.out.println("INDEFINIDO!!");
    }
        
    }
    
}
