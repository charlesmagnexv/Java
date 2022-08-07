/*
 * ModeloDeComputador.java
 * 
  7) Escrever uma classe ModeloDeComputador que encapsule valores que definam a 
* configuração de um microcomputador (tipo de processador, memória RAM, tamanho do 
* disco rígido, tamanho do monitor, por exemplo). Essa classe deve ter um método calcularPreco que 
* calculará o preço do computador como sendo a soma do custo de seus componentes:
• Placa-mãe: R$800
• Opções de processadores: 1600Mhz a R$700, 1800Mhz a R$830, 1900Mhz a R$910
• Opções de memória: 1GB, 2GB, 4GB, 6GB ou 8GB, cada 1GB custa R$350.
• Opções de disco rígido: 500 GB a R$300, 1 TB a R$420, 2TB a R$500.
• Opções de monitor: 15 polegadas a R$320, 17 polegadas a R$520.
 * 
 */


public class ModeloDeComputador {
	private int cpu, ram, disco, monitor;
	public ModeloDeComputador(){
		cpu = 700;
		ram = 350;
		disco = 300;
		monitor = 320;
	}
	public void setCpu( int cpu ){
		if( cpu != 1600 && cpu != 1800 && cpu != 1900 ){
			throw new IllegalArgumentException( "CPU invalida!" );
		}else if( cpu == 1600 ){
			this.cpu = 700;
		}else if( cpu == 1800 ){
			this.cpu = 830;
		}else{
			this.cpu = 910;
		}
	}
	public void setRam( int ram ){
		if( ram != 1 && ram != 2 && ram != 4 && ram != 6 && ram != 8 ){
			throw new IllegalArgumentException( "RAM invalida" );
		}else{
			this.ram = ram;
		}
	}
	public void setDisco( int disco ){
		if( disco != 500 && disco != 1 && disco != 2 ){
			throw new IllegalArgumentException( "Disco invalido!" );
		}else if( disco == 500 ){
			this.disco = 300;
		}else if( disco == 1 ){
			this.disco = 420;
		}else{
			this.disco = 500;
		}
	}
	public void setMonitor( int monitor ){
		if( monitor != 15 && monitor != 17 ){
			throw new IllegalArgumentException( "Monitor invalido!" );
		}else if( monitor == 15 ){
			this.monitor = 320;
		}else{
			this.monitor = 520;
		}
	}
	public int hasCpu(){
		return cpu;
	}
	public int hasRam(){
		return ram;
	}
	public int hasDisco(){
		return disco;
	}
	public int hasMonitor(){
		return monitor;
	}
	public double preco(){
		return  ( (double) hasCpu() + (double) ( hasRam()*350 ) + (double) hasDisco() + (double) hasMonitor() );
	}
}

