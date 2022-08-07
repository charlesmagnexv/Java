/*
 * Ex013.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 13) Escreva um programa em Java para ler 10 números. Todos os números lidos 
 * com valor inferior a 40 devem ser somados. Escreva o valor final da soma efetuada.
 */

import java.util.Scanner;
public class Ex013 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, soma=0;
		for(int i = 1; i <= 10; i++){
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			if(numero < 40) soma += numero;
		}
		System.out.println("Soma dos numeros maiores do que 40: "+soma);
	}
}

