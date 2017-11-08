 +package items;
 +
 +public class Item {
 +	// Enum class defining Item types and values
 +	public enum ItemType {
 +		healthPotion(25),
 +		rustyAxe(10),
 +		book(15);
 +		
 +		int value;
 +		private ItemType(int value) {
 +			this.value = value;
 +		}
 +	}
 +	
 +	//Type of item
 +	private ItemType type;
 +
 +	// Creates a new item, setting the item type
 +	public Item(ItemType type) {
 +		this.type = type;
 +	}
 +	
 +	/**
 +	 * Method to use an item. Should pass Character_Class into parameters to call specific
 +	 * character methods (i.e. heal and use potion, equip axe, etc)
 +	 */
 +	public void use() {
 +		int value = type.value;
 +		
 +		switch (type) {
 +		case healthPotion:
 +			// TODO: Type method here
 +			break;
 +		case rustyAxe:
 +			// TODO: Type method here
 +			break;
 +		case book:
 +			// TODO: Type method here
 +			break;
 +		default:
 +			break;
 +		}
 +	}
 +}
