package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaMatriculaEAlunos {

	public static void main(String[] args) {

		Cursos javaColecoes = new Cursos("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno b1 = new Aluno("Marcos Varela", 25423);
		Aluno b2 = new Aluno("Vinícus Marmela", 75412);
		Aluno b3 = new Aluno("Vânia Pirelli", 852147);
		
		javaColecoes.matricula(b3);
		javaColecoes.matricula(b2);
		javaColecoes.matricula(b1);
		
		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

	}

}
