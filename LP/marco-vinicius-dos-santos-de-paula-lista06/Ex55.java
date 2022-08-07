/******************************************************************************

                            55)Solicite um número inteiro ao usuário e informe se o número é perfeito ou não

*******************************************************************************/
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero,soma=0;
		System.out.print("Digite um numero: ");
		numero=leia.nextInt();
		for(int i=1;i<numero;i++){
		    if(numero%i==0){
		        soma+=i;
		    }
		}
		if(soma==numero&&numero!=0){
		    System.out.println("O numero "+numero+" eh um numero perfeito");
		}else{
		    System.out.println("O numero "+numero+" nao eh um numero perfeito");
		}
	}
}
