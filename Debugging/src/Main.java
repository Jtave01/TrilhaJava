public class Main{
    //O metodo main e o primeiro a iniciar e o ultimo a terminar(O metodo que executa o progama)
    public static void main(String [] args){
         System.out.println("Inicio o progama do metodo main");
                a();
            System.out.println("Finalizou o progama do metodo main");
 }
  static void a(){
        System.out.println("Entrou o metodo a ");
        b();
         System.out.println("Finalizou  o metodo a ");
  }
  static void b(){
        System.out.println("Entrou o metodo b");
        for(int i = 0; i <=4; i++)
            System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b");
  }
  static void c(){
        System.out.println("Entrou o metodo c");
       //Thread.dumpStack(); //Ler de baixo para cima
        System.out.println("Finalizou o metodo c");
  }
}