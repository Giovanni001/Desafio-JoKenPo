package com.example.teste;
import java.util.Scanner;


public class Teste {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		String name, resp;
		int resp2;

		do {
			System.out.println("Digite o seu nome: ");
			name = tec.next();
			
			System.out.println("Gostaria de Continuar?  ");
			resp = tec.next();
			
		} while (resp != "N");
	}
}
