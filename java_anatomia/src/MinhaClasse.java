public class MinhaClasse {

    public static void main(String [] args){
    //String BR = "brasil";
    //int numero1 = 200;
    //int numero = 1; int numero2 = 2; 
    //double altura = 1.72;
    //String nome ="Gleison";
    //boolean verdade = true; 
    //int soma = numero1 = numero2;
    String primeironome = "João"; String segundonome = "Victor";

    String nomeCompleto = nomeCompleto(primeironome, segundonome);
    System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return "Resultado" + primeiroNome.concat(" ").concat(segundoNome);
        
    }

}

