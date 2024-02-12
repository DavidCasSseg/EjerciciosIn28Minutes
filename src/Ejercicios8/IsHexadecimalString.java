package Ejercicios8;

import java.util.Scanner;

public class IsHexadecimalString {
    public static class MyString {

        public String str;

        public MyString(String str) {
            this.str = str;
        }

        public boolean isHexadecimalChar(char ch) {
            // Write your code here
            //return false if empty or null
            if (ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f'
                    || ch == 'A' || ch == 'B' || ch == 'C' || ch == 'D' || ch == 'E' || ch == 'F') {
                return true;
            } else
                return false;
        }


        public boolean isHexadecimal() {
            // Write your code here
            //return false if empty or null
            if(str == null){
                return false;
            }
            if (str.isEmpty()) {
                return false;
            }
            char[] elements = str.toCharArray();
            for (char element : elements) {
                if (Character.isDigit(element) || element == 'a' || element == 'b' || element == 'c' || element == 'd' || element == 'e' || element == 'f'
                        || element == 'A' || element == 'B' || element == 'C' || element == 'D' || element == 'E' || element == 'F') {
                    continue;
                } else
                    return false;
            }
            return true;
        }
    }


    public static void main(String[] args) {
        MyString prueba = new MyString("b14668ab");
        System.out.println(prueba.isHexadecimal());
        System.out.println(prueba.isHexadecimalChar('a'));
    }
}

