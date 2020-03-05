import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * You can test all tests at once.
 * Make sure you pass all test cases before submitting your assignment.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestSeatingChart.class,
        TestSeatingChartRemovedAbsentStudents.class,
})
public class TestAll { }