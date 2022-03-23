import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);


        Conteudo conteudo = new Curso();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());
/*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developver");
        bootcamp.setDescricao("Descricao Bootcamp Java Developver");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLeslie = new Dev();
        devLeslie.setNome("Leslie");
        devLeslie.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Leslie:" +  devLeslie.getConteudosInscritos());
        devLeslie.progredir();
        devLeslie.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Leslie:" +  devLeslie.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Leslie:" +  devLeslie.getConteudosConcluidos());
        System.out.println("XP: " + devLeslie.calcularXp());


        System.out.println("---------------------------------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao:" +  devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Joao:" +  devJoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Joao:" +  devLeslie.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularXp());



    }
}
