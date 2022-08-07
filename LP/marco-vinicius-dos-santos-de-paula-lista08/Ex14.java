/******************************************************************************

                            14)Escreva um programa para ler um vetor de inteiros S de 10 elementos e
                            imprimir o vetor lido. Ler outro vetor de inteiros T de 15 elementos e
                            imprimir este vetor lido. Construir outro vetor U com todos os elementos
                            lidos de S e de T e imprimir este vetor obtido. (Intercalação)

                In Corde Jesu, semper
*******************************************************************************/
import java.util.Scanner;
public class Ex14
{
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
	    int vetorS[]=new int[10],vetorT[]=new int[15],vetorU[]=new int[vetorS.length+vetorT.length],j=0;
	    for(int i=0;i<vetorS.length;i++){
		    System.out.print("Digite o elemento "+i+" do vetorS: ");
		    vetorS[i]=leia.nextInt();
	    }
	    for(int i=0;i<vetorS.length;i++){
		    System.out.println("Elemento "+i+" do vetorS: "+vetorS[i]);
	    }
	    
	    for(int i=0;i<vetorT.length;i++){
		    System.out.print("Digite o elemento "+i+" do vetorT: ");
		    vetorT[i]=leia.nextInt();
	    }
	    for(int i=0;i<vetorT.length;i++){
		    System.out.println("Elemento "+i+" do vetorT: "+vetorT[i]);
	    }
	    
	    for(int i=0;i<vetorT.length;i++){
	        if(i<vetorS.length){
	            vetorU[j]=vetorS[i];   
	            j++;
	        }
	        vetorU[j]=vetorT[i];
	        j++;
	    }
	    
	    
	    //System.arraycopy(vetorP,0,vetorR,0,vetorP.length);
	    //System.arraycopy(vetorQ,0,vetorR,vetorP.length,vetorQ.length);
	    
	    
	    System.out.println("\n\nExibição dos vetores\n\n");
	    for(int i=0;i<vetorU.length;i++){
	        System.out.println(vetorU[i]);
	    }
	}
}
