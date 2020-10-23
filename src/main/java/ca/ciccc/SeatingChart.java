package ca.ciccc;

import java.util.List;

public class SeatingChart {

  /**
   * seats[r][c] represents the Student in row r and column c in the classroom.
   */
  private Student[][] seats;

  /**
   * Creates a seating chart with the given number of rows and columns from the students in {@code
   * studentList}. Empty seats in the seating chart are represented by {@code null}.
   *
   * @param studentList the list of students.
   * @param rows        the number of rows of seats in the classroom.
   * @param cols        the number of columns of seats in the classroom.
   *                    <p>
   *                    Pre-condition: rows > 0; cols > 0; rows * cols >= studentList.size();
   *                    <p>
   *                    Post-condition: - Students appear in the seating chart in the same order as
   *                    they appear in {@code studentList}, starting at {@code seats[0][0]}. -
   *                    {@code seats} is filled column by column from {@code studentList}, followed
   *                    by any empty seats (represented by {@code null}. - {@code studentList} is
   *                    unchanged.
   */
  public SeatingChart(List<Student> studentList, int rows, int cols) {
    // TODO: Your code goes here.

    // Initialize seats with rows*cols
    seats = new Student[rows][cols];

    // Scan the 2D array vertically ↓↓↓, and fill a student.
    // if no student -> fill null
    for (int i = 0; i < studentList.size(); i++) {
      seats[i % rows][i / rows] = studentList.get(i);
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
   * Pre-condition: - All students with {@code allowedAbsences} or fewer are in their original
   * positions in {@code seats}. - No student in {@code seats} has more than {@code allowedAbsences}
   * absences. - Entries without students contain {@code null}.
   */
  public int removeAbsentStudents(int allowedAbsences) {
    // TODO: your code goes here.

    //get the size of seats (2D array), rows*cols
    int rows = seats.length;
    int cols = seats[0].length;
    // Initialize the number of student removed.
    int removedStudent = 0;

    // Scan all the student and check if the student's AbsenceCount is larger than allowed.
    // If so, then remove the student and increment the count.
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        if (seats[row][col] != null && seats[row][col].getAbsenceCount() > allowedAbsences) {
          seats[row][col] = null;
          removedStudent++;
        }
      }
    }
    return removedStudent;
  }

  @Override
  public String toString() {
    String result = "";
    for (Student[] row : seats) {
      for (Student col : row) {
        result += (col != null) ? col.toString() + " " : "null ";
      }
      result += "\n";
    }
    return result;
  }
}
