import java.util.ArrayList;
public class Basics{
    public static void main(String[] args){
//exercise1
        ArrayList<Object> list = new ArrayList<Object>();
        for(int i=1; i<256;i++){
        list.add(i);
        }
        System.out.println(list);
    }
}