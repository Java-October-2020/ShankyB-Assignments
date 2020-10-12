
public class Ninja extends Human {
	public Ninja (int strength, int health, Integer intelligence) {
		super.stealth=10;
	}
	
	//steal() method
	public int steal(Human target) {
		target.health-=this.stealth;
		this.health= this.health+this.stealth;
		return target.health;
			
	}
	
	//runAway() method
	
	public int runAway() {
		this.health-=10;
		return this.health;
	}
}
