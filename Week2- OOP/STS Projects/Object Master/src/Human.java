
public class Human {
	protected int strength=3;
	protected int stealth=3;
	protected int health=100;
	protected int intelligence=3;
		
	//contructor
	public Human(int strength, int stealth, int health, int intelligence) {
		this.strength=strength;
		this.stealth=stealth;
		this.health=health;
		this.intelligence=intelligence;
	}
	
	//constructor overload
	public Human() {
	}	
	
	//getters and setters
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int attack(Human target) {
		target.health-=3;
		return target.health;
	}
	

}
