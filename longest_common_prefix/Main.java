import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"a","b","c"};
        System.out.println("hello world"); // Output: "fl"
        HashMap<String,Integer> map = new HashMap<>();
        for (String word:strs){
            System.out.println("scanning word: "+word);
            
            map = scanWord(word,map);
            System.out.println("current map: "+map.toString());
        }
        String highestPrefix = GetHighestPrefix(map);
        System.out.println("highest prefix so far: "+highestPrefix);
    }

    //scan word

  public static HashMap<String,Integer> scanWord(String word, HashMap<String,Integer>map){
    //traverse every character on a word
    
    String prefix ="";
    for(int i=0;i<word.length();i++){
        System.out.println("previous prefix: "+prefix);
        prefix+=word.charAt(i);
        //update the map
        int currentPrefixCount = map.getOrDefault(prefix, 0);
        System.out.println("current prefix: "+prefix);
        System.out.println("current prefix count: "+currentPrefixCount);
        // Always increment - if 0 (not found), becomes 1; otherwise increases by 1
        map.put(prefix, currentPrefixCount + 1);
    }
    return map;
}

    //sort a map by value?
       public static String GetHighestPrefix(HashMap<String,Integer>map){
        String highestKey = "";
        Integer highestValue = 0;
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > highestValue){
                highestValue = entry.getValue();
                highestKey = entry.getKey();
            }
            else if(entry.getValue() == highestValue){
                //choose the longer one
                if(entry.getKey().length() > highestKey.length()){
                    highestKey = entry.getKey();
                    highestValue = entry.getValue();
                }
            }
        }
        return highestKey;
    }
}