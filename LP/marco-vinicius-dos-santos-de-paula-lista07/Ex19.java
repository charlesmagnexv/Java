/*
 * Ex19.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 19) Escreva um programa que leia uma cadeia de caracteres qualquer é determine se a
	palavra lida representa um palíndromo ou não (exemplo de palavras palíndromas: ovo, natan,
	sos, arara, etc).
 * 
 * 
 */

import java.util.Scanner;
public class Ex19 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="";
		System.out.print("Insira uma palavra: ");
		frase=leiaStr.nextLine().toLowerCase();
		String hi = "Hello world";
		String frase2 = new StringBuilder(frase).reverse().toString();
		if(frase.equals(frase2)){
			System.out.println("A palavra \""+frase+"\" eh um palindromo");
		}else{
			System.out.println("A palavra \""+frase+"\" NAO eh um palindromo");
		}
	}
}

