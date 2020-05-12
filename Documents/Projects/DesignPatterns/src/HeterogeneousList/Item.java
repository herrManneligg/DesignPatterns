package HeterogeneousList;

public class Item {

	String itemName;
	ItemType type;
	
	public Item(ItemType type, String name) {
		this.itemName = name;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return itemName;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}
}
