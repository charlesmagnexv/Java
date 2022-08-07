/*
 * Ex27.java
 * 
 * Marco Vinicius dos Santos de Paula
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class Ex27 {
	
	public static void main (String[] args) {
		Scanner leia=new Scanner(System.in);
		int tamanhoAH=(int)(Math.random()*200)+25;
		int tamanhoAI=(int)(Math.random()*4)+2;
		int[] ah=new int[tamanhoAH],ai=new int[tamanhoAI];
		int contador=0;
		System.out.print("AH: ");
		for(int i=0;i<tamanhoAH;i++){
			ah[i]=(int)(Math.random()*5);
			System.out.print(ah[i]+" ");
		}
		System.out.print("\n");
		System.out.print("AI: ");
		for(int i=0;i<tamanhoAI;i++){
			ah[i]=(int)(Math.random()*5);
			System.out.print(ai[i]+" ");
		}
		System.out.print("\n");
		for(int i=0;i<=tamanhoAH-tamanhoAI;i++){
			if(ah[i]==ai[0]){
				contador=1;
				for(int j=1;j<tamanhoAI;j++){
					if(ah[i+j]==ai[j]){
						contador++;
					}
				}
				if(contador==tamanhoAI){
					System.out.println("Vetor AI estah contido no vetor AH, a partir da posicao "+i);
				}
			}
		}
	}
}

