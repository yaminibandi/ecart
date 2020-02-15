package eCart;

import java.util.Scanner;

public class HomePage {
	private static void displayCartDetails(MyCart myCart) {
		System.out.println("Here is your cart, these items will be delivered to you!");
		
		for(int i=0;i<myCart.count;i++) {
			System.out.println(myCart.items[i]+"->"+myCart.prices[i]);
			myCart.cart_total+=myCart.prices[i];
		}
		System.out.println("Total="+myCart.cart_total);
		System.out.println("Please pay "+myCart.cart_total+" on delivery");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Personalized Online Shopping!");
		int chooseAgain=0;
		MyCart myCart=new MyCart();
		do {
			//Display of Categories(Him/Her)
			System.out.println("Select the Category in which you would like to make the purchase");
			Catalogue catalogue=new Catalogue();
			catalogue.showCatalogue();
			
			//Selection of Categories(Him/Her)
			Scanner sc=new Scanner(System.in);
			int CatalogueOption=sc.nextInt();
			
			//Display of Chosen Category Items
			catalogue.showCategories(CatalogueOption);
			
			//Selection of item
			int selectedoption=sc.nextInt();
			
			//Saving and Addition item to cart
			catalogue.setSelectedItem(CatalogueOption, selectedoption);
			Item selectedItem=catalogue.getSelectedItemDetails();
			myCart.items[myCart.count]=selectedItem.name;
			myCart.prices[myCart.count]=selectedItem.price;
			myCart.count++;
			
			System.out.println("Enter 1 to Add another item else any other number");
			chooseAgain=sc.nextInt();
			
		}while(chooseAgain==1);
		
		displayCartDetails(myCart);
	}
	
}
