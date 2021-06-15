package com.example.game;

import java.util.Scanner;

public class JoKenPo {

	public static void main(String[] args) {
		int player, computer, playerCounter = 0, computerCounter = 0, empates = 0;
		int counter = 0;
		String name;
		int resp = 0;
		boolean validName = true;
		
		Scanner tec = new Scanner(System.in);

		do {
			System.out.println("Vamos jogar JoKenPo ?");
			System.out.println("");
			
			System.out.println("Digite o seu nome: ");
			name = tec.next();
			
			player = 0;
			
			while(counter < 10) {
				do {
					System.out.println("1: Pedra");
					System.out.println("2: Papel");
					System.out.println("3: Tesoura");
					System.out.println("Escolha uma opção");
					
					System.out.println("");
					player = tec.nextInt();
					
					if(player > 3) {
						System.out.println("Opção Inválida, digite novamente!");
					}
				} while (player > 3);
				
				
				switch(player) {
				case 1:
					System.out.printf("%s escolheu Pedra", name);
					break;
				
				case 2:
					System.out.printf("%s escolheu Papel", name);
					break;
				
				case 3:
					System.out.printf("%s escolheu Tesoura", name);
					break;
				}
				
				System.out.println("");
				computer = (int)(Math.random()* 3 + 1);
				
				switch(computer) {
				case 1:
					System.out.println("Computador escolheu Pedra");
					break;
				
				case 2:
					System.out.println("Computador escolheu Papel");
					break;
				
				case 3:
					System.out.println("Computador escolheu Tesoura");
					break;
				}
				
					if(player == computer) {
						System.out.println("EMPATE");
						empates++;
					} else {
						if ((player == 1 && computer  == 3) || (player == 2 && computer == 1) || (player == 3 && computer == 2)) {
							System.out.printf("JOGADOR VENCEU ESSA RODADA");
							playerCounter++;
						}
						else {
							System.out.println("COMPUTADOR VENCEU ESSA RODADA");
							computerCounter++;
						}
					}
				counter++;
				System.out.println("");
			}
			
			if(playerCounter == computerCounter) {
				System.out.printf("%s você empatou!", name);
			} else {
				if(playerCounter > computerCounter) {
					System.out.printf("Parabéns %s! Voce Vencêu :D", name);
				} else System.out.printf("Que pena %s! Você Perdeu :(", name);
			}
			System.out.println("");
			
			System.out.println("--------------------PLACAR-----------------");
			System.out.println("VITORIAS DO COMPUTADOR: " + computerCounter);
			System.out.println("VITORIAS DO JOGADOR: " + playerCounter);
			System.out.println("Empates: " + empates);
			counter = 0;
			
			System.out.println("Gostaria de Continuar ?");
			System.out.println("");
			
			System.out.println("Paga continuar digite [1]\nPara Finalizar o jogo digite [0]");
			resp = tec.nextInt();
			
		} while(resp != 0);

		System.out.println("Jogo Finalizado!");
			
	}
}
