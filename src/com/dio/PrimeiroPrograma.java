package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livro = new Livros();
		
		System.out.println(gato);
		System.out.println(livro);
		
		/*int a = 4;
		int b = 1;
		System.out.println("Hello World! " + (a + b));*/
	}
	
	static class Livros{
		private String nome;
		private String npag;
	}

}
