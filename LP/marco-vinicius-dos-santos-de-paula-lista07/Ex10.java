/*
 * Ex10.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 10) Escreva um programa que calcule e escreva a quantidade de letras maiúsculas de uma
frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;
public class Ex10 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="";
		int contador=0;
		System.out.print("Digite uma frase: ");
		frase = leiaStr.nextLine();
		for(char c='A';c<='Z';c++){
			for(int i=0;i<frase.length();i++){
				if(frase.charAt(i)==c){
					contador++;
				}
			}
			if(contador>0){
				System.out.println("A frase \""+frase+"\" contem "+contador+" letra(s) maiuscula(s)");
			}
			contador=0;
		}
	}
}

