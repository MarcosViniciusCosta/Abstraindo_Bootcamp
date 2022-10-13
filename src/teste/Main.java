package teste;

import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Desenvolvedor;
import dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setCargaHoraria(8);
		curso1.setTitulo("Introdução GitHub");
		curso1.setDescricao("Descricao...");
		
		Curso curso2 = new Curso();
		curso2.setCargaHoraria(10);
		curso2.setTitulo("Introdução VsCode");
		curso2.setDescricao("Descricao...");
		
		
	
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setDataMentoria(LocalDate.now());
		mentoria1.setTitulo("Mentoria dos coachs");
		mentoria1.setDescricao("Descricao...");
		
		Mentoria mentoria2 = new Mentoria();
		mentoria2.setDataMentoria(LocalDate.now());
		mentoria2.setTitulo("Mentoria dos Psicologos");
		mentoria2.setDescricao("Descricao...");
		
		Bootcamp bootcamp1 = new Bootcamp();
		bootcamp1.setDescricao("Descricao");
		bootcamp1.setNome("Java Digital Bugs");
		bootcamp1.getConjuntoAtividades().add(mentoria1);
		bootcamp1.getConjuntoAtividades().add(mentoria2);
		bootcamp1.getConjuntoAtividades().add(curso1);
		bootcamp1.getConjuntoAtividades().add(curso2);
		
		Desenvolvedor desenvolvedor1 = new Desenvolvedor();
		desenvolvedor1.setNome("Marcos");
		desenvolvedor1.cadastrarEmBootcamp(bootcamp1);
		desenvolvedor1.progredir();
		desenvolvedor1.progredir();
		desenvolvedor1.progredir();
		System.out.println("Experiencia do desenvolvedor "
				+ desenvolvedor1.getNome() + " = " + desenvolvedor1.calcularExperienciaTotal());
		
		Desenvolvedor desenvolvedor2 = new Desenvolvedor();
		desenvolvedor2.setNome("Jota");
		desenvolvedor2.cadastrarEmBootcamp(bootcamp1);
		desenvolvedor2.progredir();
		desenvolvedor2.progredir();
		System.out.println("Experiencia do desenvolvedor "
				+ desenvolvedor2.getNome() + " = " + desenvolvedor2.calcularExperienciaTotal());
	
		System.out.println("Conteudos inscritos do desenvolvedor "+ desenvolvedor1.getNome()
		+" = " + desenvolvedor1.getConjuntoAtividadesInscritas());
		System.out.println("Conteudos concluidos do desenvolvedor "+ desenvolvedor1.getNome()
		+" = " + desenvolvedor1.getConjuntoAtividadesConcluidas());
		System.out.println("\n\n\n");
		System.out.println("Conteudos inscritos do desenvolvedor "+ desenvolvedor2.getNome()
		+" = " + desenvolvedor2.getConjuntoAtividadesInscritas());
		System.out.println("Conteudos concluidos do desenvolvedor "+ desenvolvedor2.getNome()
		+" = " + desenvolvedor2.getConjuntoAtividadesConcluidas());
		
	}

}
