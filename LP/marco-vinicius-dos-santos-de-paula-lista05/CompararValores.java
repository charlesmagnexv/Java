/*
 * CompararValores.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 6) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrever o maior deles.
 */

import java.util.Scanner;
public class CompararValores {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1,n2;
		System.out.print("Digite o primeiro valor: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo valor: ");
		n2 = leia.nextInt();
		if(n1==n2){
			System.out.println("Entrada invalida");
		}else{
			System.out.println("O maior valor eh: "+(Math.max(n1,n2)));
		}
	}
}

