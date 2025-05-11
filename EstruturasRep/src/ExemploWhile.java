import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    //criando o metodo q atribui um valor aleatorio a variavel valor doce 
    private static double valorAleatorio(){ 
        return ThreadLocalRandom.current().nextDouble(2, 15);  
      }
  

    public static void main (String[] args){
        double mesada = 50.0;
        //enquanto a mesada for maior que zero, o metodo vai gerar numeros aleatorios 
        while (mesada>0) {
            //atribuindo o valor aleatorio na variavel valorDoce
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada)
                valorDoce = mesada;
            
            System.out.println("Doce do valor: " + valorDoce + "Adicionado no carrinho");
            mesada = mesada - valorDoce;

        }
        System.out.println("MEsada: " + mesada);
        System.out.println("JOaozinho gastou toda mesada");
    } 
    

   
    
}
