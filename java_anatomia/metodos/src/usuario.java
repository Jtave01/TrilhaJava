import java.util.Scanner;
public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        Scanner scanner = new Scanner(System.in);

        smartTv.ligar();
        System.out.println("Deseja ligar a tv?");
        int ligar = scanner.nextInt();
        if (ligar == 1) {
            System.out.println("Estado atual da tv: " + " "  + "canal: " + smartTv.canal  + "" +  " Volume: " + smartTv.volume);
            smartTv.ligar();
        
                System.out.println("Selecione uma opção, 1: Diminuir volume, 2: Aumentar volume, 3: mudar de canal ");
                int op = scanner.nextInt();
                if (op == 1) {
                    smartTv.diminuirVolume();
                    System.out.println("volume: " + smartTv.volume);
                    System.out.println("canal:" + smartTv.canal);
                }
                if (op == 2) {
                    smartTv.aumentarVolume();
                    System.out.println("volume: " + smartTv.volume);
                    System.out.println("canal:" + smartTv.canal);
                }
                if(op == 3 ){
                    System.out.println("Digite o novo canal");
                    smartTv.canal = scanner.nextInt();
                    smartTv.mudarCanal(smartTv.canal);
                    System.out.println("O canal atual e: " + smartTv.canal);
                
                }
        
            }
        if (ligar == 2) {
            smartTv.desligar();
            System.out.println("Tv desligada "); 
        }
        
        scanner.close();
        

       

    }
}
