/******************************************************************************

                           8) Escreva um programa para
                            ler 5 elementos do vetor F de inteiros. Calcular
                            e imprimir a soma dos elementos ímpares. Supor que o vetor poderá não ter
                            nenhum elemento com esta propriedade e neste caso, mostrar uma
                            mensagem.
                            
                            Marco Vinicius dos Santos de Paula

*******************************************************************************/
import java.util.Scanner;
public class Ex08
{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int soma=0,contador=0;
	    int vetor[]=new int[5];
	    for(int i=0;i<vetor.length;i++){
	        System.out.print("Digite um elemento do vetor 1: ");
	        vetor[i]=leia.nextInt();
	        if(vetor[i]%2!=0){
	            soma+=vetor[i];
	            contador++;
	        }
	    }
	    System.out.println("\n\nExibição do maior e do menor\n\n");
	    if(soma!=0){
	        System.out.println("A soma dos elementos impares eh: "+soma);
	    }else{
	        System.out.println("O vetor NAO tem elementos impares");
	    }
	}
}
