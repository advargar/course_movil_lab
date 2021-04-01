package moto;

import Maquinaria.IMaquinaria;

public abstract class Moto implements IMaquinaria {

	//immutable
	public final void print() {
	  System.out.println(tipo());
	}

}
