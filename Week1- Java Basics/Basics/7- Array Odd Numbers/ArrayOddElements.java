import java.util.ArrayList;

import java.util.ArrayList;
public class ArrayOddElements{
    public static void main(String[] args){
        int[] Array= {1,3,5,7,9,10,8,4,13};
        ArrayList<Object> OddElementArray= new ArrayList<Object>();
        for(int i=0; i<Array.length;i++){
            if(Array[i]%2==1){
                OddElementArray.add(Array[i]);
            }

        }
        System.out.println(OddElementArray);
    }
}