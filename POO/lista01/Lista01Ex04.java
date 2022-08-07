/*
 * Lista01Ex04.java
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int linha = 0, coluna = 0, valorMaximo = 0;
		do{
			System.out.println("Informe o numero de linhas: ");
			linha = leia.nextInt();
			System.out.println("Informe o numero de colunas: ");
			coluna = leia.nextInt();
			System.out.println("Informe o vaor maximo dos elementos: ");
			valorMaximo = leia.nextInt();
			if(linha <= 1){
				System.out.println();
				System.out.println("Entrada invalida, a linha deve ser maior do que 1");
				System.out.println();
			}else{
				if(coluna <= 1){
					System.out.println();
					System.out.println("Entrada invalida, a coluna deve ser maior do que 1");
					System.out.println();
				}else{
					if(valorMaximo <= 0){
						System.out.println();
						System.out.println("Entrada invalida, o valor maximo tem de ser maior do que 0");
						System.out.println();
					}
				}
			}
		}while((linha <= 1) || (coluna <= 1 ) || ( valorMaximo <= 0 ));
		int m1[][] = new int[linha][coluna];
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y ++){
				m1[x][y] = (int)((Math.random()*valorMaximo)+1);
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

