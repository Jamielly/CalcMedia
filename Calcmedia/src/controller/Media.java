package controller;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		try (Scanner leitScanner = new Scanner(System.in)) {
			int nota1 = 0;
			int nota2 = 0;
			int media;
			System.out.println("Digite a sua primeira nota: ");
			leitScanner.nextInt();
			System.out.println("Digite a sua segunda nota: ");
			leitScanner.nextInt();
			media = (nota1 + nota2)/2;
			
			if (media <= 4) {
				System.out.println("Reprovado");
			}if(media >= 4) {
				System.out.println("Recuperacao");
				if(media < 6) {
					System.out.println("Recuperacao");
			}if (media < 6) {
				System.out.println("Aprovado!");
			}
		}
		}
	}
}
	
