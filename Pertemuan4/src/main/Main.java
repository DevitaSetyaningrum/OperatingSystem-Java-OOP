package main;

import java.util.Scanner;
import java.util.Vector;

import avatar.Hunter;
import avatar.MeleeHunter;
import avatar.RangeHunter;
import item.Antidote;
import item.Item;
import item.Potion;

public class Main {
	
	Hunter hunter = new Hunter();
	MeleeHunter melee = new MeleeHunter(100, 100);
	RangeHunter range = new RangeHunter(200, 500);
	
	Item item;
	Potion potion = new Potion();
	Antidote antidote = new Antidote();
	
	Vector<String> huntInventory = new Vector<String>();
	
	Scanner scan = new Scanner(System.in);
	String input;
	int choose;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	
	}
	
	public void melee() {
		do {
			System.out.println("1. Hunt");
			System.out.println("2. Add Item");
			System.out.println("3. Remove Item");
			System.out.println("Choose : ");
			choose = scan.nextInt();
			scan.nextLine();
		}while(choose < 1 || choose > 3);
		
		switch (choose) {
		case 1: 
			melee.Hunting();
			scan.nextLine();
			clear();
			break;
			
		case 2: 
			String item;
			huntInventory = melee.getInventory();
			
			if (huntInventory.isEmpty()) {
				System.out.println("Inventory is empty");
			}else {
				for (int i = 0; i < huntInventory.size(); i++) {
					System.out.printf("%d. %s\n", i+1, huntInventory.get(i));
				}
			} do {
				System.out.println("Choose your item type [Potion|Antidote]: ");
				item = scan.nextLine();
			} while (item.matches("Potion") && item.matches("Antidote")); 
			
			if (item.matches("Potion")) {
				melee.getInventory().add(item);
			}else if (item.matches("Antidote")) {
				melee.getInventory().add(item);
			}
			clear();
			break;
			
		case 3:
			int itemR;
			if (huntInventory.isEmpty()) {
				System.out.println("Inventory is empty");
				scan.nextLine();
			} else {
				for (int i = 0; i < huntInventory.size(); i++) {
					System.out.printf("%d. %s\n", i+1, huntInventory.get(i));
				}
			} do {
				System.out.println("Input item number to remove : ");
				itemR = scan.nextInt();
				scan.nextLine();
				melee.getInventory().remove(itemR-1);
			} while (itemR > melee.getInventory().size());
			clear();
			break;
			
		default:
			break;
			
		}
	}
	
	public void range() {
		do {
			System.out.println("1. Hunt");
			System.out.println("2. Add Item");
			System.out.println("3. Remove Item");
			System.out.println("Choose : ");
			choose = scan.nextInt();
			scan.nextLine();
		}while(choose < 1 || choose > 3);
		
		switch (choose) {
		case 1: 
			range.Hunting();
			scan.nextLine();
			clear();
			break;
			
		case 2: 
			String item;
			huntInventory = range.getInventory();
			
			if (huntInventory.isEmpty()) {
				System.out.println("Inventory is empty");
			}else {
				for (int i = 0; i < huntInventory.size(); i++) {
					System.out.printf("%d. %s\n", i+1, huntInventory.get(i));
				}
			} do {
				System.out.println("Choose your item type [Potion|Antidote]: ");
				item = scan.nextLine();
			} while (item.matches("Potion") && item.matches("Antidote")); 
			
			if (item.matches("Potion")) {
				range.getInventory().add(item);
			}else if (item.matches("Antidote")) {
				range.getInventory().add(item);
			}
			clear();
			break;
			
		case 3:
			int itemR;
			if (huntInventory.isEmpty()) {
				System.out.println("Inventory is empty");
				scan.nextLine();
			} else {
				for (int i = 0; i < huntInventory.size(); i++) {
					System.out.printf("%d. %s\n", i+1, huntInventory.get(i));
				}
			} do {
				System.out.println("Input item number to remove : ");
				itemR = scan.nextInt();
				scan.nextLine();
				range.getInventory().remove(itemR-1);
			} while (itemR > range.getInventory().size());
			clear();
			break;
			
		default:
			break;
			
		}
	}
	
	void clear() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			System.out.println();
		}
		
		if(input.matches("Melee")) melee();
		else if(input.matches("Range")) range();
		
	}

	public Main () {
		for (int i = 0; i < 20; i++) {
			System.out.println();
		}
		System.out.print("Choose your hunter type [Melee|Range]: ");
		input = scan.nextLine();
		
		if (input.matches("Melee")) {
			melee();
		}else if(input.matches("Range")) {
			range();
		}
	}
	
}
	
	

	



