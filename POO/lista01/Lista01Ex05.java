/*
 * Lista01Ex05.java
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int linha = 0, coluna = 0;
		do{
			System.out.println("Informe o numero de linhas: ");
			linha = leia.nextInt();
			System.out.println("Informe o numero de colunas: ");
			coluna = leia.nextInt();
			if(linha <= 1){
				System.out.println();
				System.out.println("Entrada invalida, a linha deve ser maior do que 1");
				System.out.println();
			}else{
				if(coluna <= 1){
					System.out.println();
					System.out.println("Entrada invalida, a coluna deve ser maior do que 1");
					System.out.println();
				}
			}
		}while((linha <= 1) || (coluna <= 1 ));
		int m1[][] = new int[linha][coluna];
		int m2[][] = new int[linha][coluna];
		int m3[][] = new int[linha][coluna];
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y ++){
				m1[x][y] = (int)((Math.random()*10)+1);
			}
		}
		for(int x = 0 ; x < m2.length ; x++){
			for(int y = 0 ; y < m2[x].length ; y ++){
				m2[x][y] = (int)((Math.random()*10)+1);
			}
		}
		System.out.println("\n\n\n");
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y ++){
				System.out.print(m1[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		for(int x = 0 ; x < m2.length ; x++){
			for(int y = 0 ; y < m2[x].length ; y ++){
				System.out.print(m2[x][y]+"\t");
			}
			System.out.println();
		}
		for(int x = 0 ; x < m3.length ; x++){
			for(int y = 0 ; y < m3[x].length ; y ++){
				m3[x][y] = (m1[x][y])+(m2[x][y]);
			}
			System.out.println();
		}
		System.out.println("\n\n\n");
		for(int x = 0 ; x < m3.length ; x++){
			for(int y = 0 ; y < m3[x].length ; y ++){
				System.out.print(m3[x][y]+"\t");
			}
			System.out.println();
		}
	}
}

