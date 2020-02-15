package eCart;

public class MyCart {
	String items[];
	int prices[];
	int cart_total=0;
	int count=0;
	public MyCart() {
		items=new String[100];
		prices=new int[100];
		this.cart_total = 0;
		this.count = 0;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
	}
	public int[] getPrices() {
		return prices;
	}
	public void setPrices(int[] prices) {
		this.prices = prices;
	}
	public int getCart_total() {
		return cart_total;
	}
	public void setCart_total(int cart_total) {
		this.cart_total = cart_total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
