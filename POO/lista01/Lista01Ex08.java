/*
 * Lista01Ex08.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 8) Escreva um programa em Java para gerar uma matriz F (N x M). Criar os
	vetores IMPAR e PAR com a quantidade de elementos (ímpares / pares) da
	matriz. Imprimir a matriz e os vetores. Validar para caso não haja uma das
	duas possibilidades (sem elementos pares ou ímpares).
 */


public class Lista01Ex08 {
	
	public static void main (String[] args) {
		int m1[][] = new int[3][2];
		int contadorPar = 0,contadorImpar = 0,contadorVetor = 0, contadorVetorImpar = 0;
		for(int linha = 0 ; linha < m1.length ; linha++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				m1[linha][coluna] = (int)(Math.random()*25);
				if(m1[linha][coluna]%2 == 0){
					contadorPar++;
				}else{
					contadorImpar++;
				}
			}
		}
		int par[] = new int[contadorPar];
		int impar[] = new int[contadorImpar];
		System.out.println("\n");
		for(int linha = 0 ; linha < m1.length ; linha ++){
			for(int coluna = 0 ; coluna < m1[linha].length ; coluna++){
				System.out.print(m1[linha][coluna]+"\t");
				if(m1[linha][coluna]%2 ==0){
					par[contadorVetor] = m1[linha][coluna];
					contadorVetor++;
				}else{
					impar[contadorVetorImpar] = m1[linha][coluna];
					contadorVetorImpar++;
				}
			}
			System.out.println();
		}
		System.out.println("\n");
		
		
		if(contadorPar != 0){
			for(int linha = 0 ; linha < par.length ; linha ++){
				System.out.print(par[linha]+"\t");
			}
		}else{
			System.out.println("Nao ha elementos pares");
		}
		System.out.println("\n\n");
		if(contadorImpar != 0){
			for(int linha = 0 ; linha < impar.length ; linha++){
				System.out.print(impar[linha]+"\t");
			}
		}else{
			System.out.println("Nao ha elementos impares");
		}
	}

}

