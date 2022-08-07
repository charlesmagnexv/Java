/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Ex45{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int contador=0,fatorial=1,fAnterior=1;
		System.out.print("Digite um numero: ");
		contador = leia.nextInt();
		for(int i=contador-1;i>=0;i--){
		    fAnterior = i;
    		for(int c=fAnterior-1;c>=1;c--){
    		    fatorial=fAnterior*c;
    		    fAnterior=fatorial;
    		}
    		if(i==0||i==1){
    		    System.out.println("Fatorial de "+i+" : 1");
    		}else{
    		    System.out.println("Fatorial de "+i+" : "+fatorial);
    		}
		    
		}
	}
}
