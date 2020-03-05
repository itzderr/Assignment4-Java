import ca.ciccc.SeatingChart;
import ca.ciccc.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class TestSeatingChartRemovedAbsentStudents {

    @Parameterized.Parameters(name = "{index}: @ca.ciccc.SeatingChart.toString()")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {
                        TestSeatingChart.STUDENT_LIST,  // input
                        4,                              // input - allowedAbsences
                        3,                              // output - removedStudents [ removeAbsentStudents(allowedAbsences) ]
                        "Karen(3) Lester(1) Glen(2) Danny(3) \n" +
                        "Liz(1) null null null \n" +
                        "Paul(4) null David(1) null \n",// output - removedSeatingChart
                },
        });
    }
    @Parameterized.Parameter public List<Student> list;
    @Parameterized.Parameter(1) public int allowedAbsences;
    @Parameterized.Parameter(2) public int removedStudents;
    @Parameterized.Parameter(3) public String removedSeatingChart;

    @Test public void testRemoveAbsentStudents() {
        SeatingChart seatingChart = new SeatingChart(list, 3, 4);
        int result = seatingChart.removeAbsentStudents(allowedAbsences);
        Assert.assertEquals(removedStudents, result);
    }
    @Test public void testRemovedSeatingChart() {
        SeatingChart seatingChart = new SeatingChart(list, 3, 4);
        seatingChart.removeAbsentStudents(allowedAbsences);
        Assert.assertEquals(removedSeatingChart, seatingChart.toString());
    }
}