import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição do curso de Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descrição do curso de Javascript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição da Mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		
//		System.out.println(curso1);
//		System.out.println(curso2);
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamop Java Developer");
		bootcamp.setDescricao("Descrição do Bootcvamp de Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devALexandre = new Dev();
		devALexandre.setNome("Alexandre Barreto");
		devALexandre.inscreverBootcamp(bootcamp);
		
		System.out.println("---------------------------");
		System.out.println("Conteudos Inscritos: \n" + devALexandre.getConteudosInscritos());
		System.out.println("---------------------------");
		
		devALexandre.progradeir();
		System.out.println("-");
		
		System.out.println("Conteudos Inscritos: " + devALexandre.getConteudosInscritos());
		System.out.println("Conteudos Concluidos: " + devALexandre.getConteudosConcluidos());
		System.out.println("---XP---" + devALexandre.calcularTotalXp());

		System.out.println("---------------------------");
		
		Dev devSamia = new Dev();
		devSamia.setNome("Samia ALeixo");
		devSamia.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + devSamia.getConteudosInscritos());
		
		devSamia.progradeir();
		
		System.out.println("Conteudos Inscritos: " + devSamia.getConteudosInscritos());
		System.out.println("Conteudos Concluídos: " + devSamia.getConteudosConcluidos());
		System.out.println("---XP---" + devALexandre.calcularTotalXp());
	}

}
