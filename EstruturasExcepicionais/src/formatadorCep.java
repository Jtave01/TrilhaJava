import java.util.Scanner;
public class formatadorCep {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Entre com o cep");
            String nomeCep = scanner.next();
            //nome é passado para o metodo formatarCep(nome) Lá dentro, vira cep A função retorna a string formatada, como "23.424-323" Essa string vai para cepFormatado, que pode ser usada em seguida
            String cepFormatado = formatarCep(nomeCep);
            System.out.println(cepFormatado);
        } catch (CepinvalidoException e) {
            System.out.println("o cepe nao coresponde");
        }
        scanner.close();
        
    }

      static String formatarCep(String nomeCep) throws CepinvalidoException{
        //se cep tiver mais que 8 linhas lança uma exececao 
        if(nomeCep.length() != 8)
            throw new CepinvalidoException();
                //substrating = recorta pedaços de uma string 
        return nomeCep.substring(0,2) + "." + nomeCep.substring(2,5) + "-" + nomeCep.substring(5);
        
        

    }
    
}



