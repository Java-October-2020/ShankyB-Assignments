import java.util.ArrayList;
public class ZooController {
	public static void main(String[] args) {
		Mammal marco= new Mammal("dog",80);
		Gorilla gorz= new Gorilla("Gorrilla",100);
		
		ArrayList<Mammal> animals= new ArrayList<Mammal>();
		animals.add(marco);
		animals.add(gorz);
		
		for(Mammal m:animals) {
			System.out.println(m.getSpecies());
		}
		
		gorz.climb();
		
				
	}

}
