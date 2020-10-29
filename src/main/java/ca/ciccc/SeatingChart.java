package ca.ciccc;

import java.util.ArrayList;
import java.util.List;

public class SeatingChart {

    /**
     * seats[r][c] represents the Student in row r and column c in the classroom.
     */
    private Student[][] seats;
    //private List<Student> studentList;

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
         seats = new Student[rows][cols];
        //this.studentList = studentList;
        int studentIndex = 0;
        for(int i = 0; i < cols; i++){
            for(int j = 0; j < rows; j++){
                if(studentIndex < studentList.size()){
                    seats[j][i] = studentList.get(studentIndex);
                    studentIndex++;
                }
            }
        }
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
        int remove = 0; //int para iniciar a los que se van a quitar
        for(int i =0; i < seats.length; i++){ //Recorremos la longitud del array 2D para ver quién está - 1D
            for(int j = 0; j < seats.length; j++){//Recorremos la longitud del array 2D para ver quién está - 2D
                Student moreAbsences = seats[i][j]; //hay que ver quién tiene más ausencias de la clase[i][j]
                if(moreAbsences.getAbsenceCount() > allowedAbsences){ //if-->si nº de las ausencias que
                    // extraemos de la lista de ausencias es mayor que
                    // el numero de ausencias permitidas
                    seats[i][j] = null; //los asientos de clase en que el numero que se pasen
                    // de ausencias permitidas se pondrá null
                remove++;} //en el caso de que no se haya recorrido toda la clase
            }
        }
        return remove; //Devuelve remove que son los que no están porque son null al pasar de ausencias
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
