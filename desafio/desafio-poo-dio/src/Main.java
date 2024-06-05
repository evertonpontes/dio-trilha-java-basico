import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso java", "descricao curso java", 8);
        Conteudo curso2 = new Curso("Curso js", "descricao curso js", 8);
        Conteudo curso3 = new Curso("Curso python", "descricao curso python", 8);

        Conteudo mentoria1 = new Mentoria("Mentoria java", "descricao mentoria java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(mentoria1);
    }
}