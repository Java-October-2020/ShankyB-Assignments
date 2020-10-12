import java.lang.*;
public class Human {
	protected int strength=3;
	protected int stealth=3;
	protected int health=100;
	protected Integer intelligence=3;
		
	//constructor
	public Human(int strength, int stealth, int health, Integer intelligence) {
		this.strength=strength;
		this.stealth=stealth;
		this.health=health;
		this.intelligence=intelligence;
	}
	
	//constructor overload
	public Human() {
	}
	
	//constructor overload for Wizard class
	public Human (int stealth, int strength) {
		this.stealth=stealth;
		this.strength=strength;
	}
	
	//constructor overload for Ninja class
	
	public Human (int strength, int health, Integer intelligence) {
		this.strength=strength;
		this.health=health;
		this.intelligence=intelligence;
	}
	
	//constructor overload for Samurai class- changed order of input variable type to avoid duplicate method signature
	public Human (int strength, Integer intelligence, int stealth) {
		this.strength=strength;
		this.stealth=stealth;
		this.intelligence=intelligence;
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

	public Integer getIntelligence() {
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
