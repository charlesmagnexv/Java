/*
 * Ex18.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 18) Uma loja está levantando o valor total de todas as mercadorias em estoque. 
 * Escreva um programa em Java que permita a entrada das seguintes informações: a) o número 
 * total de mercadorias no estoque; b) o valor de cada mercadoria. Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
 * 
 * 
 */

import java.util.Scanner;
public class Ex18 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int totalMercadorias;
		double soma=0;
		double valorMercadorias;
		System.out.print("Digite a quantidade de mercadorias existentes no estoque: ");
		totalMercadorias = leia.nextInt();
		for(int i = 1; i<=totalMercadorias; i++){
			System.out.print("Digite o valor da mercadoria "+i+" : ");
			valorMercadorias = leia.nextDouble();
			soma +=valorMercadorias;
		}
		System.out.println("Valor medio das mercadorias: "+(soma/totalMercadorias));
	}
}

