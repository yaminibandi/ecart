package eCart;

import java.util.ArrayList;

public class Catalogue {
	ArrayList<Item> himCatalogueList,herCatalogueList;
	String catalogue[]= {"For Him","For Her"};
	Item selectedItemDetails;
	
	public Catalogue() {
		himCatalogueList=new ArrayList<Item>();
		herCatalogueList=new ArrayList<Item>();
		himCatalogueList.add(new Item("Personalized Shirt",500));
		himCatalogueList.add(new Item("Personalized Watch",1500));
		herCatalogueList.add(new Item("Personalized Top",800));
		herCatalogueList.add(new Item("Personalized Key Chain",250));
	}
	
	public ArrayList<Item> getHimCatalogueList() {
		return himCatalogueList;
	}

	public void setHimCatalogueList(ArrayList<Item> himCatalogueList) {
		this.himCatalogueList = himCatalogueList;
	}

	public ArrayList<Item> getHerCatalogueList() {
		return herCatalogueList;
	}

	public void setHerCatalogueList(ArrayList<Item> herCatalogueList) {
		this.herCatalogueList = herCatalogueList;
	}

	public String[] getCatalogue() {
		return catalogue;
	}

	public void setCatalogue(String[] catalogue) {
		this.catalogue = catalogue;
	}
	public Item getSelectedItemDetails() {
		return selectedItemDetails;
	}

	public void setSelectedItem(int index,int itemnumber) {
		if(index==1) {
			this.selectedItemDetails=himCatalogueList.get(itemnumber-1);
		}
		else if(index==2) {
			this.selectedItemDetails=herCatalogueList.get(itemnumber-1);
		}
	}
	void showCatalogue() {
		for(int i=0;i<catalogue.length;i++) {
			System.out.println((i+1)+"-"+catalogue[i]);
		}
		System.out.println("Select the Index Number of the chosen Category");
		
	}
	void showHimCatalogue() {
		for(int i=0;i<himCatalogueList.size();i++) {
			System.out.println((i+1)+"-"+himCatalogueList.get(i).name+"->"+himCatalogueList.get(i).price);
		}
		System.out.println("Select the Index Number of the chosen Category");
	}
	void showHerCatalogue() {
		for(int i=0;i<herCatalogueList.size();i++) {
			System.out.println((i+1)+"-"+herCatalogueList.get(i).name+"->"+herCatalogueList.get(i).price);
		}
		System.out.println("Select the Index Number of the chosen Category");
	}
	boolean showCategories(int index) {
		if(index==1) {
			showHimCatalogue();
			return true;
		}
		else if(index==2) {
			showHerCatalogue();
			return true;
		}
		else {
			System.out.println("Sorry Invalid Index Number");
			return false;
		}
	}
}
