/******************************************************************************

                           9)Escreva um programa para ler 5 elementos do vetor G de inteiros. Criar e imprimir
                            um novo vetor H, tal que, este seja formado pelos elementos pares do vetor G lido.
                            Supor que o vetor poderá não ter nenhum elemento com esta propriedade e neste caso, mostrar uma mensagem e encerrar o programa
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Scanner;
public class Ex09
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int contador=0;
	    int vetor[]=new int[5];
	    int vetorH[]=new int[vetor.length];
	    for(int i=0;i<vetor.length;i++){
	        System.out.print("Digite um elemento do vetor 1: ");
	        vetor[i]=leia.nextInt();
	        if(vetor[i]%2==0){
	            vetorH[contador]=vetor[i];
	            contador++;
	        }
	    }
	    
	    System.out.println("\n\nExibição do vetor\n\n");
	    for(int i=0;i<contador;i++){
	        System.out.println(vetorH[i]);
	    }
	    
	}
}
