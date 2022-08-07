/*
 * Lista01Ex07.java
 * 
 * 
 */


public class Lista01Ex07 {
	
	public static void main (String[] args) {
		int maior,menor,posicaoMaior,posicaoMaiorColuna = 0,posicaoMenor, posicaoMenorColuna = 0;
		int m1[][] = new int[5][4];
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				m1[linha][coluna] = (int)((Math.random()*20)+1);
			}
		}
		maior = m1[0][0];
		menor = m1[0][0];
		posicaoMenor = 0;
		posicaoMaior = 0;
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				if(m1[linha][coluna] > maior){
					maior = m1[linha][coluna];
					posicaoMaior = linha+1;
					posicaoMaiorColuna = coluna+1;
				}
				if(m1[linha][coluna] < menor){
					menor = m1[linha][coluna];
					posicaoMenor = linha+1;
					posicaoMenorColuna = coluna+1;
				}
			}
		}
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				System.out.print(m1[linha][coluna]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		System.out.println("O maior elemento eh \" "+maior+" \" e esta na linha "+posicaoMaior+" e coluna "+posicaoMaiorColuna);
		System.out.println("O menor elemento eh \" "+menor+" \" e esta na linha "+posicaoMenor+" e coluna "+posicaoMenorColuna);
	}
}

