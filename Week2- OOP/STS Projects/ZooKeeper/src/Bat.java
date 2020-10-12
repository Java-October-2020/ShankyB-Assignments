public class Bat extends Mammal {
	public Bat(String species, int energyLevel) {
		super(species, energyLevel); //super ("Bat", 300)- this statement is not recognized and I had to enter variable for new bat object in ZooController class.
	}
	
	//fly() method, print the sound a bat taking off and decrease its energy by 50.
	
	
	public void fly(){
		this.energyLevel-=50;
		System.out.println("Bat is taking off");
	}
	//eatHumans() method, print the so- well, never mind, just increase its energy by 25.
	public void eatHumans(){
		this.energyLevel+=25;
		System.out.println("so-well, never mind");
	}
	
	
	//attackTown() method, print the sound of a town on fire and decrease its energy by 100.
		
	public void attackTown(){
		this.energyLevel-=100;
		System.out.println("sound of a town on fire");
	}
	
}
