package genericPractice;

public class GenericPrinter<T extends Material> { // T : generic type. ���� ���� class ����. c++�� template�� ����. Material�� T�� Ÿ�� ���� ����

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
