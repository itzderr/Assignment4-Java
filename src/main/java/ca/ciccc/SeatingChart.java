package ca.ciccc;

import java.util.List;

public class SeatingChart {
    public static void main(String[] args) {
        int[][] seats = new int[0][10];
        seats[0][0] = 3;
        seats[0][1] = 1;
        seats[0][2] = 4;
        seats[0][3] = 1;
        seats[0][4] = 5;
        seats[0][5] = 9;
        seats[0][6] = 2;
        seats[0][7] = 6;
        seats[0][8] = 1;
        seats[0][9] = 3;

        for (int r = 0; r<=10; r++); {
            for (int c = 0; c<=0; c++)
            System.out.println();
        }
        for (int[] row : seats) {
            for (int seat : row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    private static void seatList() {
        String[][] seats = {{"Karen"},{"Liz"},{"Paul"},{"Lester"},{"Henry"},{"Renee"},{"Glen"},{"Fran"},{"David"},{"Danny"} };
    }

    /**
     * seats[r][c] represents the Student in row r and column c in the classroom.
     */
    private Student[][] seats;


    /**
     * Creates a seating chart with the given number of rows and columns from the
     * students in {@code studentList}. Empty seats in the seating chart are represented
     * by {@code null}.
     * @param studentList the list of students.
     * @param rows the number of rows of seats in the classroom.
     * @param cols the number of columns of seats in the classroom.
     *
     * Pre-condition: rows > 0; cols > 0;
     *               rows * cols >= studentList.size();
     *
     * Post-condition:
     *             - Students appear in the seating chart in the same order as they appear
     *               in {@code studentList}, starting at {@code seats[0][0]}.
     *             - {@code seats} is filled column by column from {@code studentList}, followed by
     *               any empty seats (represented by {@code null}.
     *             - {@code studentList} is unchanged.
     */
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        // TODO: Your code goes here.

    }

    /**
     * Removes students who have more than a given number of absences from the seating chart,
     * replacing those entries in the seating chart with {@code null} and returns the number of
     * students removed.
     *
     * @param allowedAbsences an integer >= 0
     * @return the number of students removed from {@code seats}.
     *
     * Pre-condition:
     *   - All students with {@code allowedAbsences} or fewer are in their original positions in
     *     {@code seats}.
     *   - No student in {@code seats} has more than {@code allowedAbsences} absences.
     *   - Entries without students contain {@code null}.
     */
    public int removeAbsentStudents(int allowedAbsences) {
        // TODO: your code goes here.

        return 0;
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
