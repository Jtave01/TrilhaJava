public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("tv ligada ? " + smartTv.ligada);
        System.out.println("Estado atual da tv: " + ""  + "canal: " + smartTv.canal  + "" +  " Volume: " + smartTv.volume);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Tv ligada ? " +  smartTv.ligada);
        System.out.println("Volume atual: " + smartTv.volume);

       

    }
}
