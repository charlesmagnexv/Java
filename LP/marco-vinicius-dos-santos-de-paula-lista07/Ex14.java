/*
 * Ex14.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 14) Escreva um programa para ler uma frase e um caractere. Sempre que o caractere lido
aparecer na frase ele deve ser substituído por asterisco. Por exemplo, se os valores fornecidos
fossem para a frase: o dia esta nublado, e para o caractere: a, o programa deverá fornecer o
seguinte resultado: o di* est* nubl*do.
 * 
 * 
 */

import java.util.Scanner;
public class Ex14 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		String frase="",letra="",frase2="";
		System.out.print("Digite uma frase: ");
		frase = leiaStr.nextLine().toLowerCase();
		System.out.print("Digite uma letra: ");
		letra = leiaStr.nextLine().toLowerCase();
		frase2=frase.replace(letra.charAt(0),'*');
		System.out.println("Nova frase: "+frase2);
	}
}

