/*
 * Ex06.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 6) Escreva um programa que calcule e escreva a quantidade de vezes que um
caractere fornecido pelo usuário aparece em uma frase, também, fornecida pelo
mesmo. Nota Importante: para a contagem, o caractere pode ser maiúsculo ou
minúsculo.
 * 
 * 
 */

import java.util.Scanner;
public class Ex06 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="",caracter="";
		int contador=0;
		System.out.print("Digite uma frase: ");
		frase = leiaStr.nextLine();
		System.out.print("Digite um caracter: ");
		caracter = leiaStr.nextLine();
		for(int i=0;i<frase.length();i++){
			if(frase.toLowerCase().charAt(i)==caracter.toLowerCase().charAt(0)){
				contador++;
			}
		}
		System.out.println("O caracter "+caracter+" aparece na frase "+frase+" exatamente "+contador+" vezes");
	}
}

