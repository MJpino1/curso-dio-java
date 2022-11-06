import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Js");
		curso2.setDescricao("Descrição curso Js");
		curso2.setCargaHoraria(4);
		
		Conteudo conteudo = new Curso(); // polimorfismo
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria Java");
		mentoria1.setDescricao("Descrição Mentoria Java");
		mentoria1.setData(LocalDate.now());
		
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição do Bootcamp");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devMikel = new Dev();
		devMikel.setNome("Mikel");
		devMikel.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos" + devMikel.getConteudoInscritos());
		devMikel.progredir();
		devMikel.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos" + devMikel.getConteudoInscritos());
		System.out.println("Conteúdos concluidos" + devMikel.getConteudoConcluidos());
		System.out.println("XP: " + devMikel.calcularTotalXp());

		
		System.out.println("-----------------");
		
		
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos inscritos" + devJoao.getConteudoInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos inscritos" + devJoao.getConteudoInscritos());
		System.out.println("Conteúdos concluidos" + devJoao.getConteudoConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());

		
		
	}

}
