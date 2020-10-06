import java.util.Arrays;
public class Average{
    public static void main(String[] args){
        int[] Array= {-2,-1,9};
        double sum=0;
        for(int i=0; i<Array.length;i++){
            sum= sum+Array[i];
        }
        int arrayItems= Array.length;
        double average= sum/arrayItems;
        System.out.println(sum);
        System.out.println(average);
    }
}