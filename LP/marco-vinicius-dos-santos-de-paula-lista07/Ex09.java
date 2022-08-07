/*
 * Ex09.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 9) Fazer um programa para contar quantos espaços em branco existem em uma frase
fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;
public class Ex09 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="";
		int contador=0;
		System.out.print("Digite uma frase: ");
		frase = leiaStr.nextLine();
		for(int i=0;i<frase.length();i++){
			if(frase.charAt(i)==' '){
				contador++;
			}
		}
		System.out.println("Existem "+contador+" espaco(s) em branco na frase \""+frase+"\"");
	}
}

