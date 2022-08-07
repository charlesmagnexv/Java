/*
 * ConversaoPrimitivos.java
1 - Crie um arquivo chamado ConversaoPrimitivos.java. Para eliminar os erros de compilação,
complete os espaços marcados por xxxxx do código abaixo quando necessário.
* Marco Vinicius dos Santos de Paula
 */


public class ConversaoPrimitivos {
	
	public static void main (String[] args) {
		int a = 10;
		long b = a;
		int c = (int)b;
		float d = b;
		short e = (short)a;
		double f = d;
		Long g = b;
		long h = g;
		System.out.println(a);//10
		System.out.println(b);//10
		System.out.println(c);//10
		System.out.println(d);//10.0
		System.out.println(e);//10
		System.out.println(f);//10.0
		System.out.println(g);//10
		System.out.println(h);//10
	}
}

