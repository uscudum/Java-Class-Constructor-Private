package main;

import ConstructorPrivado.Persona;

public class Principal {
	public static void main (String args[]) {
		
		Persona P1 = Persona.ConstruirPesrona("Juan",37);
		Persona P2 = Persona.ConstruirPesrona("Miguel",43);
		
		System.out.println(P1.toString());
		System.out.println(P2.toString());
	
		
	}
}
