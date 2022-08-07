/*
 * Ex22.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 22) Dados uma frase e uma palavra, escreva um programa que verifique o número de vezes
que a palavra ocorre na frase. Exemplo: Na frase ANA E MARIANA GOSTAM DE BANANA, a
palavra ANA ocorre 4 vezes.
 * 
 */

import java.util.Scanner;
public class Ex22 {
	
	public static void main (String[] args) {
		Scanner leiaStr=new Scanner(System.in);
		String frase="",palavra="",recorte="";
		int contador=0;
		System.out.print("Insira uma frase: ");
		frase = leiaStr.nextLine();
		System.out.print("Insira agora a palavra: ");
		palavra = leiaStr.nextLine();
		for(int letra=0;letra<=frase.length()-palavra.length();letra++){
			recorte=frase.substring(letra,letra+palavra.length());
			if(recorte.equalsIgnoreCase(palavra)){
				contador++;
			}
		}
		System.out.println("A palavra \""+palavra+"\" apareceu "+contador+"vezes");
	}
}

