package moto;

public class Ducati extends Moto {

	@Override
	public String tipo() {
		return "Ducati";
	}

	@Override
	public String getMachineName() {
		return tipo();
	}

}
