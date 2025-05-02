public class conta {
   double saldo = 10.00; 

   public void sacar(Double valor){
   // double novoSaldo = saldo - valor;
   }
   public void imprimirSaldo(){
    System.out.println("o saldo é: " + saldo);
   // System.out.println(novoSaldo);  // Erro: novoSaldo não é reconhecido aqui porque esclusiva ao metodo sacar 
   }
}
