package list.carrinhoCompras.desafio;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("arroz", 10.0, 10);
        carrinhoDeCompras.adicionarItem("feijão", 15.0, 8);
        carrinhoDeCompras.adicionarItem("macarrão", 8.0, 4);
        carrinhoDeCompras.adicionarItem("carne", 16.0, 3);

        carrinhoDeCompras.removerItem("feijão");

        carrinhoDeCompras.exibirItens();

        System.out.println("Total da copra "+carrinhoDeCompras.calcularValorTotal());

    }
}
