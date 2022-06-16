public class Item {
	private String name;
	private double price;
	int index;

	// Constructor
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setName() {
		this.name = name;
	}

	public void setPrice() {
		this.price = price;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
