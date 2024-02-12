package Inicio;

public class StudentRunner {
    public static void main(String[] args) {

        Student student = new Student("Ragna", 97, 98, 100);
        Student student1 = new Student("Ragna", 97, 98);
        Student student2 = new Student("Ragna", 97, 98, 90, 98);

        int number = student.getNumberOfMarks();
        System.out.println("number of marks: " + number);

        int sum = student.getTotalSumOfMarks();
        System.out.println("sum of marks: " + sum);

        int maximumMark = student.getMaximumMark();
        System.out.println("maximum marks: " + maximumMark);
    }
}
