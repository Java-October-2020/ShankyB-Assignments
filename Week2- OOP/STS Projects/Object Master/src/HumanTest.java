
public class HumanTest {

	public static void main(String[] args) {
		Human human1= new Human();
		Human human2= new Human();		
		//human1.attack(human2);
		//System.out.println(human2.getHealth());
		Wizard wizard1= new Wizard(3,4);
		Wizard wizard2= new Wizard (4,5);
		//System.out.println(wizard1.getHealth());
		//System.out.println(wizard1.heal());
		//System.out.println(wizard2.fireball(human2));		
		Ninja ninja1= new Ninja(3,4,100);		
		//System.out.println(ninja1.steal(human2));
		//System.out.println(ninja1.runAway());
		
		Samurai samu1= new Samurai(10,5,5);
		Samurai samu2= new Samurai(10,5,5);
		Samurai samu3= new Samurai(10,5,5);
		
		
		System.out.println(samu1.deathBlow(human1));
		System.out.println(samu1.meditate());
		
	}
}
