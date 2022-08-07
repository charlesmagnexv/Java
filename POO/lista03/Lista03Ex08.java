/*
 * Lista03Ex08.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 * 
 *8) [POO-013] Utilizando o método dado(), criado no exercício [POO-012], lance o 
 * dado 1 milhão de vezes. Conte quantas vezes cada número saiu. A probabilidade deu certo? Ou seja, a porcentagem dos números foi parecida?
	Saída:
	1: 166666 - 16.67%
	2: 166667 - 16.67%
	3: 166667 - 16.67%
	4: 166666 - 16.67%
	5: 166669 - 16.67%
	6: 166665 - 16.67%
 * 
 */


public class Lista03Ex08 {
	
	public static void main (String[] args) {
		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0, jogarDado;
		for( int contador = 1 ; contador <= 1000000 ; contador ++ ){
			jogarDado = dado();
			if( jogarDado == 1 ){
				n1++;
			}else{
				if( jogarDado == 2 ){
					n2++;
				}else{
					if( jogarDado == 3 ){
						n3++;
					}else{
						if( jogarDado == 4 ){
							n4++;
						}else{
							if( jogarDado == 5 ){
								n5++;
							}else{
								n6++;
							}
						}
					}
				}
			}
		}
		System.out.print("1: " + n1 + " - " + ( ( (double)(n1)*100) /1000000 ) + "% \n");
		System.out.print("2: " + n2 + " - " + ( ( (double)(n2)*100) /1000000 ) + "% \n");
		System.out.print("3: " + n3 + " - " + ( ( (double)(n3)*100) /1000000 ) + "% \n");
		System.out.print("4: " + n4 + " - " + ( ( (double)(n4)*100) /1000000 ) + "% \n");
		System.out.print("5: " + n5 + " - " + ( ( (double)(n5)*100) /1000000 ) + "% \n");
		System.out.print("6: " + n6 + " - " + ( ( (double)(n6)*100) /1000000 ) + "% \n");
	}
	static int dado(){
		return (int)((Math.random()*6)+1);
	}
}

