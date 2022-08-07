/*
4 - Crie um arquivo chamado ExibeValores.java. Implemente um programa em Java que armazene
em variáveis os valores 19, 1571, 100000, 2147483648, 3.14, 3.141592653589793, true e 'K'.
Utilize sempre o tipo primitivo adequado que ocupe o menor espaço possível. Defina os nomes que
achar mais apropriado para essas variáveis. Por fim, exiba os valores dessas variáveis na saída
padrão. 
* Marco Vinicius dos Santos de Paula
 */


public class ExibeValores {
	
	public static void main (String[] args) {
		byte menorValor = 19;
		short n2 = 1571;
		int n3 = 100000;
		long n4 =  2147483648L;
		float pi = 3.14F;
		double pi2 = 3.141592653589793;
		boolean falseorTrue = true;
		char letra = 'K';
		System.out.println(menorValor);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(pi);
		System.out.println(pi2);
		System.out.println(falseorTrue);
		System.out.println(letra);
	}
}

