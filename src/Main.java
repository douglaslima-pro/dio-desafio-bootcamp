import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Sintaxe Básica em Java");
		curso1.setDescricao("Curso de sintaxe básica em java.");
		curso1.setCargaHoraria(2);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Estruturas de controle em Java");
		curso2.setDescricao("Curso de estruturas de controle em java.");
		curso2.setCargaHoraria(3);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("Programação Orientada a Objetos em Java");
		curso3.setDescricao("Curso de POO em java.");
		curso3.setCargaHoraria(5);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Programação Orientada a Objetos com Java na prática");
		mentoria1.setDescricao("Aprenda orientação a objetos com um projeto prático.");
		mentoria1.setData(LocalDate.of(2024, 6, 30));
		
		Bootcamp bootcampJava = new Bootcamp();
		bootcampJava.setNome("Santander 2024 - Backend com Java");
		bootcampJava.setDescricao("Aprenda desde os primeiros passos com Java partindo da sintaxe básica até a implementação de uma API utilizando Spring para se tornar um profissional atrativo no mercado.");
		bootcampJava.getConteudos().add(curso1);
		bootcampJava.getConteudos().add(curso2);
		bootcampJava.getConteudos().add(curso3);
		bootcampJava.getConteudos().add(mentoria1);
		System.out.println("Conteúdos do bootcamp " + bootcampJava.getNome());
		bootcampJava.getConteudos().forEach(System.out::println);
		
		Dev douglas = new Dev();
		douglas.setNome("Douglas");
		douglas.inscreverBootcamp(bootcampJava);
		
		
		System.out.println("----------");
		System.out.println(douglas.getNome() + " - Conteúdos inscritos");
		douglas.getConteudosInscritos().forEach(System.out::println);
		
		douglas.progredir();
		douglas.progredir();
		
		System.out.println("----------");
		System.out.println(douglas.getNome() + " - Conteúdos concluídos");
		douglas.getConteudosConcluidos().forEach(System.out::println);
		System.out.println("XP: " + douglas.calcularTotalXp());
		
		douglas.progredir();
		douglas.progredir();
		
		System.out.println("----------");
		System.out.println(douglas.getNome() + " - Conteúdos concluídos");
		douglas.getConteudosConcluidos().forEach(System.out::println);
		System.out.println("XP: " + douglas.calcularTotalXp());

		douglas.progredir();
	}

}