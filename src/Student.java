public class Student {

    private String name;
    private int[] marks;

    public Student(String name, int... marks){
        this.name = name;
        this.marks = marks;
    }

    public int getNumberOfMarks(){
        return marks.length;
    }

    public int getTotalSumOfMarks() {
        return 0;
    }

    public int getMaximumMark() {
        return 0;
    }
}
