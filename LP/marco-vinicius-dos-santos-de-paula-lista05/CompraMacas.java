/*
 * CompraMacas.java
 * Marco Vinicius dos Santos de Paula
 * 
 * 
 *3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se
forem compradas pelo menos 12. Escreva um programa em Java que leia o número de maçãs
compradas, calcule e escreva o custo total da compra..
 * 
 */

import java.util.Scanner;
public class CompraMacas {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int macas;
		System.out.print("Digite quantas macas tu compraste: ");
		macas = leia.nextInt();
		if(macas <= 0){
			System.out.println("Entrada invalida!");
		}else{
			if(macas < 12){
				System.out.printf("Preco total: %.2f", macas*1.30);
			}else{
				System.out.println("Preco total " + (macas*1.00));
			}
		}
	}
}

