/*
 * Lista01Ex06.java
 * 
 * 
 */

import java.util.Scanner;
public class Lista01Ex06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		int linha,coluna,numero,contador = 0;
		int m1[][];
		do{
			System.out.println("Digite a dimensao da linha: ");
			linha = leia.nextInt();
			System.out.println("Digite a dimensao da coluna: ");
			coluna = leia.nextInt();
			if(linha <= 0){
				System.out.println("Numero de linha informado eh invalido");
			}else{
				if(coluna <= 0){
					System.out.println("Numero de coluna eh invalido");
				}
			}
		}while(linha <= 0 || coluna <= 0);
		m1 = new int[linha][coluna];
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y++){
				m1[x][y] = (int)(Math.random()*25);
			}
		}
		System.out.println("Informe um numero: ");
		numero = leia.nextInt();
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y++){
				if(m1[x][y] == numero){
					contador++;
					System.out.println("O numero \" "+numero+" \" aparece na linha \" "+(x+1)+" \" e coluna \" "+(y+1)+" \"");
				}
			}
		}
		System.out.println("\n");
		for(int x = 0 ; x < m1.length ; x++){
			for(int y = 0 ; y < m1[x].length ; y++){
				System.out.print(m1[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n");
		if(contador > 0){
			System.out.println("O numero \" "+numero+" \" aparece na matriz "+contador+" vezes");
		}else{
			System.out.println("O numero \" "+numero+" \" nao aparece na matriz");
		}
	}
}

