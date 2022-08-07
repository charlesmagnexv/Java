/*
 * Lista01Ex24.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 24) Escreva um programa em Java para solicitar ao usuário dimensões de
	uma matriz. Preencher a matriz com os elementos da sequencia de Fibonacci
	e imprimir o resultado.
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex24 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int linha, coluna, y = 0;
		int fibonacci=0,termoAnterior=0,fAtual=1;
		do{
			System.out.println("Digite o numero de linhas da matriz: ");
			linha = leia.nextInt();
			System.out.println("Digite o numero de colunas da matriz: ");
			coluna = leia.nextInt();
			if(linha <= 0){
				System.out.println("Entrada invalida, o numero de linhas deve ser maior do que 0");
			}
			if(coluna <= 0){
				System.out.println("Entrada invalida, o numero de colunas deve ser maior do que 0");
			}
		}while(linha <= 0 || coluna <= 0);
		int m1[][] = new int[linha][coluna];
		for(int x = 0 ; x < m1.length ; x++){
			for(int i = 0 ; i < m1[x].length ;i++){
				if(x == 0 && y == 0){
					m1[x][y] = 0;
					y++;
				}else{
					fibonacci=termoAnterior+fAtual;
					fAtual=termoAnterior;
					termoAnterior=fibonacci;
					m1[x][y] = fibonacci;
					fibonacci=0;
					y++;
				}
			}
			y = 0;
		}
		
		for(int x = 0 ; x < m1.length ; x++){
			for(y = 0 ; y < m1[x].length ; y++){
				System.out.print(m1[x][y]+"\t");
			}
			System.out.println();
		}
	}
}

