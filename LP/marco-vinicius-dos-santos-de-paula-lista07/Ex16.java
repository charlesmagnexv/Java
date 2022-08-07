/*
 * Ex16.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 16) Escreva um programa que informe se todos os caracteres alfabéticos de uma frase
fornecida pelo usuário são maiúsculos.
 * 
 * 
 */

import java.util.Scanner;
public class Ex16 {
	
	public static void main (String[] args) {
		Scanner leiaStr=new Scanner(System.in);
		String frase="";
		int contador=0;
		System.out.print("Insira uma frase: ");
		frase = leiaStr.nextLine();
		if(frase.equals(frase.toUpperCase())){
			System.out.println("A frase \""+frase+"\" tem APENAS letras MAIUSCULAS");
		}else{
			System.out.println("A frase \""+frase+"\" tem letras minusculas");
		}
	}
}

