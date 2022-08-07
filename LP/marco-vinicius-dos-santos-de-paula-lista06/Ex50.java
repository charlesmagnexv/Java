/******************************************************************************

           50)Solicite ao usuário o termo inicial e a quantidade de termos da sequência de números primos e imprima o resultado.

*******************************************************************************/
import java.util.Scanner;
public class Ex50{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int contador=0,primo=0,termoInicial=0;
	    System.out.print("Insira um numero: ");
	    contador = leia.nextInt();
	    System.out.print("Insira o termo inicial: ");
	    termoInicial = leia.nextInt();
    	for(int c=termoInicial;c<=(termoInicial+contador);c++){
    	    primo=0;
        	for(int i=1;i<=c;i++){
        	    if(c%i==0){
        	       primo++;
        	    }
        	}
        	if(primo==2){
        	   System.out.println(c);
        	}
    	}
	}
}
