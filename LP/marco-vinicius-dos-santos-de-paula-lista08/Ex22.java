/******************************************************************************

                            22)Escreva um programa para
                            ler um vetor AC de N posições, onde N é
                            menor ou igual a 20 e imprimir seus elementos. O usuário deve informar o
                            número de posições e um número máximo para o tamanho dos elementos. O
                            programa deve validar a entrada dos dados e imprimir o vetor ao final.
                            
                            In Corde Jesu, semper.

*******************************************************************************/
import java.util.Scanner;
public class Ex22
{
	public static void main(String[] args) {
	    Scanner leia=new Scanner(System.in);
	    int quantidade,tamanhoMaximoElementos;
	    do{
    	    System.out.print("\nInforme o numero de posicoes: ");
    	    quantidade=leia.nextInt();
    	    if(quantidade>20||quantidade<=0)
    	        System.out.println("\nFoi informado um valor invalido\n");
	    }while(quantidade>20||quantidade<=0);
	    System.out.print("\nInforme o tamanho maximo dos elementos: ");
	    tamanhoMaximoElementos=leia.nextInt();
	    int vetor[]=new int[quantidade];
	    
	    for(int i=0;i<vetor.length;i++){
	        do{
    	        System.out.print("Informe o elemento "+i+" do vetor: ");
    	        vetor[i]=leia.nextInt();
    	        if(vetor[i]>tamanhoMaximoElementos)
    	            System.out.println("\nEntrada invalida\n");
	        }while(vetor[i]>tamanhoMaximoElementos);
	    }
	    System.out.println("Exibicao do vetor");
	    for(int i=0;i<vetor.length;i++){
	        System.out.println(vetor[i]);
	    }
	}
}
