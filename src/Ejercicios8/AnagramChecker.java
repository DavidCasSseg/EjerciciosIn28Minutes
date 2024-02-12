package Ejercicios8;

import java.util.Arrays;

public class AnagramChecker {

    static class StringMagic{
        public boolean areAnagrams(String str1, String str2){
            //comparison insesitive
            //if any string is null return false
            if(str1 == null || str2 == null){
                return false;
            }
            //the method should also return false in the lengths of str1 and str2 are not the same
            if(str1.length() != str2.length()){
                return false;
            }
            //convert the strings to lower case
            //convert strings to character arrays and sort them
            char[] characters1 = str1.toLowerCase().toCharArray();
            Arrays.sort(characters1);
            char[] characters2 = str2.toLowerCase().toCharArray();
            Arrays.sort(characters2);
            //compare if they are equals
            if(Arrays.equals(characters1, characters2)){
                return true;
            }
            return false;
        }
    }
    public static void main(String[] args) {
        StringMagic anagram = new StringMagic();
        System.out.println(anagram.areAnagrams("Hello", "Olelh"));
    }
}
