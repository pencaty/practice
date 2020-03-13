package polymorphismPractice;

import java.util.ArrayList;

class Animal{
	
	public void move() {
		System.out.println("move");
	}
}

class Human extends Animal{ // ��� inheritance
	public void move() { // overriding (�����Լ�)
		System.out.println("human moves");
	}
	
	public void readbook() {
		System.out.println("human reads book");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("tiger moves");
	}
	
	public void hunt() {
		System.out.println("tiger hunts");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("eagle moves");
	}
	
	public void fly() {
		System.out.println("eagle flies");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		Animal hAnimal = new Human(); // ���� class�� ����ȯ��
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		// �̶� hAnimal.readbook() ���� �ȵ�
		
		if(hAnimal instanceof Human) {
			Human human = (Human)hAnimal; // downcasting. ���� class�� ���ư���
			human.readbook();
		}
		
		
		AnimalTest test = new AnimalTest();
		test.moveAnimal(hAnimal); 
		test.moveAnimal(tAnimal);
		test.moveAnimal(eAnimal);

		ArrayList<Animal> animalList = new ArrayList<Animal>();
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		test.testDownCasting(animalList);
		
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public void testDownCasting(ArrayList<Animal> list) {
		for(int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readbook();
			}
			else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.fly();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunt();
			}
			
		}
	}

}
