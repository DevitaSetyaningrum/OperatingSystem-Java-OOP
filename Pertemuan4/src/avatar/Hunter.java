 /*	Hunter will have 3 attribute and 1 method:
	Attribute {attack - int , defense - int, & inventory - vector}
	Method {hunting - void}
*/

package avatar;

import java.util.Vector;

public class Hunter {
	
	int attack;
	int defense;
	Vector<String> inventory = new Vector<String>();

	
	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public Vector<String> getInventory() {
		return inventory;
	}

	public void setInventory(Vector<String> inventory) {
		this.inventory = inventory;
	}

	public Hunter () {
		
	}
	
	public void Hunting() {
		
	}

}
