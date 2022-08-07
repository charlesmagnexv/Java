/*
 * Ex12.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 12) Escreva um programa que conta e exibe a quantidade de vezes que cada vogal ocorre em
uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;
public class Ex12 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="";
		int contador=0;
		System.out.print("Digite uma frase: ");
		frase = leiaStr.nextLine();
		for(char c='a';c<='z';c++){
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				for(int i=0;i<frase.length();i++){
					if(frase.toLowerCase().charAt(i)==c){
						contador++;
					}
				}
			}
		}
		System.out.println("A frase \""+frase+"\" tem "+contador+" vogal(is)");
	}
}

