package interface_practice.book;

import java.util.ArrayList; // ctrl+shift+o ������ import ����

public class Shelf {

	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<String> shelf) {
		this.shelf = shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
	
}
