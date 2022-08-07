/*
 * MediaAritmetica.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 4) Escreva um programa em Java para ler as notas da primeira e segunda avaliações de um
aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi
ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever
também a média calculada.
 */

import java.util.Scanner;
public class MediaAritmetica {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1,n2;
		double media;
		System.out.print("Digite a primeira nota: ");
		n1 = leia.nextInt();
		System.out.print("Digite a segunda nota: ");
		n2 = leia.nextInt();
		media = (n1+n2)/2.0;
		if(media >= 6){
			System.out.println("APROVADO!");
		}else{
			System.out.println("REPROVADO!");
		}
	}
}

