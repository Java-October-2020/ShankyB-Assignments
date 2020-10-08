import java.util.ArrayList;

public class PuzzleTest {
    public static void main(String[] args){
        Puzzle iD= new Puzzle();
        ArrayList<Integer> myArray= iD.Array;
        myArray= {1,2,3};
        System.out.Println(iD.getSum(myArray));
    }

}
