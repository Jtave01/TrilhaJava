import java.util.Random;
public class ExmploDo {
    //cria o metodo tocando que diz se atendeu ou nao numa condição de valora aleatorio de 1 e 3 for igual a 1 quer dizer que ele atendeu 
    private static boolean tocando(){
        boolean atendeu = new Random() .nextInt(785666999) == 1; //atenndeu so vai seer verdadeiro quando for 1
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando 
        return ! atendeu;
    }


    public static void main (String [] args){
        System.out.println("Discando.....");
        do{
            System.out.println("Telefone tocando");

        }while(tocando()); // quando o atendeu receber 1o discando termina e passa para linha de baixo
        
        System.out.println("Alo!!!!");
    }
    
}
