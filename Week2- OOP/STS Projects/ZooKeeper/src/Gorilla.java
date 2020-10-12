public class Gorilla extends Mammal {
			public Gorilla(String species, int energyLevel) {
				super(species,energyLevel);
			}	
			
			//throwsomething()-have it print out a message indicating that the gorilla has thrown something, 
			//as well as decrease the energy level by 5
			
			
			public void throwSomething() {
				this.energyLevel-=5;
				System.out.print("Gorilla has thrown something and energy has decreased by 5");
				}
			
			
			//eatbanana()-have it print out a message indicating the gorilla's satisfaction and increase its energy by 10
			
			public void eatBanana() {
				this.energyLevel +=10;
				System.out.print("Gorilla is satisfied and energy has increased by 10");
				}
			
			
			//climb()print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
			
			public void climb() {
				this.energyLevel-=10;
				System.out.print("Gorilla has climbed a tree and energy has decreased by 10");
				}		
			

}
