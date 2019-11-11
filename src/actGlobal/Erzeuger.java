package actGlobal;

public abstract class Erzeuger {

	//Kopf der Fabrikmethode
	public abstract PrivatePerson fabrikmethode();
	
	public void operation() {
		System.out.println("Hi, ich funktioniere.");
	}
}
