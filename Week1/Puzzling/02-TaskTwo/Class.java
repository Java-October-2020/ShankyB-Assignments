//Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. 
//Shuffle the array and print the name of each person. 
//Have the method also return an array with names that are longer than 5 characters.
import java.util.*;
public class Class{
        public static void main(String[] args){
            ArrayList<String> Array = new ArrayList<String>();
            Array.add("Nancy");
            Array.add("Jinichi");
            Array.add("Fujibayashi");
            Array.add("Momochi");
            Array.add("Ishikawa"); 
            Collections.shuffle(Array);
            System.out.println(Array);
            System.out.println(Array.get(0));
            System.out.println(Array.get(1));
            System.out.println(Array.get(2));
            System.out.println(Array.get(3));
            System.out.println(Array.get(4));
        }
}



