package stream.coffee;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new Americano();
		americano.brewing();
		System.out.println();
		
		Coffee latte = new Latte(new Americano());
		latte.brewing();
		System.out.println();
		
		Coffee mocha = new Mocha(new Latte(new Americano())); // Americano : ��� stream. Latte, Mocha : decorator(���� stream) => decorator pattern
		mocha.brewing();
		System.out.println();
		
		Coffee EspressoMocha = new Mocha(new Latte(new Espresso()));
		EspressoMocha.brewing();

	}

}
