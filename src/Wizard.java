
/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley
 * @version 1.0
 * Lab 2
 * CS131ON
 *
 */
public class Wizard implements Lockable{
	
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		name = "";
		health = 0;
		key = 0;
		locked = false;
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name, int health) {
		setName(name);
		setHealth(health);
		key = 0;
		locked = false;
	}//end preferred constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if(isLocked() == true) {
			System.out.println("Wizard is locked! No damage taken.");
		}else {
			health -= power;
		}
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**
	 * Getter for health
	 * @return
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return
	 */
	public int getKey() {
		return key;
	}//end getKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

	@Override
	public void setKey(int key) {
		if(key > 0 && this.key == 0) {
			this.key = key;
			System.out.println("The key is set to " + this.key + ".");
		}else {
			System.out.println("Key could not be set.  Key may have been set already. Or, choose a key greater than 0.");
		}
	}//end setKey

	@Override
	public void lock(int key) {
		if(key == getKey()) {
			locked = true;
			System.out.println("Character locked!");
		}else {
			System.out.println("Incorrect key code");
		}
	}//end lock

	@Override
	public void unlock(int key) {
		if(key == getKey()) {
			locked = false;
			System.out.println("Character unlocked!");
		}else {
			System.out.println("Incorrect key code");
		}
	}//end unlock

	@Override
	public boolean isLocked() {
		return locked;
	}//end isLocked
	
}//end class
