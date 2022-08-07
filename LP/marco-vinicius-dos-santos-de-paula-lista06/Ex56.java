/******************************************************************************

                            56)Imprima os números perfeitos na faixa de 1 a 900.

*******************************************************************************/

public class Ex56{
	public static void main(String[] args) {
		int soma=0;
		for(int c=1;c<=900;c++){
    		for(int i=1;i<c;i++){
    		    if(c%i==0){
    		        soma+=i;
    		    }
    		}
    		if(soma==c){
		    System.out.print(c+" ");
    		}
    		soma=0;
		}
	}
}
