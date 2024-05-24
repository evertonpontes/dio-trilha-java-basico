package list.carrinhoCompras.desafio;

import java.util.*;

public class CarrinhoDeCompras {
    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    };

    public void adicionarItem(String nome, double preco, int quantidade) {
        itens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensDeletar = new ArrayList<>();
        if(!itens.isEmpty()) {
            for(Item i: itens) {
                if(i.getNome().equalsIgnoreCase(nome)) {
                    itensDeletar.add(i);
                }
            }
            itens.removeAll(itensDeletar);
        } else {
            System.out.println("A Lista está vazia.");
        }
    }

    public double calcularValorTotal() {
        double total = 0;

        if (!itens.isEmpty()) {
            for(Item i: itens) {
                total += i.getQuantidade()*i.getPreco();
            }
        }

        return total;
    }

    public void exibirItens() {
        System.out.println(itens);
    }

}
