/*
 * Ex11.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 11) Escreva um programa que conte e exiba, separadamente, a quantidade de caracteres
alfabéticos e de dígitos numéricos existentes em uma frase fornecida pelo usuário.
 * 
 * 
 */

import java.util.Scanner;
public class Ex11 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="";
		int contadorCaracter=0,contadorNumero=0;
		System.out.print("Digite uma frase: ");
		frase = leiaStr.nextLine();
		for(char c='a';c<='z';c++){
			for(int i=0;i<frase.length();i++){
				if(frase.toLowerCase().charAt(i)==c){
					contadorCaracter++;
				}
			}
		}
		for(int c=0;c<frase.length();c++){
			for(char i='0';i<='9';i++){
				if(frase.charAt(c)==i){
					contadorNumero++;
				}
			}
		}
		System.out.println("A frase \""+frase+"\" contem "+contadorCaracter+" caractere(s) e "+contadorNumero+" numero(s)");
	}
}

