/*
 * ValoresOrdemCrescente.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 7) Escreva um programa em Java para ler dois valores (considere que não serão lidos valores
iguais) e escrevê-los em ordem crescente.
 */

import java.util.Scanner;
public class ValoresOrdemCrescente {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int n1,n2;
		System.out.print("Digite o primeiro numero: ");
		n1 = leia.nextInt();
		System.out.print("Digite o segundo numero: ");
		n2 = leia.nextInt();
		System.out.println(Math.min(n1,n2)+"\t"+Math.max(n1,n2));
		System.out.println();
		//outra maneira
		if(n1 > n2){
			System.out.println(n2+"\t"+n1);
		}else{
			System.out.println(n1+"\t"+n2);
		}
	}
}

