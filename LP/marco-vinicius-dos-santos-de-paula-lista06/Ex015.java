/*
 * Ex015.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * 15) O mesmo exercício anterior, mas agora, considere que o segundo valor lido 
 * poderá ser maior ou menor que o primeiro valor lido, ou seja, deve-se testá-los.
 * 
 * 
 */

import java.util.Scanner;
public class Ex015 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero1, numero2, soma=0;
		System.out.print("Digite o primeiro numero: ");
		numero1 = leia.nextInt();
		System.out.print("Digite o segundo numero: ");
		numero2 = leia.nextInt();
		if(numero2>=numero1){
			for(int i = numero1; i <= numero2; i++){
				soma +=i;
			}
		}else{
			for(int i = numero2; i<= numero1; i++){
				soma +=i;
			}
		}
		System.out.println("Soma dos numeros: "+soma);
	}
}

