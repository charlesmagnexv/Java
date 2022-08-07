/******************************************************************************

                            12)Escreva um programa para ler um vetor de inteiros P de 10 elementos e
                            imprimir o vetor lido. Ler outro vetor de inteiros Q de 15 elementos e
                            imprimir este vetor lido. Construir outro vetor R com todos os elementos
                            lidos de P e de Q e imprimir este vetor obtido. (Concatenação)

                In Corde Jesu, semper
*******************************************************************************/
import java.util.Scanner;
import java.util.Arrays;
public class Ex12
{
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
	    int vetorP[]=new int[10],vetorQ[]=new int[15],vetorR[]=new int[vetorP.length+vetorQ.length];
	    for(int i=0;i<vetorP.length;i++){
		    System.out.print("Digite o elemento "+i+" do vetorP: ");
		    vetorP[i]=leia.nextInt();
	    }
	    for(int i=0;i<vetorP.length;i++){
		    System.out.println("Elemento "+i+" do vetorP: ");
	    }
	    
	    for(int i=0;i<vetorQ.length;i++){
		    System.out.print("Digite o elemento "+i+" do vetorQ: ");
		    vetorQ[i]=leia.nextInt();
	    }
	    for(int i=0;i<vetorP.length;i++){
		    System.out.println("Elemento "+i+" do vetorQ: ");
	    }
	    
	    System.arraycopy(vetorP,0,vetorR,0,vetorP.length);
	    System.arraycopy(vetorQ,0,vetorR,vetorP.length,vetorQ.length);
	    System.out.println("\n\nExibição dos vetores\n\n");
	    for(int i=0;i<vetorR.length;i++){
	        System.out.println(vetorR[i]);
	    }
	}
}
