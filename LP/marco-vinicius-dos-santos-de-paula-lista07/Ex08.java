/*
 * Ex08.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 8) Escreva um programa para ler uma frase fornecida pelo usuário e contar a
quantidade de cada caractere do alfabeto, imprimindo ao final uma listagem onde
consta o caractere e na frente a quantidade de ocorrências. Caso a quantidade de
ocorrências de um caractere seja zero, não apresentar o caractere na listagem. Não
diferenciar maiúsculo de minúsculo.
 * 
 * 
 */

import java.util.Scanner;
public class Ex08 {
	
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
			if(contador>0){
				System.out.println("O caracter "+c+" aparece "+contador+" vezes na frase \""+frase+"\"");
			}
			contador=0;
		}
	}
}

