//	For RangeHunter hunting method will contains a message “Hunting with bow . . .”

package avatar;

public class RangeHunter extends Hunter {
	
	public RangeHunter() {
		
	}
	public RangeHunter(int attack, int defense) {
		this.attack = attack;
		this.defense = defense;
	}
	public void Hunting() {
		System.out.println("Hunting with a bow ... ");
	}
}
