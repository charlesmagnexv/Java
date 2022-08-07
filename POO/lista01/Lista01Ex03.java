/*
 * Lista01Ex03.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int linha = 0, coluna = 0;
		do{
			System.out.println("Informe o numero de linhas: ");
			linha = leia.nextInt();
			System.out.println("Informe o numero de colunas: ");
			coluna = leia.nextInt();
			if(linha <= 0 || linha > 20){
				System.out.println();
				System.out.println("Entrada invalida, a linha deve ser menor ou igual a 20 ou maior do que 0");
				System.out.println();
			}else{
				if(coluna <= 0 || coluna > 20){
					System.out.println();
					System.out.println("Entrada invalida, a coluna deve ser menor ou igual a 20 ou maior do que 0");
					System.out.println();
				}else{
					if(linha != coluna){
						System.out.println();
						System.out.println("Entrada invalida, coluna e linha tem de ter a mesma dimensao");
						System.out.println();
					}
				}
			}
		}while((linha <= 0 || linha > 20) || (coluna <= 0 || coluna >20) || (linha != coluna));
		int m1[][] = new int[linha][coluna];
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y ++){
				m1[x][y] = (int)((Math.random()*100)+1);
			}
		}
		System.out.println("\n\n\n");
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y ++){
				System.out.print(m1[x][y]+"\t");
			}
			System.out.println();
		}
	}
}

