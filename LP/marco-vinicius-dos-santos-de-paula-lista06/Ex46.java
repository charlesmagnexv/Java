/******************************************************************************

            46)Solicite ao usuário um número e verifique se este número é primo ou não.

*******************************************************************************/
import java.util.Scanner;
public class Ex46{
	public static void main(String[] args) {
	    Scanner leia = new Scanner(System.in);
	    int numero=0,primo=0;
	    System.out.print("Insira um numero: ");
	    numero=leia.nextInt();
	    for(int i=1;i<=numero;i++){
	        if(numero%i==0){
	            primo++;
	        }
	    }
	    if(primo==2){
	        System.out.println("O numero "+numero+" eh primo");
	    }else{
	        System.out.println("O numero "+numero+" nao eh primo");
	    }
	}
}
