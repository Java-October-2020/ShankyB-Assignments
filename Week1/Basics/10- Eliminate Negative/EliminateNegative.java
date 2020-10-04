import java.util.ArrayList;
public class EliminateNegative{
    public static void main(String[] args){
        int[] Array= {-1,3,-5,-7,9,10,0,0,8,4,13};
        ArrayList<Object> NonNegative= new ArrayList<Object>();
        for(int i=0; i<Array.length;i++){
            if(Array[i]>=0){
                NonNegative.add(Array[i]);           }

        }
        System.out.println(NonNegative);
    }
}