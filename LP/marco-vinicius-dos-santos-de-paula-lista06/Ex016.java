/*
 * Ex016.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 16) Escreva um programa em Java que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive).
 * 
 */

public class Ex016 {
	
	public static void main (String[] args) {
		int soma=0,c=0;
		double media;
		for(int i = 15; i <= 100; i++){
			soma += i;
			c++;
		}
		media = soma/c;
		System.out.println("A media das notas: "+media);
	}
}

