//Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. 
//Print the sum of all numbers in the array. 
//Also have the function return an array that only includes numbers that are greater than 10 (
//e.g. when you pass the array above, it should return an array with the values of 13,25,32)

import java.util.ArrayList;
public class PuzzleTaskOne{
    public static void main(String[] args){
        int[] Array= {3,5,1,2,7,9,8,13,25,32};
        int[] arrayOne= {3,-5,1,-2,7,9,8,13,25,32,0,-90};
        ArrayList<Integer> positiveNumArray = new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<Array.length;i++){
            sum= sum+Array[i];
        }
        
        for(int j=0;j<arrayOne.length;j++){
            if(arrayOne[j]>=0){
                positiveNumArray.add(arrayOne[j]);
            }
        }
        System.out.println(sum);
        System.out.println(positiveNumArray);
    }
}