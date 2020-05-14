package generic;

public class Plastic extends Material {
	
	public String toString() {
		return "Plastic";
	}
	
	@Override
	public void doPrinting() {
		System.out.println("Plastic Print");
	}
}
