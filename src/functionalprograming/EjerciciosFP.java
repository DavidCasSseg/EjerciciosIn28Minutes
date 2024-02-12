package functionalprograming;

import java.util.List;
import java.util.stream.IntStream;

public class EjerciciosFP {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Ant", "Bat");

        //Exercise - Print squares of first 10 numbers!
        //Clue - IntStream.range(1,10)
        squareOfTen();
        System.out.println();
        toLowerCase(words);
        System.out.println();
        wordLength(words);
    }
    private static void squareOfTen(){
        IntStream.range(1,10).map(number -> number * number).forEach(number -> System.out.print(number + " "));
    }
    private static void toLowerCase(List<String> words){
        words.stream().map(word -> word.toLowerCase()).forEach(word -> System.out.print(word + " "));
    }
    private static void wordLength(List<String> words){
        words.stream().map(word -> word.length()).forEach(word -> System.out.print(word + " "));
    }
}
