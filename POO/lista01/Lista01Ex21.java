/*
 * Lista01Ex21.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper
 * 
 * 21) Escreva um programa em Java para gerar uma matriz (N x M) e outra (N x P). Gerar
	uma terceira matriz (N x (M+P)), sendo que para cada linha concatenar suas respectivas
	colunas e apresentar as três matrizes.
 * 
 */


public class Lista01Ex21 {
	
	public static void main (String[] args) {
		int m1[][] = new int[3][4];
		int m2[][] = new int[3][2];
		int coluna2 = 0, linha2 = 0, controlador = 0;
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				m1[linha][coluna] = (int)(Math.random()*20);
			}
		}
		for(int linha = 0 ; linha < m2.length ; linha++){
			for(int coluna = 0 ; coluna < m2[linha].length ; coluna++){
				m2[linha][coluna] = (int)(Math.random()*20);
			}
		}
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				System.out.print(m1[linha][coluna]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int linha = 0 ; linha < m2.length ; linha++){
			for(int coluna = 0 ; coluna < m2[linha].length ; coluna++){
				System.out.print(m2[linha][coluna]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		int m3[][] = new int[3][6];
		for(int linha = 0 ; linha < m3.length ; linha++){
			for(int coluna = 0 ; coluna < m3[linha].length ; coluna++){
				if(coluna < m1[0].length){
					m3[linha][coluna] = m1[linha][coluna];
				}else{
					m3[linha][coluna] = m2[linha2][coluna2];
					coluna2++;
				}
				controlador++;
			}
			if(controlador >= m1[0].length){
				linha2++;
				coluna2 = 0;
			}
		}
		for(int linha = 0 ; linha < m3.length ; linha++){
			for(int coluna = 0 ; coluna < m3[linha].length ; coluna++){
				System.out.print(m3[linha][coluna]+"\t");
			}
			System.out.println();
		}
	}
}

