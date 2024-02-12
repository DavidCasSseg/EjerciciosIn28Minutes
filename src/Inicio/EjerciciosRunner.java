package Inicio;

public class EjerciciosRunner {
    public static void main(String[] args) {
        int[] array = {4,3,5,6,7};
        int[] array1 = {1,2};
        int[] array2 = {4,-2,1};

        Ejercicios ejercicio = new Ejercicios();
        Ejercicios suma = new Ejercicios(array1, array2);

        System.out.println(ejercicio.doesHaveElementGreaterThan(array,100));

        System.out.println(ejercicio.findSecondLargestElement(array));

        System.out.println(suma.areSumsEqual());

        System.out.println(ejercicio.isSorted(array));

        System.out.println(ejercicio.determineMultiples(3, 20));
    }
}
