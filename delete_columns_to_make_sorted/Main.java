
package delete_columns_to_make_sorted;
public class Main { 
    public static void main(String[] args) {
    int result = minDeletionSize(new String[]{"cba","daf","ghi"});
    System.out.println(result);
}


public static int minDeletionSize(String[] strs) {
        //get matrix dimensions
        Integer dimensions = strs[0].length();
        //System.out.println("dimension: " + dimensions);
        int errors = 0;

        for (int j = 0; j < dimensions; j++) {
            char column = strs[0].charAt(j);
            //System.out.println("column: " + column);
            for (int i = 1; i < strs.length; i++) {
                //System.out.println("comparing: " + column + " and: "+strs[i].charAt(j));
                char currentChar = strs[i].charAt(j);
                 if(column>currentChar)
                 {
                    //System.out.println("error");
                    errors++;
                    column = strs[0].charAt(j);
                    break;
                 }else{
                    column=currentChar;
                 }

            }

        }

        return errors;
    }
}
