/*
 * Ex07.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 7) Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem, onde
consta o caractere e na frente a quantidade de ocorrências. Caso não tenha ocorrência
apresentar o valor zero. Não diferenciar maiúsculo de minúsculo.
 * 
 * 
 */

import java.util.Scanner;
public class Ex07 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="";
		int contador=0;
		System.out.print("Digite uma frase: ");
		frase = leiaStr.nextLine();
		for(char c='a';c<='z';c++){
			for(int i=0;i<frase.length();i++){
				if(frase.toLowerCase().charAt(i)==c){
					contador++;
				}
			}
			System.out.println("O caracter "+c+" aparece "+contador+" vezes na frase \""+frase+"\"");
			contador=0;
		}
	}
}

