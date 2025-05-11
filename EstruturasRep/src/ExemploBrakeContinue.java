public class ExemploBrakeContinue {
    public static void main (String [] args){
        for(int numero = 1; numero <=5; numero ++){
            if(numero ==3)
                break;
                //para a plicação se fosse um continue ele nao pararria porem nao imprimiria o numero, ia desconsiderar ele
                System.out.println(numero);

        } 
    }
    
}
