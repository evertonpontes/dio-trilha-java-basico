package devices;

import devices.browser.NavegadorInternet;
import devices.music.ReprodutorMusical;
import devices.phone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.printf("%nExibindo a página da url %s", url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

    public void ligar(String numero) {
        System.out.printf("%nLigando para número %s", numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.printf("%nSelecionando música %s", musica);
    }

}
