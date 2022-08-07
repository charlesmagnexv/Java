/*
 * Ex21.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 21) Escreva um programa que receba uma frase, imprima cada palavras desta frase em uma
linha.
 * 
 * 
 */

import java.util.Scanner;
public class Ex21 {
	
	public static void main (String[] args) {
		Scanner leiaStr=new Scanner(System.in);
		String frase="",palavras[];
		System.out.print("Insira uma frase: ");
		frase = leiaStr.nextLine();
		palavras=frase.split(" ");
		for(int i=0;i<palavras.length;i++){
			System.out.println(palavras[i]);
		}
	}
}

