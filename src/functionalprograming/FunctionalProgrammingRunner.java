package functionalprograming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
        List<Integer> list1 = List.of(1,20,35,4,5,64,7,8);
        printBasic(list);
        System.out.println();
        printWithFP(list);
        printBasicWhitFiltering(list);
        printWithFPWithFiltering(list);
        printOddNumbers(list1);
        System.out.println();
        System.out.println(fpSum(list1));
        System.out.println(normalSum(list1));
        sortNumbers(list1);
    }
    private static void printBasic(List<String> list) {
        for(String string : list){
            System.out.println(string);
        }
    }
    private static void printBasicWhitFiltering(List<String> list) {
        for(String string : list){
            if(string.endsWith("at")){
                System.out.println(string);
            }
        }
    }
    private static void printWithFP(List<String> list){
        list.stream().forEach(element -> System.out.println(element));
    }
    private static void printWithFPWithFiltering(List<String> list){
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element));
    }
    private static void printOddNumbers(List<Integer> list){
        list.stream().filter(element -> element%2 != 0).forEach(element -> System.out.println(element));
    }
    private static void printPairNumbers(List<Integer> list){
        list.stream().filter(element -> element%2 == 0).forEach(element -> System.out.println(element));
    }
    private static int fpSum(List<Integer> numbers){
        return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
    }
    private static int normalSum(List<Integer> numbers){
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
    private static void sortNumbers(List<Integer> numbers){
        numbers.stream().sorted().forEach(e -> System.out.println(e));
    }
}
