package ca.ciccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        List<Student> studentList = Arrays.asList(
                new Student("0", "Karen", 3),
                new Student("1", "Liz", 1),
                new Student("2", "Paul", 4),
                new Student("3", "Lester", 1),
                new Student("4", "Henry", 5),
                new Student("5", "Renee", 9),
                new Student("6", "Glen", 2),
                new Student("7", "Fran", 6),
                new Student("8", "David", 1),
                new Student("9", "Danny", 3)
        );
        ArrayList<Student> students = new ArrayList<Student>();
        students.addAll(studentList);
        SeatingChart seatingChart = new SeatingChart(students, 3, 4);
        System.out.println(seatingChart.toString());

    }
}
