package initial;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class EmployeeTest {

    @Test
    public  void testEqualForTwoEmployeeWithTheSameName(){
        //Given
        Employee employeeOne = new Employee("first name", "second name", new Address("2", "", "", "", ""));
        Employee employeeTwo = new Employee("first name", "second name", new Address("3", "", "", "", ""));

        //When
        boolean isTheSame = employeeOne.equals(employeeTwo);

        //Then
        assertThat(isTheSame,is(true));
    }
}
