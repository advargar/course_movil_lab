package carro;

public class Sedan extends Carro {

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "Sedan";
	}

	@Override
	public String getMachineName() {
		return tipo();
	}


	
}
