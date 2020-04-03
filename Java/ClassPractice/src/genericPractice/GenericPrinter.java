package genericPractice;

public class GenericPrinter<T extends Material> { // T : generic type. 여러 개의 class 가능. c++의 template과 유사. Material로 T의 타입 종류 제한

	private T material;
	
	public T getMaterial() {
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}
