public class StringManipulator{
    public String stringManipulator( String strA , String strB){
        String trimmedStrA= strA.trim();
        String trimmedStrB= strB.trim();
        String concated= trimmedStrA.concat(trimmedStrB);        
        return concated; //issue is the output of two strings does not have a space in between
    }
    public Integer getIndexOrNull(String input, String searchKey){
        Integer getIndexOrNull= input.indexOf(searchKey);
        return getIndexOrNull;
    }

    public String concatSubstring(String mainInput, int startIndx, int endIndx, String suffixInput){
        String slicer= mainInput.substring(startIndx,endIndx);
        String finalOutput= slicer.concat(suffixInput);
        return finalOutput;
    }
}