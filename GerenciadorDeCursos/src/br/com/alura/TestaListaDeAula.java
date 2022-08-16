package br.com.alura;

import java.util.ArrayList;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		Aula a1 = new  Aula("Revistando as ArraysLists", 21);
		Aula a2 = new  Aula("Listas de objetos", 20);
		Aula a3 = new  Aula("Relacionamento de Listas e Objetos", 15);
		
		ArrayList<Aula> ListaDeAula = new ArrayList<>();
		ListaDeAula.add(a1);
		ListaDeAula.add(a2);
		ListaDeAula.add(a3);
		
		ListaDeAula.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println(ListaDeAula);
	}

}
