package list.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    public List<Livro> getLivros() {
        return livros;
    }

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int ano) {
        livros.add(new Livro(titulo, autor, ano));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
      List<Livro> listaPorAutor = new ArrayList<>();

      if (!livros.isEmpty()) {
          for (Livro l: livros) {
              if (l.getAutor().equalsIgnoreCase(autor)) {
                  listaPorAutor.add(l);
              }
          }
      }

      return listaPorAutor;
    };

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listaPorAutor = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l: livros) {
                if (anoInicial <= l.getAno() && anoFinal >= l.getAno()) {
                    listaPorAutor.add(l);
                }
            }
        }

        return listaPorAutor;
    };

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> listaPorAutor = new ArrayList<>();

        if (!livros.isEmpty()) {
            for (Livro l: livros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    listaPorAutor.add(l);
                }
            }
        }

        return listaPorAutor;
    };

}
