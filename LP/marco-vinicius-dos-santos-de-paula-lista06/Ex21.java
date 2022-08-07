/*
 * Ex21.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 21) Escreva um programa em Java para ler uma quantidade e a seguir ler esta 
 * quantidade de números. Depois de ler todos os números o algoritmo deve apresentar na tela o maior dos números lidos e a média dos números lidos.
 * 
 * 
 */

import java.util.Scanner;
public class Ex21 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int quantidade,maxi=0, valor;
		double soma = 0;
		do{
			System.out.print("Digite a quantidade de numeros: ");
			quantidade = leia.nextInt();
		}while(quantidade == 0 || quantidade < 0);
		for(int i=1; i<=quantidade;i++){
			System.out.print("Digite o valor "+i+" : ");
			valor = leia.nextInt();
			if(i == 1){
				maxi = valor;
			}else{
				if(valor>maxi){
					maxi = valor;
				}
			}
			soma+=valor;
		}
		System.out.println("Media dos valores lidos: "+soma/quantidade);
		System.out.println("Maior valor lido: "+maxi);
	}
}

