
public class Mammal {
	protected String species;
	protected int energyLevel;
	

//constructor
public Mammal(String species, int energyLevel) {
	this.species=species;
	this.energyLevel=energyLevel;
}


public String getSpecies() {
	return species;
}

public void setSpecies(String species) {
	this.species = species;
}

public int getEnergyLevel() {
	return energyLevel;
}

public void setEnergy(int energyLevel) {
	this.energyLevel = energyLevel;
}

public void displayEnergy() {
	System.out.printf("Energy level is %s\n", this.energyLevel);
}


}