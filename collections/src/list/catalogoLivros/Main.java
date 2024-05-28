package list.catalogoLivros;

public class Main {

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 2", "autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 3", "autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "autor 3", 2008);
        catalogoLivros.adicionarLivro("Livro 5", "autor 4", 1989);
        catalogoLivros.adicionarLivro("Livro 6", "autor 5", 2019);

        System.out.println(catalogoLivros.getLivros());

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2018, 2024));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 5"));

    }
}
