import java.util.Scanner;
public class CondTernaria {
    
    public static class nota {
    double nota = 0;
        
    }
    public static void main(String[]args){
        nota Nota = new nota(); //criando objeto que busca a classe da nota "Nota.nota"
        Scanner scanner = new Scanner(System.in); //criando objeto de leitura 

        System.out.println("Digitee sua nota: ");
        Nota.nota = scanner.nextDouble();

        scanner.close();
        //Condição ternaria 
        String resultado = Nota.nota >= 7 ? "aprovado" : Nota.nota >=5 &&  Nota.nota <7 ?  "recuperação" : "reprovado";

       System.out.println(resultado);
    }
    
}
