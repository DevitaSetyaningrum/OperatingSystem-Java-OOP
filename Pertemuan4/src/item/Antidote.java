package item;

public class Antidote extends Item{
	public Antidote() {
		
	}
	public  Antidote(String name) {
		this.name = name;
	}
	
	public void Use() {
		System.out.println("Use antidote to remove potition ... ");
	}

}
