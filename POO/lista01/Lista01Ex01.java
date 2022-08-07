/*
 * Lista01Ex01.java
 * 
 */

import java.util.Scanner;
public class Lista01Ex01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int m1[][] = new int[4][5];
		for(int linha = 0; linha < m1.length; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				System.out.println("Digite o elemento da linha "+linha+" e coluna "+coluna+": ");
				m1[linha][coluna] = leia.nextInt();
			}
		}
		for(int linha = 0; linha < m1.length; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				System.out.print(m1[linha][coluna]+" ");
			}
			System.out.println();
		}
	}
}

