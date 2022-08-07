/*
 * Ex15.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 15) Escreva um programa que informe se em uma frase fornecida pelo usuário existem
caracteres numéricos.
 * 
 * 
 */

import java.util.Scanner;
public class Ex15 {
	
	public static void main (String[] args) {
		Scanner leiaStr=new Scanner(System.in);
		String frase="";
		int contador=0;
		System.out.print("Insira uma frase: ");
		frase=leiaStr.nextLine();
		for(int i=0;i<frase.length();i++){
			for(char c='0';c<='9';c++){
				if(contador==0){
					if(frase.charAt(i)==c){
						System.out.println("A frase \""+frase+"\" tem numeros");
						contador++;
					}
				}
			}
		}
		if(contador==0){
			System.out.println("A frase \""+frase+"\" NAO tem numeros");
		}
	}
}

