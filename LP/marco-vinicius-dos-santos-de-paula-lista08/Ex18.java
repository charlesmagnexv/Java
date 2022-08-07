/******************************************************************************

                            18)Escreva um programa para solicitar ao usuário a quantidade de
                            elementos da sequência de Fatoriais (N<=15) e gerar um vetor Y com os
                            elementos da sequência e imprimir o vetor.
                            
                            In Corde Jesu, semper.

*******************************************************************************/
import java.util.Scanner;
public class Ex18
{
	public static void main(String[] args) {
	    Scanner leia=new Scanner(System.in);
	    int quantidade,fatorial=0;
	    System.out.print("Digite a quantidade de termos da sequencia: ");
	    quantidade=leia.nextInt();
	    int vetor[]=new int[quantidade];
	    for(int i=0;i<quantidade;i++){
	        fatorial=i;
	        if(i==0){
	            fatorial=1;
	        }else{
    	        for(int c=i-1;c>0;c--){
    	            fatorial=fatorial*c;
    	        }
	        }
	        vetor[i]=fatorial;
	    }
	    for(int i=0;i<vetor.length;i++){
	        System.out.println("Fatorial de "+i+" = "+vetor[i]);
	    }
	}
}
