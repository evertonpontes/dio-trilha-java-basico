import devices.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.ligar("123456789");
        iphone.selecionarMusica("Billie Jean - Micheal Jackson");
        iphone.exibirPagina("www.google.com");
    }
}
