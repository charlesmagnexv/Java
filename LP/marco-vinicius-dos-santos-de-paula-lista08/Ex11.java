/******************************************************************************

                           11)Escreva um programa para ler dois vetores QA e QB de inteiros de 5 elementos e
                            imprimir os vetores lidos. Construir outro vetor QC de tamanho 10, com todos os
                            elementos lidos de QA e de QB e imprimir este vetor obtido. (Intercalação)
                            
                            Marco Vinicius dos Santos de Paula
                            
                            System.arraycopy(vetorPA,0,vetorPC,0,vetorPA.length);
                    	    System.arraycopy(vetorPB,0,vetorPC,vetorPA.length,vetorPB.length);
                    	    System.out.println("\n\nExibição do vetor\n\n");

*******************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
public class Ex11
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int j=0;
	    int vetorQA[]=new int[5];
	    int vetorQB[]=new int[5];
	    int vetorQC[]=new int[10];
	    for(int i=0;i<vetorQA.length;i++){
	        System.out.print("Digite o elemento "+i+" do vetorQA: ");
	        vetorQA[i]=leia.nextInt();
	    }
	    for(int i=0;i<vetorQB.length;i++){
	        System.out.print("Digite o elemento "+i+" do vetorQB: ");
	        vetorQB[i]=leia.nextInt();
	    }
	    System.out.println("\n\n");
	    for(int i=0;i<vetorQA.length;i++){
	        System.out.println("VetorQA: "+vetorQA[i]);
	        System.out.println("VEtorQB: "+vetorQB[i]);
	    }
	    
	    
	    for(int i=0;i<5;i++){
	        vetorQC[j]=vetorQA[i];
	        j++;
	        vetorQC[j]=vetorQB[i];
	        j++;
	    }
	    System.out.println("\n\nExibir vetor\n\n");
	    for(int i=0;i<10;i++){
	        System.out.println(vetorQC[i]);
	    }
	}
}
