package ClonePattern;

public class Item implements Cloneable {

	private String name;
	
	public Item(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public Item clone() {
		try {
			return (Item) super.clone();
		} catch(CloneNotSupportedException c) {
			 throw new InternalError();
		}
	}


	public static void main(String[] args) {
		
		Item originalItem = new Item("Axe");
		
		Item clone = originalItem.clone();
		System.out.print("This is the cloned " + clone.getName());
	}
}
