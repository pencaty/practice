package generic;

public class Powder extends Material {

	public String toString() {
		return "Powder";
	}

	@Override
	public void doPrinting() {
		System.out.println("Powder Print");
	}
	
}
