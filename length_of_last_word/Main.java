package length_of_last_word;
public class Main{
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s)); // Output: 5
    }

    //naive solution
    
    public static int lengthOfLastWord(String s) {
        String [] strings = s.split(" ");
        String lastString = strings[strings.length-1];
        return lastString.length();
    }
}