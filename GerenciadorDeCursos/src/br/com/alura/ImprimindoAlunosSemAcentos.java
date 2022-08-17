package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {

	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Nico");
		
		System.out.println(alunos.size());

		
		for (String Aluno : alunos) {
			System.out.println(Aluno);
			
		}
		
		alunos.add("Nico");
		
		System.out.println(alunos.size());
		
		boolean adicionou = alunos.add("Pedro");
		System.out.println("Pedro foi adicionado ao Set? " + adicionou);
		
		System.out.println(alunos);
		System.out.println(alunos.size());



	}
	
}
