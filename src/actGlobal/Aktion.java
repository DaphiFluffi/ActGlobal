package actGlobal;

public class Aktion {

	public String name;
	public double spenden;
	public double spendenziel;

	public Aktion (String name, double spenden, double spendenziel) {
		this.name = name;
		this.spenden = spenden;
		this.spendenziel = spendenziel;
	}

	public String getName() {
		return name;
	}

	public double getSpenden() {
		return spenden;
	}

	public double getSpendenziel() {
		return spendenziel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpenden(double spenden) {
		this.spenden = spenden;
	}

	public void setSpendenziel(double spendenziel) {
		this.spendenziel = spendenziel;
	}
}