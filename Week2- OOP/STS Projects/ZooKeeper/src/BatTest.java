
public class BatTest {
	public static void main(String[] args) {
		
		//create a new object		
		Bat worseBat= new Bat("Bat", 300);
		
		//invoke attack human method on new bat object
		worseBat.eatHumans();
		worseBat.getEnergyLevel(); //this statement is not executing
		worseBat.attackTown();
		worseBat.displayEnergy();
	}

}
