package Inicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ejercicios {

    private int[] array1;
    private int[] array2;

    public Ejercicios(){

    }
    public Ejercicios(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        for(int item : array){

            if(item > number){
                return true;
            }

        }
        return false;
    }

    public int findSecondLargestElement(int[] array) {
        int primero = 0;
        int segundo = 0;
        if(array.length < 2){
            return -1;
        }
        for(int element : array){
            if(element < 0){
                return -1;
            }
            if(element > primero){
                segundo = primero;
                primero = element;
            } else if(element > segundo){
                segundo = element;
            } else if(element < segundo){
                segundo = element;
            }
        }
        if(primero == segundo){
            return -1;
        }
        return segundo;
    }

    public boolean areSumsEqual() {

        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        // TODO: Write the code to compare the sums of the arrays and return the result.
        return sum1 == sum2;
    }

    private int calculateSum(int[] array) {
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }

    public boolean isSorted(int[] array) {
        if(array.length <= 1){
            return true;
        }
        int temporal = array[0];

        for(int element : array){
            if(element >= temporal){
                temporal = element;
                continue;
            } else{
                return false;
            }
        }
        return true;
    }

    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> multiples = new ArrayList<>();
        int temp = number;

        if(number <= 0 || limit <= 0){
            return multiples;
        }

        while(number < limit){
            multiples.add(number);
            number += temp;
        }

        return multiples;
    }
}
