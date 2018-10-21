package oefenMateriaal;

public class Demo2 {

	public static void main(String[] args) {
		Klant klant = new Klant();
		Bakker bakker = new Bakker();
		klant.honger = true;
		bakker.brood = "Tijger brood";
		bakker.brood = "Bolletjes brood";
		klant.kopen();
	}
}

class Klant {
	boolean honger = false;
	
	void kopen() {
		System.out.println("Ik heb een " + honger + " gekocht");
	}
}

class Bakker {
	String brood;
	
	void broodBakken(Klant klant) {
		klant.honger = false;
	}
}