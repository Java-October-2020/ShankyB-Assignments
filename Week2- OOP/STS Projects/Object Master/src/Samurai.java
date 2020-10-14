
public class Samurai extends Human{	

	public Samurai(int strength, Integer intelligence, int stealth) {
		super.health=300;
	}
	
	//deathblow() method
	public int deathBlow(Human target) {
		this.health/=2;
		return this.health;
	}
	
	//meditate() method
	public int meditate() {
		this.health*=1.5;
		return this.health;
	}
	
	//howMany() method

	
}
