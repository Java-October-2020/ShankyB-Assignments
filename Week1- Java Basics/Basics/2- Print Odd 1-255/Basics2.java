import java.util.ArrayList;
public class Basics2{
    public static void main(String[] args){
        ArrayList<Object> Oddlist = new ArrayList<Object>();
        for(int i=1; i<256;i++){
            if (i%2!=0){
                Oddlist.add(i);
            }       
        }
        System.out.println(Oddlist);
    }
}
