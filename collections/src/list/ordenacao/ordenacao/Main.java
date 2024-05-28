package list.ordenacao.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("nome 1", 18, 1.60);
        ordenacaoPessoas.adicionarPessoa("nome 2", 15, 1.65);
        ordenacaoPessoas.adicionarPessoa("nome 3", 23, 1.80);
        ordenacaoPessoas.adicionarPessoa("nome 4", 21, 1.79);
        ordenacaoPessoas.adicionarPessoa("nome 5", 16, 1.58);
        ordenacaoPessoas.adicionarPessoa("nome 6", 20, 1.82);

        System.out.println(ordenacaoPessoas.pessoas);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
