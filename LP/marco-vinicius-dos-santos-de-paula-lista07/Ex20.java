/*
 * Ex20.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 20) Escreva um programa que receba uma frase, conte e imprima o número de palavras desta
frase.
 * 
 * 
 */

import java.util.Scanner;
public class Ex20 {
	
	public static void main (String[] args) {
		Scanner leiaStr=new Scanner(System.in);
		String frase="";
		int contador=0;
		System.out.print("Insira uma frase: ");
		frase = leiaStr.nextLine();
		
		for(int letra=0;letra<frase.length();letra++){
			if(frase.charAt(letra)==' '){
				contador++;
			}
		}
		System.out.println("\nEssa frase tem "+(contador+1)+" palavra(s)");
		
		
	}
}

