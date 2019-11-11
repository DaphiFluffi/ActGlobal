package actGlobal;

public class SpenderErzeuger extends Erzeuger {

	@Override
	public PrivatePerson fabrikmethode() {
		
		return new Spender();
	}
		
}