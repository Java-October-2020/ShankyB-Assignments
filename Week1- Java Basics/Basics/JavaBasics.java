import java.util.*;
public class JavaBasics {

        public void oneTo255(ArrayList<Object>){
            ArrayList<Object> list = new ArrayList<Object>();
            for(int i=1; i<256;i++){
            list.add(i);
            System.out.println(list);
        
        }
        
        public void oddOneTo255(){
            for(int i=1; i<256;i++){
                if (i%2!=0){
                    System.out.println(i);
                }
            }
        }

        public void sumOneTo255(){
            int sum=0;
            for(int i=1; i<256;i++){
            sum= sum+i;     
            }
            System.out.println(sum);
        }

        public void iterateArr(int[] arr){
            for(int i=0; i<arr.length;i++){
                System.out.println(arr[i]);
            }

        }

        public void findMaxArr(int[] arr){
            int max= arr[0];
            for(int i=0; i<arr.length;i++){
                if(max<arr[i]){
                    max= arr[i]; 
                }               
            }   
            System.out.println(max);
        }

        public void findAverage(int[] Array){
            double sum=0;
        for(int i=0; i<Array.length;i++){
            sum= sum+Array[i];
        }
        int arrayItems= Array.length;
        double average= sum/arrayItems;
        System.out.println(sum);
        System.out.println(average);
        }

        public void oddElementsArray(int[] Array){
            ArrayList<Object> OddElementArray= new ArrayList<Object>();
            for(int i=0; i<Array.length;i++){
                if(Array[i]%2==1){
                    OddElementArray.add(Array[i]);
                }
            }
            System.out.println(OddElementArray);
        }

        public int greaterThanY(int[] Array, int y){
            ArrayList<Integer> greaterthanY = new ArrayList<Integer>();
            for (int i=0; i<Array.length;i++){
                if(myArray[i]>Y){
                greaterthanY.add(myArray[i]);
                }
            }
            System.out.println(greaterthanY);
        }


}
            

        



        

    }