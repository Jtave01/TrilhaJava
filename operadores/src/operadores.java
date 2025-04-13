public class operadores {
    public static void main(String[] args) {
    String nome = "joão";
    int idade = 20;
    double altura = 1.72;
    double soma = 10.5 + 20.5;
    int modulo = 10 % 3;
    double resultado = (10 * 7) + (20 / 4);
    
    int num1 = 1;
    int num2 = 2;
    boolean simNao = num1 == num2;
    
    System.out.println("Num1 e igual a num2? " + simNao);

    simNao = num1 != num2;
    
    System.out.println("E diferente? " + simNao);

    //aqui usariamos outros operadores de comparação como >, <, >=, <=
    // operadores logicos &&, ||

    String nonomemme = "linguagem" + "java";
    System.out.println(nonomemme);

    System.out.println(resultado + modulo + nome + idade + altura + soma);    

    }
    }


