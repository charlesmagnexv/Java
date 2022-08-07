/*
 * Lista01Ex23.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 23) Escreva um programa em Java para solicitar ao usuário dimensões de uma matriz.
	Preencher a matriz com os elementos da sequencia de Primos e imprimir o resultado.
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex23 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int linha, coluna, numeroAleatorio = 0, contadorPrimo = 0;
		do{
			System.out.println("Digite a quantidade de linhas: ");
			linha = leia.nextInt();
			System.out.println("Digite o numero de colunas: ");
			coluna = leia.nextInt();
			if(linha <=0 ){
				System.out.println("\n");
				System.out.println("O numero de linhas deve ser maior do que zero");
				System.out.println("\n");
			}else{
				if(coluna <= 0 ){
					System.out.println("\n");
					System.out.println("O numero de colunas deve ser maior do que zero");
					System.out.println("\n");
				}
			}
		}while(linha <= 0 || coluna <= 0);
		int m1[][] = new int[linha][coluna];
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y++){
				do{
					contadorPrimo = 0;
					numeroAleatorio = (int)((Math.random()*100)+1);
					for(int numero = numeroAleatorio ; numero >= 1 ; numero--){
						if(numeroAleatorio % numero == 0){
							contadorPrimo++;
						}
					}
				}while(contadorPrimo != 2);
				m1[x][y] = numeroAleatorio;
				numeroAleatorio = 0;
			}
		}
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y++){
				System.out.print(m1[x][y]+"\t");
			}
			System.out.println();
		}
	}
}

