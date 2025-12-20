
package delete_columns_to_make_sorted;
public class Main { 
    public static void main(String[] args) {
    int result = minDeletionSize(new String[]{"cba","daf","ghi"});
    System.out.println(result);
}


public static int minDeletionSize(String[] strs) {
        //get matrix dimensions
        String initialWord = strs[0];
        int dimensions = initialWord.length();
        //System.out.println("dimension: " + dimensions);
        int errors = 0;
        
        char initialColumn = initialWord.charAt(0);
        
        if (initialColumn == 'z') {
            return strs.length;

        }

        for (int j = 0; j < dimensions; j++) {
            char column = initialWord.charAt(j);
            if (column == 'z') {
                errors++;
                continue;
            }
            //System.out.println("column: " + column);
            for (int i = 1; i < strs.length; i++) {
                //System.out.println("comparing: " + column + " and: "+strs[i].charAt(j));
                char currentChar = strs[i].charAt(j);
                if (column > currentChar) {
                    //System.out.println("error");
                    errors++;
                    column =initialWord.charAt(j);
                    break;
                } else {
                    column = currentChar;
                }

            }

        }

        return errors;
    } }
