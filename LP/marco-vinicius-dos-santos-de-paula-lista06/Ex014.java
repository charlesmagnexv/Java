/*
 * Ex014.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 14) Escreva um programa em Java para ler 2 valores, calcular 
 * e escrever a soma dos inteiros existentes entre os 2 valores lidos (
 * incluindo os valores lidos na soma). Considere que o segundo valor lido será sempre maior que o primeiro valor lido.
 * 
 * 
 */

import java.util.Scanner;
public class Ex014 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1,numero2, soma=0;
		System.out.print("Digite o valor 1 : ");
		numero1 = leia.nextInt();
		System.out.print("Digite o valor 1 : ");
		numero2 = leia.nextInt();
		while(numero2<=numero1){
			System.out.print("Digite o valor 1 : ");
			numero2 = leia.nextInt();
		}
		for(int i = numero1; i <= numero2; i++){
			soma += i;
		}
		System.out.println("Soma dos inteiros entre os numero lidos: "+soma);
	}
}

