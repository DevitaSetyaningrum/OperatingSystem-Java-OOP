package item;

public class Potion extends Item{

	public Potion () {
		
	}
	public Potion(String name) {
		this.name = name;
	}
	public void Use() {
		System.out.println("Use point to heal");
	}
	
}
