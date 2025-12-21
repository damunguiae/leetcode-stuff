package index_of_first_occurrence;

public class Main {
    public static void main(String[] args) {
        int result = strStr("hello", "ll");
        System.out.println(result);
    }

    public static int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        if (needleLength > haystack.length())
            return -1;
        int i = 0;
        while ((i < haystack.length())) {
            int topPosition = i + needle.length();
            if (topPosition >= haystack.length())
                topPosition = haystack.length();

            String portion = haystack.substring(i, topPosition);
            //System.out.println("i: " + i + " topPosition: " + topPosition +
              //      " portion: " + portion + " needle: " + needle);
            if (portion.equals(needle))
                return i;
            i++;

        }
        ;

        return -1;
    }
}
