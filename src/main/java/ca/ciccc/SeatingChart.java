package ca.ciccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeatingChart {

    /**
     * seats[r][c] represents the Student in row r and column c in the classroom.
     */
    private Student[][] seats;

    /**
     * Creates a seating chart with the given number of rows and columns from the
     * students in {@code studentList}. Empty seats in the seating chart are represented
     * by {@code null}.
     *
     * @param studentList the list of students.
     * @param rows        the number of rows of seats in the classroom.
     * @param cols        the number of columns of seats in the classroom.
     *                    <p>
     *                    Pre-condition: rows > 0; cols > 0;
     *                    rows * cols >= studentList.size();
     *                    <p>
     *                    Post-condition:
     *                    - Students appear in the seating chart in the same order as they appear
     *                    in {@code studentList}, starting at {@code seats[0][0]}.
     *                    - {@code seats} is filled column by column from {@code studentList}, followed by
     *                    any empty seats (represented by {@code null}.
     *                    - {@code studentList} is unchanged.
     */
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        // TODO: Your code goes here.

        //Karen(3) Lester(1) Glen(2) Danny(3) \nLiz(1) Henry(5) Fran(6) null \nPaul(4) Renee(9) David(1) null \n",

        int i = 0;
        seats = new Student[rows][cols];
        if (rows > 0 && cols > 0) {
            for (int r = 0; r < seats[0].length; r++) {
                for (int c = 0; c < seats.length; c++) {
                    if (i < studentList.size()) {
                        seats[c][r] = studentList.get(i);
                        i++;
                    } else {
                        seats[c][r] = null;
                    }
                }
            }
            //System.out.println((Arrays.deepToString(seats)));

        }
    }


    /**
     * Removes students who have more than a given number of absences from the seating chart,
     * replacing those entries in the seating chart with {@code null} and returns the number of
     * students removed.
     *
     * @param allowedAbsences an integer >= 0
     * @return the number of students removed from {@code seats}.
     * <p>
     * Pre-condition:
     * - All students with {@code allowedAbsences} or fewer are in their original positions in
     * {@code seats}.
     * - No student in {@code seats} has more than {@code allowedAbsences} absences.
     * - Entries without students contain {@code null}.
     */
    public int removeAbsentStudents(int allowedAbsences) {
        // TODO: your code goes here.

        int count = 0;
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[0].length; c++)
                    if (seats[r][c] != null && seats[r][c].getAbsenceCount() > allowedAbsences){
                        seats[r][c] = null;
                        count++;
                    }
                }
        return count;
        }




    @Override
    public String toString() {
        String result = "";
        for(Student[] row: seats) {
            for(Student col: row) {
                result += (col != null) ? col.toString() + " " : "null ";
            }
            result += "\n";
        }
        return result;
    }



}
