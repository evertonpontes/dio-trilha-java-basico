package list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Pessoa 1", 19, 1.8);
        ordenacaoPessoa.adicionarPessoa("Pessoa 2", 18, 1.4);
        ordenacaoPessoa.adicionarPessoa("Pessoa 3", 29, 1.88);
        ordenacaoPessoa.adicionarPessoa("Pessoa 4", 17, 1.6);
        ordenacaoPessoa.adicionarPessoa("Pessoa 5", 30, 1.72);
        ordenacaoPessoa.adicionarPessoa("Pessoa 6", 21, 1.5);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
