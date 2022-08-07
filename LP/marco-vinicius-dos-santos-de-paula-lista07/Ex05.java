/******************************************************************************

                            5)Escreva um programa que calcule e escreva a quantidade de vezes que o caractere ‘a’ aparece em uma frase fornecida pelo usuário. 
                            Nota Importante: para a contagem, o caractere pode ser maiúsculo ou minúsculo

*******************************************************************************/
import java.util.Scanner;
public class Ex05{
	public static void main(String[] args) {
        Scanner leiaStr = new Scanner(System.in);
        String frase="";
        int contador=0;
        System.out.print("Digite uma frase: ");
        frase = leiaStr.nextLine();
        for(int i=0;i<frase.length();i++){
            if(frase.charAt(i)=='A'||frase.charAt(i)=='a'){
                contador++;
            }
        }
        System.out.println(contador);
	}
}
