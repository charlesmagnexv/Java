/*
 * Ex20.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 20) Escreva um programa em Java que leia 100 valores e no final, escreva o maior e o menor valor lido.
 * 
 * 
 */

import java.util.Scanner;
public class Ex20 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int valor,maxi = 0,mini = 0;
		for(int i = 1; i <= 5; i++){
			System.out.print("Digite o proximo numero: ");
			valor = leia.nextInt();
			if(i == 1){
				maxi = valor;
				mini = valor;
			}else{
				if(valor > maxi){
					maxi = valor;
				}
				if(valor < mini){
					mini = valor;
				}
			}
		}
		System.out.println("O menor valor: "+mini);
		System.out.println("O maior valor: "+maxi);
	}
}

