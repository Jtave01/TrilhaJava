public class aboutme {
    public static void main(String[] args) {
        
        String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.parseInt(args[2]); //converte o que digitado(string) pra inteiro 
        double altura = Double.parseDouble(args[3]); //converte o que e digitado para double  // isso caso vc queira manipular esses dados depois, caso so queira printa não faz diferencia 

        System.out.println("Olá, me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Eu tenho " + idade + " anos e minha altura é " + altura + " metros.");
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura + " metros.");
    }
}