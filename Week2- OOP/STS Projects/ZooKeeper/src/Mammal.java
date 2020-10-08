
public class Mammal {
	protected String name;
	protected String species;
	protected int energyLevel;
	
//method overload
public Mammal() {
}

//constructor
public Mammal(String name, String species) {
	this.name=name;
	this.species=species;
	this.energyLevel=100;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
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

public int displayEnergyLevel() {
	System.out.printf("Energy level is %s\n", this.energyLevel);
	return energyLevel;
}


}


//method 