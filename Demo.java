package oefenMateriaal;

public class Demo {
	public static void main(String[] args) {
		Auto audi = new Auto();
		audi.toonAuto();
		audi.merk = "Audi";
		audi.kapot = true;
		audi.toonAuto();
		Auto volvo = new Auto();
		volvo.merk = "Volvo";
		volvo.kapot = true;
		volvo.toonAuto();
		Garage garage = new Garage();
		garage.repareren(audi);
		garage.repareren(volvo);

	}
}

class Auto {
	String merk;
	boolean kapot = false;

	void toonAuto() {
		System.out.println(merk + "<>" + kapot);
	}
}

class Garage {
	void repareren(Auto car) {
		car.kapot = false;
	}
}