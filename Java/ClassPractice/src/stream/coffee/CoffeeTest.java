package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new Americano();
		americano.brewing();
		System.out.println();
		
		Coffee latte = new Latte(new Americano());
		latte.brewing();
		System.out.println();
		
		Coffee mocha = new Mocha(new Latte(new Americano())); // Americano : 기반 stream. Latte, Mocha : decorator(보조 stream) => decorator pattern
		mocha.brewing();
		System.out.println();
		
		Coffee EspressoMocha = new Mocha(new Latte(new Espresso()));
		EspressoMocha.brewing();

	}

}
