public class SmartTv {
    boolean ligada = false;
    int canal = 25;
    int volume = 25; 

     public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void subirCanal(){
        canal ++; 
    }

    public void diminuirCanal(){
        canal --; 
    }

    public void aumentarVolume(){
        volume ++; 
        System.out.println("Aumentando o volume para "
         + volume);
    }

    public void diminuirVolume(){
        volume --; 
        System.out.println("diminuindo o volume para "
         + volume);
    }

    public void ligar(){
        ligada = true; 

    }
    public void desligar (){
        ligada = false; 
        
    }
}
