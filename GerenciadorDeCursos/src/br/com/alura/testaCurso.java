package br.com.alura;

import java.util.List;

public class testaCurso {
	
	public static void main(String[] args) {
		
		Cursos dev = new Cursos("Aprendendo Listas no Java", "Pedro Trebilcock");	
		
		List<Aula> aulas = dev.getAulas();
		
		dev.adiciona(new Aula ("Aprendendo Listas no Java", 22));
		
		System.out.println(aulas);
	}

}
