/*
 * Media10Numeros.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 10) Escreva um programa em Java para ler 10 valores, calcular e escrever a média aritmética desses valores lidos.
 * 
 */

import java.util.Scanner;
public class Media10Numeros {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int i,numero,soma=0;
		for(i = 0 ;i<10;i++){
			System.out.print("Entre com uma nota: ");
			numero = leia.nextInt();
			if(numero<0){
				while(numero<0){
					System.out.print("Entre com uma nota: ");
					numero = leia.nextInt();
				}
			}
			soma += numero;
		}
		System.out.println("Media: "+(soma/10));
	}
}

