public class StringManipulatorTest{

    //concat function call
    public static void main (String[] args){
        StringManipulator iD= new StringManipulator();
        String stringManipulatorTest= iD.stringManipulator("    Hello World   " ,  "    I know strings now!    ");
        System.out.println(stringManipulatorTest); 
        
        //indexof function call
        Integer getIndexOrNullTest= iD.getIndexOrNull("Hello World", "z");
        System.out.println(getIndexOrNullTest);

         //substring and concat function call
        String myConcatSubstring= iD.concatSubstring("Hello", 1, 3, "zzzz");
        System.out.println(myConcatSubstring);
    }    
}
