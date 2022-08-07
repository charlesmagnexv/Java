/*
 * ConversaoDeUnidadesDeArea.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * In Corde Jesu, semper.
 *  
 * 8) Escrever a classe ConversaoDeUnidadesDeArea com métodos para conversão das unidades de área segundo a lista abaixo:
• 1 metro quadrado = 10.76 pés quadrados
• 1 pé quadrado = 929 centímetros quadrados
• 1 milha quadrada = 640 acres
• 1 acre = 43.560 pés quadrados
 * 
 */


public class ConversaoDeUnidadesDeArea {
	private double medida;
	public ConversaoDeUnidadesDeArea(){
		medida = 1.0;
	}
	public void setMedida ( double medida ){
		if( medida <= 0 ){
			throw new IllegalArgumentException( "Medida invalida!" );
		}else{
			this.medida = medida;
		}
	}
	public double getMedida(){
		return medida;
	}
	public double metroParaPe(){
		return getMedida() * 10.76;
	}
	public double peParaMetro(){
		return getMedida() * 9.26;
	}
	public double milhaParaAcre(){
		return getMedida() * 640;
	}
	public double acreParaPe(){
		return getMedida() * 43.560;
	}
}

