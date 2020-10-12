
public class Wizard extends Human{
	//Wizard class should have a default health of 50 and intelligence of 8
	public Wizard(int strength, int stealth) {
		super(strength,stealth);
		super.health=50;
		super.intelligence=8;
	}
	//heal() method
	public int heal(Human target) {
		this.intelligence+=8;
		return this.intelligence;
		
	}
	
	//fireball method
	
	public int fireball(Human target) {
		int reduction=this.intelligence*3;
		target.health-=reduction;
		return target.health;
	}
}
