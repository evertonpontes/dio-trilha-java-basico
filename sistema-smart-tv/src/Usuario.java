public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está no canal "+smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("A tv está no canal "+smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("O volume tv está em "+smartTv.volume);

        System.out.println("A tv está ligada? "+smartTv.ligada);

        smartTv.ligar();

        System.out.println("A tv está ligada? "+smartTv.ligada);

        smartTv.desligar();

        System.out.println("A tv está ligada? "+smartTv.ligada);

    }
}
