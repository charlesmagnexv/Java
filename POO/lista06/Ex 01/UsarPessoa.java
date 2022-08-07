/*
 * UsarPessoa.java
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class UsarPessoa {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);
		String resposta = "";
		Pessoa pessoa1 = new Pessoa();
		System.out.print( "Digite a idade da pessoa: " );
		pessoa1.setIdade( leia.nextInt() );
		System.out.print( "Digite a altura da pessoa: " );
		pessoa1.setAltura( leia.nextDouble() );
		System.out.print( "Digite o nome da pessoa: " );
		pessoa1.setNome( leiaStr.nextLine() );
		System.out.print( "A pessoa faz aniversario? [S/N]:  " );
		resposta = leiaStr.nextLine();
		if( resposta.equalsIgnoreCase("s") ){
			pessoa1.fazAniversario( true );
		}else{
			pessoa1.fazAniversario( false ); 
		}
		System.out.println( "Nome: " + pessoa1.hasNome() + "\nIdade: " + pessoa1.hasIdade() + "\nAltura: " + pessoa1.hasAltura() );
	}
}

