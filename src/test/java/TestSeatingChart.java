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
public class TestSeatingChart {

    public static final List<Student> STUDENT_LIST = Arrays.asList(
            new Student("Karen", 3),
            new Student("Liz", 1),
            new Student("Paul", 4),
            new Student("Lester", 1),
            new Student("Henry", 5),
            new Student("Renee", 9),
            new Student("Glen", 2),
            new Student("Fran", 6),
            new Student("David", 1),
            new Student("Danny", 3)
    );

    @Parameterized.Parameters(name = "{index}: @ca.ciccc.SeatingChart.toString()")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                    {
                        // input
                        STUDENT_LIST,

                        // output - expectedSeatingChart
                        "Karen(3) Lester(1) Glen(2) Danny(3) \nLiz(1) Henry(5) Fran(6) null \nPaul(4) Renee(9) David(1) null \n",
                    },
        });
    }

    @Parameterized.Parameter
    public List<Student> list;

    @Parameterized.Parameter(1)
    public String expectedSeatingChart;

    @Test
    public void testToString() {
        SeatingChart seatingChart = new SeatingChart(list, 3, 4);
        Assert.assertEquals(expectedSeatingChart, seatingChart.toString());
    }
}
