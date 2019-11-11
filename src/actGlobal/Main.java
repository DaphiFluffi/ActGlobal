package actGlobal;

public class Main {
	
	public static void main(String args[]) {
		
		Erzeuger e1;

		PrivatePerson p1;
		PrivatePerson p2;
		
		e1 = new SpenderErzeuger();
		p1 = e1.fabrikmethode();
		p1.printName("Meier");
		
		p2 = e1.fabrikmethode();
		p2.printName("Kiessling");
		
	}

}
