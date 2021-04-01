package carro;

import Maquinaria.IMaquinaria;

public class Carretera {

	//private Carro carro;
	
	/*
	public Carretera(Carro carro) {
	  this.carro = carro;	
	}*/
	
	/*public void runCar() {
	    System.out.print("Autopistas del sol corre carros tipo: ");
		carro.print();
	}*/
	
	private final IMaquinaria maquinaria;
	
	public Carretera(IMaquinaria maquinaria) {
	   this.maquinaria = maquinaria;	
	}
	
	public void runMaquinaria() {
      System.out.println("En Autopistas del sol circula maquinaria tipo: " + maquinaria.getMachineName());
	}
	
		
	
}
