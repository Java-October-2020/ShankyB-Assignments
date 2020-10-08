import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Puzzle{
    ArrayList<Integer> sumArray (int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }   
        System.out.Println(sum);
    }

    ArrayList<Integer> greaterThanTen (int[] arr){
        ArrayList<Integer> greaterthan10 = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>10){
                greaterthan10.add(arr[i]);
            }
        }
        return greaterthanTen;
    }

    ArrayList<String> shuffleArr(String [] str){

    }

}