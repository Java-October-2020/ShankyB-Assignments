import java.util.ArrayList;
public class ArrayElements{
    public static void main(String[] args){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=0; i<256;i++){
            myArray.add(i);  
        
        }
        System.out.println(myArray);
    }
}