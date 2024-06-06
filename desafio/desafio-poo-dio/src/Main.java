import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso java", "descricao curso java", 8);
        Conteudo curso2 = new Curso("Curso js", "descricao curso js", 8);
        Conteudo curso3 = new Curso("Curso python", "descricao curso python", 8);

        Conteudo mentoria1 = new Mentoria("Mentoria java", "descricao mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp java developers", "descricao Bootcamp Java Developers");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        // System.out.println(bootcamp.getConteudos());

        System.out.println(" ");

        System.out.printf("*--------------------*%n" +
                "| Criando devEverton |%n" +
                "*--------------------*%n"
        );

        System.out.println(" ");


        Dev devEverton = new Dev("Everton");
        devEverton.inscreverBootcamp(bootcamp);

        System.out.printf("Conteúdos inscritos de %s%n%s%n", devEverton.getNome(), devEverton.getConteudosInscritos());
        System.out.println("------");
        devEverton.progredir();
        devEverton.progredir();
        System.out.printf("Conteúdos inscritos de %s%n%s%n", devEverton.getNome(), devEverton.getConteudosInscritos());
        System.out.printf("Conteúdos concluidos de %s%n%s%n", devEverton.getNome(), devEverton.getConteudosConcluidos());
        System.out.printf("Calcular xp de %s: '%.2f'%n", devEverton.getNome(), devEverton.calculcarTotalXp());

        System.out.println(" ");

        System.out.printf("*-----------------*%n" +
                "| Criando devJoao |%n" +
                "*-----------------*%n"
        );

        System.out.println(" ");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.printf("Conteúdos inscritos de %s%n%s%n", devJoao.getNome(), devJoao.getConteudosInscritos());
        System.out.println("------");
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.printf("Conteúdos inscritos de %s%n%s%n", devJoao.getNome(), devJoao.getConteudosInscritos());
        System.out.printf("Conteúdos concluidos de %s%n%s%n", devJoao.getNome(), devJoao.getConteudosConcluidos());
        System.out.printf("Calcular xp de %s: '%.2f'%n", devJoao.getNome(), devJoao.calculcarTotalXp());

    }
}