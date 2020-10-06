import java.util.Arrays;
public class Basics5{
    public static void main(String[] args){
        int[] Array= {-1,-3,-5,-7,-9,-13,-14};
        int max= Array[0];
        int min= Array[0];
        for(int i=0; i<Array.length;i++){
            if(max<Array[i]){
                max= Array[i];                
            }
        }
        System.out.println(max);
    }
}