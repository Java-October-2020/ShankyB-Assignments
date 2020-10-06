import java.util.ArrayList;
public class SquareArray{
    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5,6,7};
        ArrayList<Object> newArray = new ArrayList<Object>();
            for (int i=0; i<myArray.length;i++){
                int element= myArray[i];
                int squareVal= element* element;
                newArray.add(squareVal);                                
           }
        System.out.println(newArray);
    
    }
}
