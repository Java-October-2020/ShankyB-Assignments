import java.util.ArrayList;
public class GreaterThanY {
        public static void main (String[] args){
            int[] myArray = {1,2,3,4,5,6,7,17,12};
            ArrayList<Integer> greaterthanY = new ArrayList<Integer>();
            int Y=7;
            for (int i=0; i<myArray.length;i++){
                    if(myArray[i]>Y){
                    greaterthanY.add(myArray[i]);
                }
            }
            System.out.println(greaterthanY);
    }
    
}