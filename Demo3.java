package oefenMateriaal;

public class Demo3 {
	public static void main(String[] args) {
		Student leerling = new Student();
		leerling.naam = "Henk";
		leerling.leeftijd = 20;
		leerling.stad.stadsnaam = "Rotterdam";
		leerling.rb.autorijbewijs = "geen rijbewijs";
		leerling.voorstellen();
		Student leerling2 = new Student();
		leerling2.naam = "Klaas";
		leerling2.leeftijd = 30;
		leerling2.stad.stadsnaam = "Deventer";
		leerling2.rb.autorijbewijs = "een rijbewijs";
		leerling2.voorstellen();
		Student leerling3 = new Student();
		leerling3.naam = "Claire";
		leerling3.leeftijd = 25;
		leerling3.stad.stadsnaam = "Utrecht";
		leerling3.rb.autorijbewijs = "een rijbewijs";
		leerling3.voorstellen();
		Student leerling4 = new Student();
		leerling4.naam = "Miep";
		leerling4.leeftijd = 17;
		leerling4.stad.stadsnaam = "Apeldoorn";
		leerling4.rb.autorijbewijs = "een rijbewijs";
		leerling4.voorstellen();
		System.out.println(leerling2.rb);
	}
}

class Student {
	String naam;
	int leeftijd;
	Stad stad = new Stad();
	Rijbewijs rb = new Rijbewijs();
	void voorstellen() {
		System.out.println("Ik ben " + naam + " en ik ben " + leeftijd + " en ik kom uit " + stad.stadsnaam + " en ik heb " + rb.autorijbewijs);
	}
	Rijbewijs rijbewijsLatenZien() {
		rb.autorijbewijs = "wel een rijbewijs";
		return rb;
	}
	
}

class Stad {
	String stadsnaam;
}

class Rijbewijs {
	String autorijbewijs;
}