import java.text.NumberFormat;
                  //classe pro try catch 
import java.text.ParseException;
public class ExExcecao {
    public static void main(String[]args){
                              //cdigo para converter String em numero porem com um caracter indevido "a"           
        //Number valor = Double.valueOf("a1.75");
        //System.out.ptintln("valor");
        //nesse formato o codigo nao pediria para para tratar a execao porem ainda daria erro ja no de baixo sim 


        Number valor;
        try {       //Obtém formatador de número padrão do sistema            //Classe para formatar e analisar números de forma local (como casas decimais com vírgula ou ponto).
            valor = NumberFormat.getInstance() .parse("1.75");
            System.out.println(valor);
        } catch (ParseException e) {
          
            e.printStackTrace();
        }
        

    }
    
}
