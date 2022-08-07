/*
 * Lista02Ex05.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 * 5) [POO-005] Baseado no exercício anterior, crie uma nova versão, que calcula as 
 * raízes de uma equação do segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' 
 * deve ser diferente de zero. Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o 
 * delta seja negativo, as reais serão complexas e da forma, assim retorne zero.
 * 
 * 
 */

import java.util.Scanner;
public class Lista02Ex05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		double a, b, c;
		do{
			System.out.println("Digite o valor de \"a\": ");
			a = leia.nextDouble();
			System.out.println("Digite o valor de \"b\": ");
			b = leia.nextDouble();
			System.out.println("Digite o valor de \"c\": ");
			c = leia.nextDouble();
			if( a == 0 ){
				System.out.println("\nO coeficiente \"a\" tem de ser maior do que 0 ! \n");
			}
		}while( a == 0 );
		System.out.print("A equacao tem as seguintes raizes: "); 
		double[] saida = equacao(a,b,c); // aqui o vetor já está instanciado
		for( int x = 0; x < saida.length ; x ++ ){
			System.out.print( saida[x] + "\t" );
		}
	}
	static double[] equacao( double a, double b, double c ){
		double delta;
		double vetorRaiz[] = new double[2];
		delta = (b*b) - (4*a*c);
		if( delta < 0 ){
			vetorRaiz = new double[1];
			vetorRaiz[0] = 0;
		}else{
			double raiz1 = ( -b + ( Math.sqrt(delta) ) ) / ( 2*a );
			double raiz2 = ( -b - ( Math.sqrt(delta) ) ) / ( 2*a );
			vetorRaiz = new double[2];
			vetorRaiz[0] = raiz1;
			vetorRaiz[1] = raiz2;
		}
		return vetorRaiz;
	}
}

