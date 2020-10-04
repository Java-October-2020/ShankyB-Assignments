import java.util.ArrayList;
public class MaxMinAvg{
    public static void main(String[] args){
        int[] Array= {3,5,7,11,0};
        int max= Array[0];
        int min= Array[0];
        int sum=0;
        for(int i=0; i<Array.length;i++){
            if(max<Array[i]){
                max= Array[i]; 
            }
        }
        for(int i=0; i<Array.length;i++){ 
            sum= sum+Array[i];
            if(min>Array[i]){
                min=Array[i];
            }        
        }
    int len= Array.length;
    double avg= sum/len;
    System.out.println(max);
    System.out.println(min);
    System.out.println(avg);
    }
}
