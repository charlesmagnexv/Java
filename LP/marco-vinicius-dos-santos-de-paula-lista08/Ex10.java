/******************************************************************************

                           10)Escreva um programa para ler dois vetores PA e PB de inteiros de 5 elementos e imprimir os vetores lidos. 
                           Construir outro vetor PC de tamanho
                           10, com todos os elementos lidos de PA e de PB e imprimir este vetor obtido.
                           (Concatenação)
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
public class Ex10
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int contador=0;
	    int vetorPA[]=new int[5];
	    int vetorPB[]=new int[5];
	    int vetorPC[]=new int[vetorPA.length+vetorPB.length];
	    for(int i=0;i<vetorPA.length;i++){
	        System.out.print("Digite o elemento "+i+" do vetorPA: ");
	        vetorPA[i]=leia.nextInt();
	        System.out.print("Digite o elemento "+i+" do vetorPB: ");
	        vetorPB[i]=leia.nextInt();
	    }
	    System.arraycopy(vetorPA,0,vetorPC,0,vetorPA.length);
	    System.arraycopy(vetorPB,0,vetorPC,vetorPA.length,vetorPB.length);
	    System.out.println("\n\nExibição do vetor\n\n");
	    for(int i=0;i<vetorPC.length;i++){
	        System.out.println(vetorPC[i]);
	    }
	    
	}
}
