package collections;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        String str = "This is an awesome occasion. "
                + "This has never happened before";

        Map<Character, Integer> ocurrances = new HashMap<>();

        char[] characters = str.toCharArray();

        for( char character : characters){
            //Get the character
            Integer integer = ocurrances.get(character);
            //if it is not there, initialize to 1
            if(integer == null){
                ocurrances.put(character, 1);
            }
            //if it is there, we increment the count
            else{
                ocurrances.put(character, integer + 1);
            }
        }
        System.out.println(ocurrances);

        Map<String, Integer> stringOcurrances = new HashMap<>();

        String[] words = str.split(" ");

        for( String word : words){
            //Get the character
            Integer integer = stringOcurrances.get(word);
            //if it is not there, initialize to 1
            if(integer == null){
                stringOcurrances.put(word, 1);
            }
            //if it is there, we increment the count
            else{
                stringOcurrances.put(word, integer + 1);
            }
        }
        System.out.println(stringOcurrances);
    }
}



