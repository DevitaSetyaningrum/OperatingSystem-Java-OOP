//Anak dari Hunter
//will override the hunting method for specific use
//For MeleeHunter hunting method will contains a message “Hunting with sword . . .”

package avatar;

//inheritence
public class MeleeHunter extends Hunter{
	public MeleeHunter() {
		
	}
	public MeleeHunter(int attack, int defense) {
		this.attack = attack;
		this.defense = defense;
	}
	public void Hunting() {
		System.out.println("Hunting with a sword ... ");
	}
	
}
