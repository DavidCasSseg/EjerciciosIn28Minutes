package Ejercicios8;

public class WordReverser {

    public static class StringMagic{
        public String reverseWordsInSentence(String sentence) {
            // TODO: Check if the sentence is null.
            // If the sentence is null, return "INVALID"
            if(sentence == null){
                return "INVALID";
            }
            // TODO: Check if the sentence is empty.
            // If the sentence is empty, return an empty string
            if(sentence.isEmpty()){
                return "";
            }
            // TODO: Split the sentence into words using the split method.
            // Use " " as the delimiter to match space.
            String[] arrSentences = sentence.split(" ");
            // TODO: Create a StringBuilder to hold the reversed sentence.
            String newSentence = "";
            for(String arrSentence : arrSentences){
                StringBuilder stringBuilder = new StringBuilder(arrSentence);
                newSentence = newSentence+ " " + String.valueOf(stringBuilder.reverse());
            }
            // TODO: Loop through each word in the words array.
            // TODO: For each word, create a StringBuilder and reverse the word.
            // Append the reversed word, followed by a space, to the reversed sentence.
            // TODO: After reversing all the words, trim the trailing space and return the reversed sentence.
            newSentence = newSentence.trim();
            return newSentence;
        }
    }
    public static void main(String[] args) {

        StringMagic magic = new StringMagic();
        System.out.println(magic.reverseWordsInSentence("Hello world"));
    }

    //// Initialize a StringBuilder to store the reversed sentence
    //        StringBuilder reversedSentence = new StringBuilder();
    //
    //        // Iterate over each word and reverse it
    //        for (String word : words) {
    //            StringBuilder reversedWord = new StringBuilder(word).reverse();
    //            reversedSentence.append(reversedWord).append(" ");
    //        }
    //
    //        // Trim any trailing whitespace and return the reversed sentence
    //        return reversedSentence.toString().trim();
    //    }
}
