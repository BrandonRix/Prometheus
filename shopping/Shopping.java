package shopping;

public class Shopping {
	
	public void store(){
		System.out.println("Welcome to the store");
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		
		// Creates a shop item, specifying the item and its price
		ShopItem potion = new ShopItem(new Item(ItemType.healthPotion), 50);
	}

	// private inner shop item class , should create a purchase method, handling
	// what happens if player
	// does not have enough coins to buy the item
	private class ShopItem {
		Item item;
		int price;

		public ShopItem(Item item, int price) {
			this.item = item;
			this.price = price;
		}

		public void buy() {
			// subtract gold
			// add to player inventory
		}
	}
}
