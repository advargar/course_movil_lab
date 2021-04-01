package moto;

public class Ninja extends Moto {

	@Override
	public String tipo() {
		return "Ninja";
	}

	@Override
	public String getMachineName() {
		return tipo();
	}

}
