/*
 * Ex20v2.java
 * 
 * Copyright 2021 vinic <vinic@DESKTOP-O49OCM7>
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
public class Ex20v2 {
	
	public static void main (String[] args) {
		Scanner leiaStr=new Scanner(System.in);
		String frase="",palavras[];
		int contador=0;
		System.out.print("Insira uma frase: ");
		frase = leiaStr.nextLine();
		palavras=frase.split(" ");
		contador=frase.split(" ").length;
		System.out.println("\nEssa frase tem "+(contador)+" palavra(s)");
		
		System.out.println("\nLista de palavras: ");
		for(int i=0;i<palavras.length;i++){
			System.out.println(palavras[i]);
		}
	}
}

