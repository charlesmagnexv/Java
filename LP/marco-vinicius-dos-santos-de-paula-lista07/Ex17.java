/*
 * Ex17.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 17) Escreva um programa que leia duas frases e a seguir informe se as frases fornecidas são
iguais. Observação: realizar esta verificação caractere por caractere.
 * 
 * 
 */

import java.util.Scanner;
public class Ex17 {
	
	public static void main (String[] args) {
		Scanner leiaStr=new Scanner(System.in);
		String frase="",frase2="";
		System.out.print("Insira uma frase: ");
		frase = leiaStr.nextLine();
		System.out.print("Insira uma segunda frase: ");
		frase2 = leiaStr.nextLine();
		if(frase.equals(frase2)){
			System.out.println("As frases sao IGUAIS");
		}else{
			System.out.println("As frases NAO sao iguais");
		}
	}
}

